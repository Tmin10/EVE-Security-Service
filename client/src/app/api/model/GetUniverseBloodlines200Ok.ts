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
export interface GetUniverseBloodlines200Ok {
    /**
     * bloodline_id integer
     */
    bloodlineId: number;

    /**
     * charisma integer
     */
    charisma: number;

    /**
     * corporation_id integer
     */
    corporationId: number;

    /**
     * description string
     */
    description: string;

    /**
     * intelligence integer
     */
    intelligence: number;

    /**
     * memory integer
     */
    memory: number;

    /**
     * name string
     */
    name: string;

    /**
     * perception integer
     */
    perception: number;

    /**
     * race_id integer
     */
    raceId: number;

    /**
     * ship_type_id integer
     */
    shipTypeId: number;

    /**
     * willpower integer
     */
    willpower: number;

}
