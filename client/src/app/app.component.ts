import { Component } from '@angular/core';



@Component({
  selector: 'app-root',
  template: `
    <h1>{{title}}</h1>
    <a routerLink="/index">Index</a>
    <router-outlet></router-outlet>
  `
})
export class AppComponent {
    title = 'EVE Security Service v.0.2.0';
    
}