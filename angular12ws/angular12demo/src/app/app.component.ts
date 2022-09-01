import { Component, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  encapsulation:ViewEncapsulation.Emulated
})
// components => BL + UI
//export NODE_OPTIONS=--openssl-legacy-provider
export class AppComponent {
  title = 'Concerto Training om Angular!!!';
  bod = new Date();
  isInValid:boolean = true;
  message:string = 'some message..'
  type = 'text'
  red = 'red';
  display()
  {
    return "some text";
  }
  clicked()
  {
    alert('i was clicked')
  }
}
