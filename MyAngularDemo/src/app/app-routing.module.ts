import { Routes, RouterModule} from '@angular/router';
import {NgModule} from '@angular/core';

import {LoginComponent} from './login-component/login.component';
import {ProductComponent} from './product-component/product.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent},
  {path: 'product', component: ProductComponent},
];
@NgModule({
  import: [RouterModule.forRoot(routes)],
  export: [RouterModule]
})
export class AppRoutingModule{}
