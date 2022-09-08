import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpformComponent } from './empform/empform.component';
import { EmployeesComponent } from './employees/employees.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:'', redirectTo:'login', pathMatch:'full'},
  {path:'login', component:LoginComponent},
  {path:'list', component:EmployeesComponent},
  {path:'register', component:EmpformComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
