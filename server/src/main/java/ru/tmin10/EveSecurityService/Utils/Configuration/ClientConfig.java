package ru.tmin10.EveSecurityService.Utils.Configuration;

public class ClientConfig
{
    private String client_id;
    private String scope;
    private String redirect_uri;

    public String getClient_id()
    {
        return client_id;
    }

    public void setClient_id(String client_id)
    {
        this.client_id = client_id;
    }

    public String getScope()
    {
        return scope;
    }

    public void setScope(String scope)
    {
        this.scope = scope;
    }

    public String getRedirect_uri()
    {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri)
    {
        this.redirect_uri = redirect_uri;
    }
}
