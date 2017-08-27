import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from '../components/app.component';
import { IndexComponent } from '../components/index.component';
import { SsoComponent } from '../components/sso.component'
import { ExitComponent } from '../components/exit.component'
import { ErrorComponent } from '../components/error.component'
import { ApiService } from '../services/api.service';

const routes: Routes = [
  { path: '',  component: IndexComponent },
  { path: 'exit', component: ExitComponent},
  { path: 'sso', component: SsoComponent },
  { path: 'error-page', component: ErrorComponent}
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
