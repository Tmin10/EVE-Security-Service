import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule }   from '@angular/router';

import { AppComponent } from './app.component';
import { IndexComponent } from './index.component';
import { SsoComponent } from './sso.component'
import { ApiService } from './api.service';
import { ConfigService } from './config.service';

import { AppRoutingModule }     from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    SsoComponent
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
