import { Character } from './classes/character';

export class Key {
  accessMask: number;
  type: string;
  expires: string;
  characters: Character[];
}
