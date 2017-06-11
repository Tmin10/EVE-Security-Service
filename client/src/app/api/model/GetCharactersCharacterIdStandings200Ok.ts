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
export interface GetCharactersCharacterIdStandings200Ok {
    /**
     * from_id integer
     */
    fromId: number;

    /**
     * from_type string
     */
    fromType: GetCharactersCharacterIdStandings200Ok.FromTypeEnum;

    /**
     * standing number
     */
    standing: number;

}
export namespace GetCharactersCharacterIdStandings200Ok {
    export enum FromTypeEnum {
        Agent = <any> 'agent',
        NpcCorp = <any> 'npc_corp',
        Faction = <any> 'faction'
    }
}
