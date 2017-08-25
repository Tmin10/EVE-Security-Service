package ru.tmin10.EveSecurityService.Classes;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

public class ServerResponse
{
    private String type = "response";
    private Map<String, Object> body = new HashMap<>();

    @NotNull
    public Map<String, Object> getBody()
    {
        return body;
    }

    @NotNull
    public String getType()
    {
        return type;
    }
}
