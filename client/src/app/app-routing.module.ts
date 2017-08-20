import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { IndexComponent } from './index.component';
import { SsoComponent } from './sso.component'
import { ApiService } from './api.service';

const routes: Routes = [
  //{ path: '', redirectTo: '/sso', pathMatch: 'full' },
  { path: '',  component: IndexComponent },
  { path: 'sso', component: SsoComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
