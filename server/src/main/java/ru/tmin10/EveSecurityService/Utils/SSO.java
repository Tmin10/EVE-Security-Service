package ru.tmin10.EveSecurityService.Utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Response;
import ru.tmin10.EVESecurityService.serverApi.invoker.ApiClient;
import ru.tmin10.EveSecurityService.Classes.SSOVerifyAnswer;
import ru.tmin10.EveSecurityService.Utils.Configuration.Config;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.HashMap;

public class SSO
{
    private String code;
    private Config config;
    private String accessToken;
    private String refreshToken;
    private long expiresTime;

    private static final String BASE_PATH = "https://login.eveonline.com";

    public SSO(@NotNull Config config)
    {
        this.config = config;
    }

    public void setCode(@NotNull String code) throws Exception
    {
        this.code = code;
        getAccessTokenFromServer();
    }

    public void setRefreshToken(@NotNull String refreshToken) throws Exception
    {
        this.refreshToken = refreshToken;
        refreshAccessToken();
    }

    @Nullable
    public String getRefreshToken()
    {
        return refreshToken;
    }

    @Nullable
    public String getAccessToken() throws Exception
    {
        if (code != null && accessToken == null)
        {
            getAccessTokenFromServer();
        }
        if (refreshToken != null && expiresTime < getUnixTime())
        {
            refreshAccessToken();
        }
        return accessToken;
    }

    public SSOVerifyAnswer getSSOVerifyAnswer() throws Exception
    {
        ApiClient client = new ApiClient();
        client.setBasePath("https://login.eveonline.com");
        client.setAccessToken(getAccessToken());

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
        Gson gson = new Gson();
        return gson.fromJson(respBody, SSOVerifyAnswer.class);
    }

    private void refreshAccessToken() throws Exception
    {
        JsonObject jsonBody = new JsonObject();
        jsonBody.addProperty("grant_type", "refresh_token");
        jsonBody.addProperty("refresh_token", refreshToken);
        doServerRequest(jsonBody);
    }

    private void getAccessTokenFromServer() throws Exception
    {
        JsonObject jsonBody = new JsonObject();
        jsonBody.addProperty("grant_type", "authorization_code");
        jsonBody.addProperty("code", code);
        doServerRequest(jsonBody);
    }

    private void doServerRequest(@NotNull JsonObject jsonBody) throws Exception
    {
        ApiClient client = new ApiClient();
        client.setBasePath(BASE_PATH);
        client.setUsername(config.getClientConfig().getClient_id());
        client.setPassword(config.getServerConfig().getClient_secret());
        Call call = client.buildCall("/oauth/token",
                "POST",
                null,
                jsonBody,
                new HashMap<String, String>(),
                null,
                new String[]{"basic"},
                null);
        Response response = call.execute();
        Gson gson = new Gson();
        String respBody = response.body().string();
        JsonObject body = gson.fromJson(respBody, JsonObject.class);
        if (body.has("error"))
        {
            throw new Exception( body.get("error").getAsString() + ": "+body.get("error_description").getAsString());
        }
        accessToken = body.get("access_token").getAsString();
        refreshToken = body.get("refresh_token").getAsString();
        expiresTime = getUnixTime() + Long.valueOf(body.get("expires_in").toString());
    }

    private long getUnixTime()
    {
        return System.currentTimeMillis() / 1000L;
    }
}
