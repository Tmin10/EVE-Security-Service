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

import { Inject, Injectable, Optional }                      from '@angular/core';
import { Http, Headers, URLSearchParams }                    from '@angular/http';
import { RequestMethod, RequestOptions, RequestOptionsArgs } from '@angular/http';
import { Response, ResponseContentType }                     from '@angular/http';

import { Observable }                                        from 'rxjs/Observable';
import 'rxjs/add/operator/map';

import * as models                                           from '../model/models';
import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


@Injectable()
export class BookmarksApi {
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
     * List bookmarks
     * List your character&#39;s personal bookmarks  ---  Alternate route: &#x60;/v1/characters/{character_id}/bookmarks/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/bookmarks/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/bookmarks/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param token Access token to use, if preferred over a header
     * @param userAgent Client identifier, takes precedence over headers
     * @param xUserAgent Client identifier, takes precedence over User-Agent
     */
    public getCharactersCharacterIdBookmarks(characterId: number, datasource?: string, token?: string, userAgent?: string, xUserAgent?: string, extraHttpRequestParams?: any): Observable<Array<models.GetCharactersCharacterIdBookmarks200Ok>> {
        return this.getCharactersCharacterIdBookmarksWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * List bookmark folders
     * List your character&#39;s personal bookmark folders  ---  Alternate route: &#x60;/v1/characters/{character_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/bookmarks/folders/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param token Access token to use, if preferred over a header
     * @param userAgent Client identifier, takes precedence over headers
     * @param xUserAgent Client identifier, takes precedence over User-Agent
     */
    public getCharactersCharacterIdBookmarksFolders(characterId: number, datasource?: string, token?: string, userAgent?: string, xUserAgent?: string, extraHttpRequestParams?: any): Observable<Array<models.GetCharactersCharacterIdBookmarksFolders200Ok>> {
        return this.getCharactersCharacterIdBookmarksFoldersWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }


    /**
     * List bookmarks
     * List your character&#39;s personal bookmarks  ---  Alternate route: &#x60;/v1/characters/{character_id}/bookmarks/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/bookmarks/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/bookmarks/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param token Access token to use, if preferred over a header
     * @param userAgent Client identifier, takes precedence over headers
     * @param xUserAgent Client identifier, takes precedence over User-Agent
     */
    public getCharactersCharacterIdBookmarksWithHttpInfo(characterId: number, datasource?: string, token?: string, userAgent?: string, xUserAgent?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/characters/${character_id}/bookmarks/`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'characterId' is not null or undefined
        if (characterId === null || characterId === undefined) {
            throw new Error('Required parameter characterId was null or undefined when calling getCharactersCharacterIdBookmarks.');
        }
        if (datasource !== undefined) {
            if(datasource instanceof Date) {
                queryParameters.set('datasource', <any>datasource.d.toISOString());
            } else {
                queryParameters.set('datasource', <any>datasource);
            }
        }

        if (token !== undefined) {
            if(token instanceof Date) {
                queryParameters.set('token', <any>token.d.toISOString());
            } else {
                queryParameters.set('token', <any>token);
            }
        }

        if (userAgent !== undefined) {
            if(userAgent instanceof Date) {
                queryParameters.set('user_agent', <any>userAgent.d.toISOString());
            } else {
                queryParameters.set('user_agent', <any>userAgent);
            }
        }

        headers.set('X-User-Agent', String(xUserAgent));

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
            search: queryParameters
        });

        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = (<any>Object).assign(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

    /**
     * List bookmark folders
     * List your character&#39;s personal bookmark folders  ---  Alternate route: &#x60;/v1/characters/{character_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/bookmarks/folders/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param token Access token to use, if preferred over a header
     * @param userAgent Client identifier, takes precedence over headers
     * @param xUserAgent Client identifier, takes precedence over User-Agent
     */
    public getCharactersCharacterIdBookmarksFoldersWithHttpInfo(characterId: number, datasource?: string, token?: string, userAgent?: string, xUserAgent?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/characters/${character_id}/bookmarks/folders/`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'characterId' is not null or undefined
        if (characterId === null || characterId === undefined) {
            throw new Error('Required parameter characterId was null or undefined when calling getCharactersCharacterIdBookmarksFolders.');
        }
        if (datasource !== undefined) {
            if(datasource instanceof Date) {
                queryParameters.set('datasource', <any>datasource.d.toISOString());
            } else {
                queryParameters.set('datasource', <any>datasource);
            }
        }

        if (token !== undefined) {
            if(token instanceof Date) {
                queryParameters.set('token', <any>token.d.toISOString());
            } else {
                queryParameters.set('token', <any>token);
            }
        }

        if (userAgent !== undefined) {
            if(userAgent instanceof Date) {
                queryParameters.set('user_agent', <any>userAgent.d.toISOString());
            } else {
                queryParameters.set('user_agent', <any>userAgent);
            }
        }

        headers.set('X-User-Agent', String(xUserAgent));

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
            search: queryParameters
        });

        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = (<any>Object).assign(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

}
