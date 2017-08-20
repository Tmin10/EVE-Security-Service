package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
        SSOVerifyAnswer ssoVerifyAnswer = sso.getSSOVerifyAnswer();
        ServerResponse response = new ServerResponse();
        response.getBody().put("CharacterName", ssoVerifyAnswer.getCharacterName());
        response.getBody().put("CharacterID", ssoVerifyAnswer.getCharacterID());
        response.getBody().put("CharacterOwnerHas", ssoVerifyAnswer.getCharacterOwnerHash());
        response.getBody().put("Scope", ssoVerifyAnswer.getScopes());
        return response;
    }
}
