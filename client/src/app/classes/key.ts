import { Character } from './character';

export class Key {
  accessMask: number;
  type: string;
  expires: string;
  characters: Character[];
}
