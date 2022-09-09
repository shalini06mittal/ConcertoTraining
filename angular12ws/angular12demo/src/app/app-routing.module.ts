import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpformComponent } from './empform/empform.component';
import { EmployeesComponent } from './employees/employees.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { ProfileinfoComponent } from './profileinfo/profileinfo.component';
import { AuthService } from './service/auth.service';

const routes: Routes = [
  {path:'', redirectTo:'login', pathMatch:'full'},
  {path:'login', component:LoginComponent},
  // {path:'list', component:EmployeesComponent},
  // {path:'list/:id', component:ProfileComponent}
  // change the path from list to employees
  {path:'employees', component:EmployeesComponent,canActivate:[AuthService]},
  {path:'employees/:id', component:ProfileComponent, canActivate:[AuthService],
    children:[
      {path:'info', component:ProfileinfoComponent}
    ]},
  {path:'register', component:EmpformComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
