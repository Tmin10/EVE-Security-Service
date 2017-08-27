package ru.tmin10.EveSecurityService.Utils.Configuration;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.tmin10.EveSecurityService.EveSecurityServiceApplication;

import javax.validation.constraints.NotNull;
import java.io.*;

@Service
public class ConfigImpl implements Config
{
    private FileConfig fileConfig;
    private ClientConfig clientConfig = null;
    private ServerConfig serverConfig = null;

    public ConfigImpl()
    {
        Gson gson = new Gson();
        try
        {
            JsonReader reader = new JsonReader(new FileReader(getConfigPath()));
            this.fileConfig = gson.fromJson(reader, new TypeToken<FileConfig>(){}.getType());
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    @NotNull
    public ServerConfig getServerConfig()
    {
        if (serverConfig != null)
        {
            return serverConfig;
        }
        if (fileConfig != null)
        {
            serverConfig = new ServerConfig(
                    fileConfig.getClient_secret(),
                    fileConfig.getDbHost(),
                    fileConfig.getDbPort(),
                    fileConfig.getDbName(),
                    fileConfig.getDbUser(),
                    fileConfig.getDbPassword(),
                    fileConfig.getDbSchema()
                    );
        }
        return serverConfig;
    }

    @Override
    @NotNull
    public ClientConfig getClientConfig()
    {
        if (clientConfig != null)
        {
            return clientConfig;
        }
        if (fileConfig != null)
        {
            clientConfig = new ClientConfig(fileConfig.getClient_id(), fileConfig.getScope(), fileConfig.getRedirect_uri());
        }
        return clientConfig;
    }

    @NotNull
    public static String getConfigPath()
    {
        String path = EveSecurityServiceApplication.class.getProtectionDomain().getCodeSource().getLocation().toString();
        int location = path.indexOf("!");
        if (location != -1)
        {
            //jar file
            path = path.substring(path.indexOf("file:") + 5, path.indexOf("!"));
            path = path.substring(0, path.lastIndexOf("/") + 1);
        }
        else
        {
            //class
            path = path.substring(path.indexOf("file:") + 6, path.indexOf("target"));
        }
        return path + "config.json";
    }
}
