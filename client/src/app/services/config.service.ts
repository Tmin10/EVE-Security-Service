import { OnInit, Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';
import { Router } from '@angular/router';

import 'rxjs/add/operator/toPromise';

import { Config } from '../classes/config';
import { SharingService } from '../services/sharing.service';
import { ApiService } from '../services/api.service';


@Injectable()
export class ConfigService {

    private headers = new Headers({'Content-Type': 'application/json'});
    private BASE = '';
    private configUrl:string = this.BASE + '/config';

    constructor(
        private http: Http,
        private router: Router,
        private sharing: SharingService
    ) { }


    get(): Promise<Config> {
        return this.http.get(this.configUrl)
            .toPromise()
            .then(response => response.json() as Config)
            .catch(this.handleError.bind(this));
    }

    private handleError(error: any) {
        this.sharing.set('error', error);
        this.router.navigateByUrl('/error-page');
    }

    getBaseUrl(): string {
        return this.BASE;
    }
}