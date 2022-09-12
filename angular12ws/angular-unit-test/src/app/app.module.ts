import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PowerPipe } from './pipes/power.pipe';
import { LoginComponent } from './login/login.component';
import { LoginInputOutputComponent } from './login-input-output/login-input-output.component';
import { HoverfocusDirective } from './directive/hoverfocus.directive';
import { ModelformComponent } from './modelform/modelform.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    PowerPipe,
    LoginComponent,
    LoginInputOutputComponent,
    HoverfocusDirective,
    ModelformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, FormsModule, ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
