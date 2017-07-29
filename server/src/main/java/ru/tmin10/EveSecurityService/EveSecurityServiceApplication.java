package ru.tmin10.EveSecurityService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.tmin10.EveSecurityService.Utils.Configuration.ConfigImpl;

import java.io.File;

@SpringBootApplication
public class EveSecurityServiceApplication
{
    public static void main(String[] args) throws Exception
    {
        File f = new File(ConfigImpl.getConfigPath());
        if (f.exists() && f.isFile())
        {
            SpringApplication.run(EveSecurityServiceApplication.class, args);
        }
        else
        {
            throw new Exception(ConfigImpl.getConfigPath()+" not found. Try to create it.");
        }
    }
}