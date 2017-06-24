import { Component } from '@angular/core';

import { ApiService } from './api.service';
import { Key } from './classes/key';
import { Character } from './classes/character';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'EVE Security Service v.0.2.0';
  keyID = '';
  vCode = '';
  key: Key;
  characters: Character[];

  constructor (private apiService: ApiService) { }

  public getCharacters (event, keyID, vCode) {
    this.apiService.getKey(keyID, vCode).then(key => this.characters = key.characters);
  }
}
