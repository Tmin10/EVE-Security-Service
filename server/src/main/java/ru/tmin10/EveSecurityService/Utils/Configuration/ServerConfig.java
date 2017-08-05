package ru.tmin10.EveSecurityService.Utils.Configuration;

import javax.validation.constraints.NotNull;

public class ServerConfig
{
    private final String dbHost;
    private final String dbPort;
    private final String dbName;
    private final String dbUser;
    private final String dbPassword;
    private final String dbSchema;
    private final String client_secret;

    public ServerConfig(String client_secret, String dbHost, String dbPort, String dbName, String dbUser, String dbPassword, String dbSchema)
    {
        this.dbHost = dbHost;
        this.dbPort = dbPort;
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbSchema = dbSchema;
        this.client_secret = client_secret;

    }

    @NotNull
    public String getJDBCConnectionString()
    {
        StringBuilder result = new StringBuilder("jdbc:postgresql://");
        result.append(dbHost).append(":").append(dbPort).append("/");
        result.append(dbName).append("?user=").append(dbUser).append("&password=");
        result.append(dbPassword).append("&currentSchema=").append(dbSchema);
        return result.toString();
    }

    public String getClient_secret()
    {
        return client_secret;
    }
}
