package ru.tmin10.EveSecurityService.Controllers;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tmin10.EVESecurityService.serverApi.invoker.ApiClient;
import ru.tmin10.EveSecurityService.Classes.ServerResponse;
import ru.tmin10.EveSecurityService.Utils.Configuration.Config;
import ru.tmin10.EveSecurityService.Utils.SSO;

import java.util.HashMap;

@RestController
public class GetTokenController
{
    private final Config config;

    @Autowired
    public GetTokenController(Config config)
    {
        this.config = config;
    }

    @RequestMapping("/token")
    public ServerResponse getToken(@RequestParam(value="code") String code) throws Exception
    {
        SSO sso = new SSO(config);
        sso.setCode(code);
        ServerResponse response = new ServerResponse();
//        response.getBody().put("accessToken", sso.getAccessToken());
//        response.getBody().put("refreshToken",  sso.getRefreshToken());

        ApiClient client = new ApiClient();
        client.setBasePath("https://login.eveonline.com");
        client.setAccessToken(sso.getAccessToken());

        Call call = client.buildCall("/oauth/verify",
                "GET",
                null,
                null,
                new HashMap<String, String>(),
                null,
                new String[]{"evesso"},
                null);
        Response serverResponse = call.execute();
        String respBody = serverResponse.body().string();
        response.getBody().put("text", respBody);
        return response;
    }
}
