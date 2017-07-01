package ru.tmin10.EveSecurityService.Utils.Configuration;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.springframework.stereotype.Repository;

import java.io.*;

@Repository
public class ConfigImpl implements Config
{
    private final double rand;
    private FileConfig fileConfig;

    public ConfigImpl()
    {
        this.rand = Math.random();
        Gson gson = new Gson();
        try
        {
            JsonReader reader = new JsonReader(new FileReader("config.json"));
            this.fileConfig = gson.fromJson(reader, new TypeToken<FileConfig>(){}.getType());
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public ServerConfig getServerConfig()
    {
        return null;
    }

    @Override
    public ClientConfig getClientConfig()
    {
        ClientConfig clientConfig = new ClientConfig();
        if (fileConfig != null)
        {
            clientConfig.setClient_id(fileConfig.getClient_id());
            clientConfig.setScope(fileConfig.getScope());
            clientConfig.setRedirect_uri(fileConfig.getRedirect_uri());
        }
        return clientConfig;
    }
}
