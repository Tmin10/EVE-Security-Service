import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';


@Injectable()
export class ApiService {

  private headers = new Headers({'Content-Type': 'application/json'});
  private BASE = '';
  private keyUrl = this.BASE + '/token';
  private characterInfoUrl = this.BASE + '/character';

  constructor(private http: Http) { }

  getToken(code): Promise<string> {
    return this.http.get(this.keyUrl + '?code=' + code)
           .toPromise()
           .then(response => response.json().body.token as string)
           .catch(this.handleError);
  }

  getCharacterInfo(): Promise<any> {
    return this.http.get(this.characterInfoUrl + '?token=' + localStorage.getItem('token'))
            .toPromise()
            .then(response => response.json().body)
            .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('API ERROR: An error occurred', error);
    return Promise.reject(error.message || error);
  }
}
