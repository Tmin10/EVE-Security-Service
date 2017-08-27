package ru.tmin10.EveSecurityService.Utils;

import org.springframework.stereotype.Service;
import ru.tmin10.EVESecurityService.serverApi.api.AllianceApi;
import ru.tmin10.EVESecurityService.serverApi.api.CorporationApi;
import ru.tmin10.EVESecurityService.serverApi.invoker.ApiException;
import ru.tmin10.EVESecurityService.serverApi.model.GetAlliancesNames200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetCorporationsNames200Ok;

import javax.annotation.Nonnull;
import java.util.*;

@Service
public class GamePublicData
{
    private Map<Long, String> corporationNames;
    private Map<Long, String> allianceNames;

    public GamePublicData()
    {
        corporationNames = new HashMap<>();
        allianceNames = new HashMap<>();
    }

    @Nonnull
    public String getCorporationName(long corporationId) throws ApiException
    {
        if (corporationNames.containsKey(corporationId))
        {
            return corporationNames.get(corporationId);
        }
        else
        {
            return getCorporationNamesFromServer(Arrays.asList(corporationId)).get(corporationId);
        }
    }

    @Nonnull
    public Map<Long, String> getCorporationNames(@Nonnull List<Long> corporationIds) throws ApiException
    {
        Map<Long, String> result = new HashMap<>();
        for (long corporationId : corporationIds)
        {
            if (corporationNames.containsKey(corporationId))
            {
                result.put(corporationId, corporationNames.get(corporationId));
            }
        }
        if (result.size() == corporationIds.size())
        {
            return result;
        }
        List<Long> needToGet = new ArrayList<>();
        for (long corporationId : corporationIds)
        {
            if (!corporationNames.containsKey(corporationId))
            {
                needToGet.add(corporationId);
            }
        }
        result.putAll(getCorporationNamesFromServer(needToGet));
        return result;
    }

    @Nonnull
    private Map<Long, String> getCorporationNamesFromServer(@Nonnull List<Long> corporationIds) throws ApiException
    {
        CorporationApi corporationApi = new CorporationApi();
        List<GetCorporationsNames200Ok> corporationNames = corporationApi.getCorporationsNames(corporationIds, "tranquility", "", "");
        Map<Long, String> result = new HashMap<>();
        for (GetCorporationsNames200Ok corporationName : corporationNames)
        {
            result.put(corporationName.getCorporationId().longValue(), corporationName.getCorporationName());
        }
        return result;
    }

    @Nonnull
    public String getAllianceName(long allianceId) throws ApiException
    {
        if (allianceNames.containsKey(allianceId))
        {
            return allianceNames.get(allianceId);
        }
        else
        {
            return getAllianceNamesFromServer(Arrays.asList(allianceId)).get(allianceId);
        }
    }

    @Nonnull
    public Map<Long, String> getAllianceNames(@Nonnull List<Long> allianceIds) throws ApiException
    {
        Map<Long, String> result = new HashMap<>();
        for (long allianceId : allianceIds)
        {
            if (allianceNames.containsKey(allianceId))
            {
                result.put(allianceId, allianceNames.get(allianceId));
            }
        }
        if (result.size() == allianceIds.size())
        {
            return result;
        }
        List<Long> needToGet = new ArrayList<>();
        for (long allianceId : allianceIds)
        {
            if (!allianceNames.containsKey(allianceId))
            {
                needToGet.add(allianceId);
            }
        }
        result.putAll(getAllianceNamesFromServer(needToGet));
        return result;
    }

    @Nonnull
    private Map<Long, String> getAllianceNamesFromServer(@Nonnull List<Long> allianceIds) throws ApiException
    {
        AllianceApi allianceApi = new AllianceApi();
        List<GetAlliancesNames200Ok> alliancesNames = allianceApi.getAlliancesNames(allianceIds, "tranquility", "", "");
        Map<Long, String> result = new HashMap<>();
        for (GetAlliancesNames200Ok alliancesName : alliancesNames)
        {
            result.put(alliancesName.getAllianceId().longValue(), alliancesName.getAllianceName());
        }
        return result;
    }
}
