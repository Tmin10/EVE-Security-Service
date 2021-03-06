package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tmin10.EveSecurityService.Utils.Configuration.ClientConfig;
import ru.tmin10.EveSecurityService.Utils.Configuration.Config;

import javax.validation.constraints.NotNull;

@RestController
public class ConfigController
{
    private final Config config;

    @Autowired
    public ConfigController(Config config)
    {
        this.config = config;
    }

    @RequestMapping("/config")
    @CrossOrigin //TODO for development run only
    @NotNull
    public ClientConfig getConfiguration()
    {
        return config.getClientConfig();
    }
}
