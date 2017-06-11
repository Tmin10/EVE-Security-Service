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
 * 200 ok object
 */
export interface GetUniverseConstellationsConstellationIdOk {
    /**
     * constellation_id integer
     */
    constellationId: number;

    /**
     * name string
     */
    name: string;

    position?: models.GetUniverseConstellationsConstellationIdPosition;

    /**
     * The region this constellation is in
     */
    regionId: number;

    /**
     * systems array
     */
    systems: Array<number>;

}
