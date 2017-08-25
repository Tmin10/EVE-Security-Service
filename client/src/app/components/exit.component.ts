import { OnInit, Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'exit-component',
    template: ''
})
export class ExitComponent implements OnInit {

    constructor (private router: Router) { }

    ngOnInit(): void {
        localStorage.clear();
        this.router.navigateByUrl('/');
    }

}