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
import ru.tmin10.EVESecurityService.serverApi.model.DeleteCharactersCharacterIdContactsForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.DeleteCharactersCharacterIdContactsInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdContacts200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdContactsForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdContactsInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdContactsLabels200Ok;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdContactsLabelsForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.GetCharactersCharacterIdContactsLabelsInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.PostCharactersCharacterIdContactsForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.PostCharactersCharacterIdContactsInternalServerError;
import ru.tmin10.EVESecurityService.serverApi.model.PutCharactersCharacterIdContactsForbidden;
import ru.tmin10.EVESecurityService.serverApi.model.PutCharactersCharacterIdContactsInternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Ignore
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Delete contacts
     *
     * Bulk delete contacts  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.deleteCharactersCharacterIdContacts(characterId, contactIds, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get contacts
     *
     * Return contacts of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdContacts200Ok> response = api.getCharactersCharacterIdContacts(characterId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get contact labels
     *
     * Return custom labels for contacts the character defined  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;   ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContactsLabelsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdContactsLabels200Ok> response = api.getCharactersCharacterIdContactsLabels(characterId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Add contacts
     *
     * Bulk add contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        Float standing = null;
        String datasource = null;
        Long labelId = null;
        String token = null;
        String userAgent = null;
        Boolean watched = null;
        String xUserAgent = null;
        List<Integer> response = api.postCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Edit contacts
     *
     * Bulk edit contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        Float standing = null;
        String datasource = null;
        Long labelId = null;
        String token = null;
        String userAgent = null;
        Boolean watched = null;
        String xUserAgent = null;
        api.putCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent);

        // TODO: test validations
    }
    
}
