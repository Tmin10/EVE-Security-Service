/**
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

/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { Http, Headers, URLSearchParams }                    from '@angular/http';
import { RequestMethod, RequestOptions, RequestOptionsArgs } from '@angular/http';
import { Response, ResponseContentType }                     from '@angular/http';

import { Observable }                                        from 'rxjs/Observable';
import 'rxjs/add/operator/map';

import * as models                                           from '../model/models';
import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class KillmailsApi {

    protected basePath = 'https://esi.tech.ccp.is/latest';
    public defaultHeaders: Headers = new Headers();
    public configuration: Configuration = new Configuration();

    constructor(protected http: Http, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
    }

    /**
     * List kills and losses
     * Return a list of character&#39;s recent kills and losses  ---  Alternate route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param maxCount How many killmails to return at maximum
     * @param maxKillId Only return killmails with ID smaller than this. 
     * @param token Access token to use, if preferred over a header
     * @param userAgent Client identifier, takes precedence over headers
     * @param xUserAgent Client identifier, takes precedence over User-Agent
     */
    public getCharactersCharacterIdKillmailsRecent(characterId: number, datasource?: string, maxCount?: number, maxKillId?: number, token?: string, userAgent?: string, xUserAgent?: string, extraHttpRequestParams?: any): Observable<Array<models.GetCharactersCharacterIdKillmailsRecent200Ok>> {
        return this.getCharactersCharacterIdKillmailsRecentWithHttpInfo(characterId, datasource, maxCount, maxKillId, token, userAgent, xUserAgent, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json() || {};
                }
            });
    }

    /**
     * Get a single killmail
     * Return a single killmail from its ID and hash  ---  Alternate route: &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/legacy/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param killmailHash The killmail hash for verification
     * @param killmailId The killmail ID to be queried
     * @param datasource The server name you would like data from
     * @param userAgent Client identifier, takes precedence over headers
     * @param xUserAgent Client identifier, takes precedence over User-Agent
     */
    public getKillmailsKillmailIdKillmailHash(killmailHash: string, killmailId: number, datasource?: string, userAgent?: string, xUserAgent?: string, extraHttpRequestParams?: any): Observable<models.GetKillmailsKillmailIdKillmailHashOk> {
        return this.getKillmailsKillmailIdKillmailHashWithHttpInfo(killmailHash, killmailId, datasource, userAgent, xUserAgent, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json() || {};
                }
            });
    }


    /**
     * List kills and losses
     * Return a list of character&#39;s recent kills and losses  ---  Alternate route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param maxCount How many killmails to return at maximum
     * @param maxKillId Only return killmails with ID smaller than this. 
     * @param token Access token to use, if preferred over a header
     * @param userAgent Client identifier, takes precedence over headers
     * @param xUserAgent Client identifier, takes precedence over User-Agent
     */
    public getCharactersCharacterIdKillmailsRecentWithHttpInfo(characterId: number, datasource?: string, maxCount?: number, maxKillId?: number, token?: string, userAgent?: string, xUserAgent?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + '/characters/${character_id}/killmails/recent/'
                    .replace('${' + 'character_id' + '}', String(characterId));

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'characterId' is not null or undefined
        if (characterId === null || characterId === undefined) {
            throw new Error('Required parameter characterId was null or undefined when calling getCharactersCharacterIdKillmailsRecent.');
        }
        if (datasource !== undefined) {
            queryParameters.set('datasource', <any>datasource);
        }

        if (maxCount !== undefined) {
            queryParameters.set('max_count', <any>maxCount);
        }

        if (maxKillId !== undefined) {
            queryParameters.set('max_kill_id', <any>maxKillId);
        }

        if (token !== undefined) {
            queryParameters.set('token', <any>token);
        }

        if (userAgent !== undefined) {
            queryParameters.set('user_agent', <any>userAgent);
        }

        if (xUserAgent !== undefined && xUserAgent !== null) {
            headers.set('X-User-Agent', String(xUserAgent));
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (evesso) required
        // oauth required
        if (this.configuration.accessToken) {
            let accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers.set('Authorization', 'Bearer ' + accessToken);
        }

        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Get,
            headers: headers,
            search: queryParameters,
            withCredentials:this.configuration.withCredentials
        });
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = (<any>Object).assign(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

    /**
     * Get a single killmail
     * Return a single killmail from its ID and hash  ---  Alternate route: &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/legacy/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param killmailHash The killmail hash for verification
     * @param killmailId The killmail ID to be queried
     * @param datasource The server name you would like data from
     * @param userAgent Client identifier, takes precedence over headers
     * @param xUserAgent Client identifier, takes precedence over User-Agent
     */
    public getKillmailsKillmailIdKillmailHashWithHttpInfo(killmailHash: string, killmailId: number, datasource?: string, userAgent?: string, xUserAgent?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + '/killmails/${killmail_id}/${killmail_hash}/'
                    .replace('${' + 'killmail_hash' + '}', String(killmailHash))
                    .replace('${' + 'killmail_id' + '}', String(killmailId));

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'killmailHash' is not null or undefined
        if (killmailHash === null || killmailHash === undefined) {
            throw new Error('Required parameter killmailHash was null or undefined when calling getKillmailsKillmailIdKillmailHash.');
        }
        // verify required parameter 'killmailId' is not null or undefined
        if (killmailId === null || killmailId === undefined) {
            throw new Error('Required parameter killmailId was null or undefined when calling getKillmailsKillmailIdKillmailHash.');
        }
        if (datasource !== undefined) {
            queryParameters.set('datasource', <any>datasource);
        }

        if (userAgent !== undefined) {
            queryParameters.set('user_agent', <any>userAgent);
        }

        if (xUserAgent !== undefined && xUserAgent !== null) {
            headers.set('X-User-Agent', String(xUserAgent));
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Get,
            headers: headers,
            search: queryParameters,
            withCredentials:this.configuration.withCredentials
        });
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = (<any>Object).assign(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

}
