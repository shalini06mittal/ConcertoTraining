import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeesComponent } from './employees/employees.component';
import { ParentComponent } from './lifecycle/parent.component';
import { ChildComponent } from './lifecycle/child.component';
import { DirectivesComponent } from './directives/directives.component';
import { HoverDirective } from './directives/hover.directive';
import { PipesComponent } from './pipes/pipes.component';
import { PowerPipe } from './pipes/power.pipe';
import { registerLocaleData } from '@angular/common'; 
import localeFr from '@angular/common/locales/fr';
import { EmpformComponent } from './empform/empform.component'; 
// the second parameter 'fr' is optional 
registerLocaleData(localeFr, 'fr');
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { EmpeditformComponent } from './empeditform/empeditform.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    EmployeeComponent,
    EmployeesComponent,
    ParentComponent,
    ChildComponent,
    DirectivesComponent,
    HoverDirective,
    PipesComponent,
    PowerPipe,
    EmpformComponent,
    EmpeditformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, FormsModule,  BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
