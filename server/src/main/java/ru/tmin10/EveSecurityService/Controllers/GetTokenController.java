package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tmin10.EVESecurityService.serverApi.api.AllianceApi;
import ru.tmin10.EVESecurityService.serverApi.api.CharacterApi;
import ru.tmin10.EVESecurityService.serverApi.api.CorporationApi;
import ru.tmin10.EVESecurityService.serverApi.model.GetAlliancesAllianceIdOk;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdOk;
import ru.tmin10.EVESecurityService.serverApi.model.GetCorporationsCorporationIdOk;
import ru.tmin10.EveSecurityService.Classes.SSOVerifyAnswer;
import ru.tmin10.EveSecurityService.Classes.ServerResponse;
import ru.tmin10.EveSecurityService.Utils.Configuration.Config;
import ru.tmin10.EveSecurityService.Utils.*;

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
        characterApi.getApiClient().setAccessToken(sso.getAccessToken());
        SSOVerifyAnswer ssoVerifyAnswer = sso.getSSOVerifyAnswer();
        GetCharactersCharacterIdOk characterInfo =
                characterApi.getCharactersCharacterId(
                    ssoVerifyAnswer.getCharacterID(),
                    "", "", ""
                );
        ServerResponse response = new ServerResponse();
        response.getBody().put("CharacterID", characterInfo.getName());
        response.getBody().put("Bloodline", GameConstants.BLOODLINES.get(characterInfo.getBloodlineId()));
        response.getBody().put("Race", GameConstants.RACES.get(characterInfo.getRaceId()));

        int corporationId =  characterInfo.getCorporationId();
        int allianceId = characterInfo.getAllianceId();

        CorporationApi corporationApi = new CorporationApi();
        corporationApi.getApiClient().setAccessToken(sso.getAccessToken());
        GetCorporationsCorporationIdOk corporationInfo = corporationApi.getCorporationsCorporationId(corporationId, "", "", "");

        AllianceApi allianceApi = new AllianceApi();
        allianceApi.getApiClient().setAccessToken(sso.getAccessToken());
        GetAlliancesAllianceIdOk allianceInfo = allianceApi.getAlliancesAllianceId(allianceId, "", "", "");

        response.getBody().put("CorporationName", corporationInfo.getCorporationName());
        response.getBody().put("AllianceName", allianceInfo.getAllianceName());

        response.getBody().put("CharacterID", Integer.toString(ssoVerifyAnswer.getCharacterID()));
        database.closeConnection();
        return response;
    }
}
