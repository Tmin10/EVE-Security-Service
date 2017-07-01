package ru.tmin10.EveSecurityService.Utils.Configuration;

public class FileConfig
{
    private String client_id;
    private String scope;
    private String redirect_uri;

    public String getClient_id()
    {
        return client_id;
    }

    public String getScope()
    {
        return scope;
    }

    public String getRedirect_uri()
    {
        return redirect_uri;
    }
}
