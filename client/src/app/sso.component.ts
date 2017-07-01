import { OnInit, Component } from '@angular/core';
import { Router, ActivatedRoute, Params} from '@angular/router';

import { ConfigService } from './config.service';


@Component({
  selector: 'app-sso',
  templateUrl: './sso.component.html'
})
export class SsoComponent implements OnInit {
  code = '';
  state = '';
  error;
  showButton = false;

  constructor (
    private activatedRoute: ActivatedRoute,
    private conf: ConfigService
  ) { }

  ngOnInit() {
    if (localStorage.getItem('state')) {
      this.state = localStorage.getItem('state');
      this.activatedRoute.queryParams.subscribe((params: Params) => {
        console.log(params);
        if (params['state'] == this.state) {
          this.code = params['code'];
        }
        else {
          if (params['state']) {
            this.error = 'Something wrong with query state code. Try again.';
          }
        }
      });
      localStorage.removeItem('state');
    }
    this.state = (String) (Math.floor(Math.random() * 10000000 + 1000000));
    localStorage.setItem('state', this.state);
    this.showButton = true;
  }

}