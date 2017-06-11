/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.4.9.dev1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ru.tmin10.EVESecurityService.serverApi.api;

import ru.tmin10.EVESecurityService.serverApi.invoker.ApiException;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdIndustryJobs200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdIndustryJobsForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdIndustryJobsInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetIndustryFacilities200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetIndustryFacilitiesInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetIndustrySystems200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetIndustrySystemsInternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IndustryApi
 */
@Ignore
public class IndustryApiTest {

    private final IndustryApi api = new IndustryApi();

    
    /**
     * List character industry jobs
     *
     * List industry jobs placed by a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/industry/jobs/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/industry/jobs/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/industry/jobs/&#x60;   ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdIndustryJobsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        Boolean includeCompleted = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdIndustryJobs200Ok> response = api.getCharactersCharacterIdIndustryJobs(characterId, datasource, includeCompleted, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List industry facilities
     *
     * Return a list of industry facilities  ---  Alternate route: &#x60;/v1/industry/facilities/&#x60;  Alternate route: &#x60;/legacy/industry/facilities/&#x60;  Alternate route: &#x60;/dev/industry/facilities/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndustryFacilitiesTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetIndustryFacilities200Ok> response = api.getIndustryFacilities(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List solar system cost indices
     *
     * Return cost indices for solar systems  ---  Alternate route: &#x60;/v1/industry/systems/&#x60;  Alternate route: &#x60;/legacy/industry/systems/&#x60;  Alternate route: &#x60;/dev/industry/systems/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndustrySystemsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetIndustrySystems200Ok> response = api.getIndustrySystems(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
