package ru.tmin10.EveSecurityService.Utils.Configuration;

public class FileConfig
{
    private String client_id;
    private String scope;
    private String redirect_uri;
    private String client_secret;
    private String dbHost;
    private String dbPort;
    private String dbName;
    private String dbUser;
    private String dbPassword;
    private String dbSchema;

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

    public String getClient_secret()
    {
        return client_secret;
    }

    public String getDbHost()
    {
        return dbHost;
    }

    public String getDbPort()
    {
        return dbPort;
    }

    public String getDbName()
    {
        return dbName;
    }

    public String getDbUser()
    {
        return dbUser;
    }

    public String getDbPassword()
    {
        return dbPassword;
    }

    public String getDbSchema()
    {
        return dbSchema;
    }
}
