import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';

import { Config } from '../classes/config';


@Injectable()
export class ConfigService {

    private headers = new Headers({'Content-Type': 'application/json'});
    //TODO port number for development run only
    private configUrl:string = '/config';

    constructor(private http: Http) { }

    get(): Promise<Config> {
        return this.http.get(this.configUrl)
            .toPromise()
            .then(response => response.json() as Config)
            .catch(this.handleError);
    }

    private handleError(error: any): Promise<any> {
        console.error('CONFIG ERROR: An error occurred', error);
        return Promise.reject(error.message || error);
    }
}
