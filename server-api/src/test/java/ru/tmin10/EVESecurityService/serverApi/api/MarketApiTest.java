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
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdOrders200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdOrdersForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdOrdersInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsGroupsInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsGroupsMarketGroupIdInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsGroupsMarketGroupIdNotFound;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsGroupsMarketGroupIdOk;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsPrices200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsPricesInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsRegionIdHistory200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsRegionIdHistoryInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsRegionIdHistoryUnprocessableEntity;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsRegionIdOrders200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsRegionIdOrdersInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsRegionIdOrdersUnprocessableEntity;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsStructuresStructureId200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsStructuresStructureIdForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.GetMarketsStructuresStructureIdInternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketApi
 */
@Ignore
public class MarketApiTest {

    private final MarketApi api = new MarketApi();

    
    /**
     * List orders from a character
     *
     * List market orders placed by a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/orders/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/orders/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/orders/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOrdersTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdOrders200Ok> response = api.getCharactersCharacterIdOrders(characterId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get item groups
     *
     * Get a list of item groups  ---  Alternate route: &#x60;/v1/markets/groups/&#x60;  Alternate route: &#x60;/legacy/markets/groups/&#x60;  Alternate route: &#x60;/dev/markets/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsGroupsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getMarketsGroups(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get item group information
     *
     * Get information on an item group  ---  Alternate route: &#x60;/v1/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/legacy/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/dev/markets/groups/{market_group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsGroupsMarketGroupIdTest() throws ApiException {
        Integer marketGroupId = null;
        String datasource = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetMarketsGroupsMarketGroupIdOk response = api.getMarketsGroupsMarketGroupId(marketGroupId, datasource, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List market prices
     *
     * Return a list of prices  ---  Alternate route: &#x60;/v1/markets/prices/&#x60;  Alternate route: &#x60;/legacy/markets/prices/&#x60;  Alternate route: &#x60;/dev/markets/prices/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsPricesTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetMarketsPrices200Ok> response = api.getMarketsPrices(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List historical market statistics in a region
     *
     * Return a list of historical market statistics for the specified type in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/history/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsRegionIdHistoryTest() throws ApiException {
        Integer regionId = null;
        Integer typeId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetMarketsRegionIdHistory200Ok> response = api.getMarketsRegionIdHistory(regionId, typeId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List orders in a region
     *
     * Return a list of orders in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/orders/&#x60;   ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsRegionIdOrdersTest() throws ApiException {
        String orderType = null;
        Integer regionId = null;
        String datasource = null;
        Integer page = null;
        Integer typeId = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetMarketsRegionIdOrders200Ok> response = api.getMarketsRegionIdOrders(orderType, regionId, datasource, page, typeId, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List orders in a structure
     *
     * Return all orders in a structure  ---  Alternate route: &#x60;/v1/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/legacy/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/markets/structures/{structure_id}/&#x60;   ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsStructuresStructureIdTest() throws ApiException {
        Long structureId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetMarketsStructuresStructureId200Ok> response = api.getMarketsStructuresStructureId(structureId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
