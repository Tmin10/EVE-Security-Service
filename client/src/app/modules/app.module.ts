import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule }   from '@angular/router';

import { AppComponent } from '../components/app.component';
import { IndexComponent } from '../components/index.component';
import { SsoComponent } from '../components/sso.component';
import { ExitComponent } from '../components/exit.component';
import { ApiService } from '../services/api.service';
import { ConfigService } from '../services/config.service';

import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    SsoComponent,
    ExitComponent
  ],
  imports: [
    NgbModule.forRoot(),
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [ 
    ApiService,
    ConfigService
  ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
