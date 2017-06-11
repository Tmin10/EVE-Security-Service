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
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdOpportunities200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdOpportunitiesForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdOpportunitiesInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetOpportunitiesGroupsGroupIdInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetOpportunitiesGroupsGroupIdOk;
import ru.tmin10.EVESecurityService.serverApi.model.GetOpportunitiesGroupsInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetOpportunitiesTasksInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetOpportunitiesTasksTaskIdInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetOpportunitiesTasksTaskIdOk;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpportunitiesApi
 */
@Ignore
public class OpportunitiesApiTest {

    private final OpportunitiesApi api = new OpportunitiesApi();

    
    /**
     * Get a character&#39;s completed tasks
     *
     * Return a list of tasks finished by a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/opportunities/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOpportunitiesTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdOpportunities200Ok> response = api.getCharactersCharacterIdOpportunities(characterId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get opportunities groups
     *
     * Return a list of opportunities groups  ---  Alternate route: &#x60;/v1/opportunities/groups/&#x60;  Alternate route: &#x60;/legacy/opportunities/groups/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesGroupsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getOpportunitiesGroups(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get opportunities group
     *
     * Return information of an opportunities group  ---  Alternate route: &#x60;/v1/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/legacy/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/{group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesGroupsGroupIdTest() throws ApiException {
        Integer groupId = null;
        String datasource = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetOpportunitiesGroupsGroupIdOk response = api.getOpportunitiesGroupsGroupId(groupId, datasource, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get opportunities tasks
     *
     * Return a list of opportunities tasks  ---  Alternate route: &#x60;/v1/opportunities/tasks/&#x60;  Alternate route: &#x60;/legacy/opportunities/tasks/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesTasksTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getOpportunitiesTasks(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get opportunities task
     *
     * Return information of an opportunities task  ---  Alternate route: &#x60;/v1/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/legacy/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/{task_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesTasksTaskIdTest() throws ApiException {
        Integer taskId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetOpportunitiesTasksTaskIdOk response = api.getOpportunitiesTasksTaskId(taskId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
