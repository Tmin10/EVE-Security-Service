import { Component } from '@angular/core';

import { ApiService } from './api.service';


@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent {
  title = 'EVE Security Service v.0.2.0';
  keyID = '';
  vCode = '';
  // key: Key;
  // characters: Character[];

  constructor (private apiService: ApiService) { }

  // public getCharacters (event, keyID, vCode) {
  //   this.apiService.getKey(keyID, vCode).then(key => this.characters = key.characters);
  // }
}
