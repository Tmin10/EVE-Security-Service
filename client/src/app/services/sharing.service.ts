import { Injectable } from '@angular/core';

@Injectable()
export class SharingService {
    private storage = [];

    set (key:string, data:any) {
        this.storage[key] = data;
    }

    get (key:string):any {
        return this.storage[key];
    }
}