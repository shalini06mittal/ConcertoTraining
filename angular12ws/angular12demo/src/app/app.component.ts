import { Component, ViewEncapsulation } from '@angular/core';
import { DemoService } from './service/demo.service';


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

  constructor(public service:DemoService){}

  display()
  {
    return "some text";
  }
  clicked()
  {
    alert('i was clicked')
  }
  newemp:any;
  newEmpAdded(newemp:any){
    console.log(newemp)
    this.newemp = newemp;
  }

  getTodos()
  {
    console.log('getting all todos')
    this.service.getAllTodos().subscribe(data=>console.log(data));
  }
  getTodoById(id:any){

  }
  postTodo()
  {

  }
  deleteTodo(){

  }
  updateTodo()
  {

  }
}
