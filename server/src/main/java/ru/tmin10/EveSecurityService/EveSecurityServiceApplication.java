package ru.tmin10.EveSecurityService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class EveSecurityServiceApplication
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("config.json");
        if (f.exists() && f.isFile())
        {
            SpringApplication.run(EveSecurityServiceApplication.class, args);
        }
        else
        {
            throw new Exception("config.json not found. Try to create it.");
        }
    }
}
