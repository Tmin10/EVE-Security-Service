package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tmin10.EVESecurityService.serverApi.api.CharacterApi;
import ru.tmin10.EVESecurityService.serverApi.model.*;
import ru.tmin10.EveSecurityService.Classes.SSOVerifyAnswer;
import ru.tmin10.EveSecurityService.Classes.ServerResponse;
import ru.tmin10.EveSecurityService.Utils.Configuration.Config;
import ru.tmin10.EveSecurityService.Utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class GetTokenController
{
    private final Config config;
    private final GamePublicData gamePublicData;

    @Autowired
    public GetTokenController(Config config, GamePublicData gamePublicData)
    {
        this.config = config;
        this.gamePublicData = gamePublicData;
    }

    @CrossOrigin //TODO for development run only
    @RequestMapping("/token")
    public ServerResponse getToken(@RequestParam(value = "code") String code) throws Exception
    {
        SSO sso = new SSO(config);
        sso.setCode(code);
        ServerResponse response = new ServerResponse();
        DB database = new DB(config.getServerConfig().getJDBCConnectionString());
        if (sso.getRefreshToken() == null)
        {
            throw new Exception("No refresh token.");
        }
        String clientToken = database.getClientToken(sso.getRefreshToken());
        response.getBody().put("token", clientToken);
        database.closeConnection();
        return response;
    }

    @CrossOrigin //TODO for development run only
    @RequestMapping("/character")
    public ServerResponse getCharacter(@RequestParam(value = "token") String token) throws Exception
    {
        DB database = new DB(config.getServerConfig().getJDBCConnectionString());
        String refreshToken = database.getRefreshToken(token);
        SSO sso = new SSO(config);
        sso.setRefreshToken(refreshToken);

        CharacterApi characterApi = new CharacterApi();
        SSOVerifyAnswer ssoVerifyAnswer = sso.getSSOVerifyAnswer();
        GetCharactersCharacterIdOk characterInfo =
                characterApi.getCharactersCharacterId(ssoVerifyAnswer.getCharacterID(),"tranquility", "", "");
        ServerResponse response = new ServerResponse();
        response.getBody().put("CharacterID", characterInfo.getName());
        response.getBody().put("Bloodline", GameConstants.BLOODLINES.get(characterInfo.getBloodlineId()));
        response.getBody().put("Race", GameConstants.RACES.get(characterInfo.getRaceId()));

        int corporationId =  characterInfo.getCorporationId();
        Integer allianceId = characterInfo.getAllianceId();

        List<GetCharactersCharacterIdCorporationhistory200Ok> corpHistory =
                characterApi.getCharactersCharacterIdCorporationhistory(
                        ssoVerifyAnswer.getCharacterID(),"tranquility", "", ""
                );

        ArrayList<Long> corpList = new ArrayList<>();
        for (GetCharactersCharacterIdCorporationhistory200Ok corp : corpHistory)
        {
            corpList.add(corp.getCorporationId().longValue());
        }
        corpList.add(((Integer) corporationId).longValue());

        Map<Long, String> corpIdList = gamePublicData.getCorporationNames(corpList);

        response.getBody().put("Corporations", corpIdList);
        response.getBody().put("History", corpHistory);
        if (allianceId != null)
        {
            response.getBody().put("AllianceName", gamePublicData.getAllianceName(allianceId.longValue()));
            response.getBody().put("AllianceID", allianceId.toString());
        }
        response.getBody().put("CharacterID", Integer.toString(ssoVerifyAnswer.getCharacterID()));
        response.getBody().put("CorporationID", Integer.toString(corporationId));
        response.getBody().put("CharacterName", ssoVerifyAnswer.getCharacterName());
        database.closeConnection();
        return response;
    }
}
