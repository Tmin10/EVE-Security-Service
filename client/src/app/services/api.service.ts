import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';
import { Router } from '@angular/router';

import { ConfigService} from './config.service';
import { SharingService } from '../services/sharing.service';

import 'rxjs/add/operator/toPromise';


@Injectable()
export class ApiService {

  private headers = new Headers({'Content-Type': 'application/json'});
  private keyUrl = '/token';
  private characterInfoUrl = '/character';

  constructor(
    private http: Http,
    private config: ConfigService,
    private router: Router,
    private sharing: SharingService
  ) { }

  getToken(code): Promise<string> {
    return this.http.get(
      this.config.getBaseUrl() + this.keyUrl, 
      {params: {code: code}}
    )
           .toPromise()
           .then(response => response.json().body.token as string)
           .catch(this.handleError.bind(this));
  }

  getCharacterInfo(): Promise<any> {
    return this.http.get(
      this.config.getBaseUrl() + this.characterInfoUrl, 
      {params: {token: localStorage.getItem('token')}}
    )
            .toPromise()
            .then(response => response.json().body)
            .catch(this.handleError.bind(this));
  }

  private handleError(error: any) {
    this.sharing.set('error', error);
    this.router.navigateByUrl('/error-page');
  }
}
