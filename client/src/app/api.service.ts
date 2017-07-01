import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';


@Injectable()
export class ApiService {

  private headers = new Headers({'Content-Type': 'application/json'});
  //TODO port number for development run only
  private keyUrl = 'http://localhost:8080/keyInfo';

  constructor(private http: Http) { }

  // getKey(keyID, vCode): Promise<Key> {
  //   return this.http.get(this.keyUrl + '?keyID=' + keyID + '&vCode=' + vCode)
  //          .toPromise()
  //          .then(response => response.json() as Key)
  //          .catch(this.handleError);
  // }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }
}
