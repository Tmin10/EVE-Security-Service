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
export interface GetMarketsPrices200Ok {
    /**
     * adjusted_price number
     */
    adjustedPrice?: number;

    /**
     * average_price number
     */
    averagePrice?: number;

    /**
     * type_id integer
     */
    typeId: number;

}
