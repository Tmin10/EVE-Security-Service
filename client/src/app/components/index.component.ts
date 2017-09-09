import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { ApiService } from '../services/api.service';


@Component({
  selector: 'app-index',
  templateUrl: './html/index.component.html',
  styleUrls: ['./css/index.component.css']
})
export class IndexComponent implements OnInit {
  title = 'EVE Security Service v.0.3.0';
  character = '';

  constructor (
    private apiService: ApiService,
    private router: Router
  ) { }

  ngOnInit() {
    if (!localStorage.getItem('token')) {
      this.router.navigateByUrl('/sso');
    } else {
      this.apiService.getCharacterInfo().then(character => this.character = character);
    }
  }
}
