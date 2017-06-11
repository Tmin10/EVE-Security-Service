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

import * as models from './models';

/**
 * contents object
 */
export interface PutCharactersCharacterIdMailMailIdContents {
    /**
     * Labels to assign to the mail. Pre-existing labels are unassigned.
     */
    labels?: Array<number>;

    /**
     * Whether the mail is flagged as read
     */
    read?: boolean;

}
