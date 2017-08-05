package ru.tmin10.EveSecurityService.Utils.Configuration;

import javax.validation.constraints.NotNull;

public class ClientConfig
{
    private final String client_id;
    private final String scope;
    private final String redirect_uri;

    public ClientConfig(@NotNull String client_id, @NotNull String scope, @NotNull String redirect_uri)
    {
        this.client_id = client_id;
        this.scope = scope;
        this.redirect_uri = redirect_uri;
    }

    @NotNull
    public String getClient_id()
    {
        return client_id;
    }

    @NotNull
    public String getScope()
    {
        return scope;
    }

    @NotNull
    public String getRedirect_uri()
    {
        return redirect_uri;
    }

}
