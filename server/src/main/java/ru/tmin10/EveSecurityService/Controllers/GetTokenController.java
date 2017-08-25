package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tmin10.EVESecurityService.serverApi.api.AllianceApi;
import ru.tmin10.EVESecurityService.serverApi.api.CharacterApi;
import ru.tmin10.EVESecurityService.serverApi.api.CorporationApi;
import ru.tmin10.EVESecurityService.serverApi.model.*;
import ru.tmin10.EveSecurityService.Classes.SSOVerifyAnswer;
import ru.tmin10.EveSecurityService.Classes.ServerResponse;
import ru.tmin10.EveSecurityService.Utils.Configuration.Config;
import ru.tmin10.EveSecurityService.Utils.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class GetTokenController
{
    private final Config config;

    @Autowired
    public GetTokenController(Config config)
    {
        this.config = config;
    }

    @CrossOrigin //TODO for development run only
    @RequestMapping("/token")
    public ServerResponse getToken(@RequestParam(value = "code") String code) throws Exception
    {
        SSO sso = new SSO(config);
        sso.setCode(code);
        ServerResponse response = new ServerResponse();
        DB database = new DB(config.getServerConfig().getJDBCConnectionString());
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
        int allianceId = characterInfo.getAllianceId();

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

        CorporationApi corporationApi = new CorporationApi();
        List<GetCorporationsNames200Ok> corporationInfo =
                corporationApi.getCorporationsNames(corpList, "tranquility", "", "");

        HashMap<Integer, String> corpIdList = new HashMap<>();
        for (GetCorporationsNames200Ok corp : corporationInfo)
        {
            corpIdList.put(corp.getCorporationId(), corp.getCorporationName());
        }

        AllianceApi allianceApi = new AllianceApi();
        GetAlliancesAllianceIdOk allianceInfo =
                allianceApi.getAlliancesAllianceId(allianceId, "tranquility", "", "");


        response.getBody().put("Corporations", corpIdList);
        response.getBody().put("History", corpHistory);
        response.getBody().put("AllianceName", allianceInfo.getAllianceName());
        response.getBody().put("CharacterID", Integer.toString(ssoVerifyAnswer.getCharacterID()));
        response.getBody().put("CorporationID", Integer.toString(corporationId));
        response.getBody().put("AllianceID", Integer.toString(allianceId));
        response.getBody().put("CharacterName", ssoVerifyAnswer.getCharacterName());
        database.closeConnection();
        return response;
    }
}
