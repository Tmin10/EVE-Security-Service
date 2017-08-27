import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { SharingService } from '../services/sharing.service';


@Component({
    selector: 'error-component',
    templateUrl: './html/error.component.html'
})
export class ErrorComponent implements OnInit {
    private error;
    private errorBody;

    constructor (
        private sharing: SharingService,
        private router: Router
    ) { }

    ngOnInit() {
        this.error = this.sharing.get('error');
        console.log(this.error);
        if (this.error) {
            this.errorBody = JSON.parse(this.error._body);
            this.sharing.set('error', undefined);
        } else {
            this.router.navigateByUrl('/');
        }
    }
}