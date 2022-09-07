import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  message:string ;
  constructor( public httpservice:HttpClient) { 
    this.message = 'from service';
    console.log('demo service')
  }

  getAllTodos()
  {
    console.log('get all todos in service')
    return this.httpservice.get('https://jsonplaceholder.typicode.com/todos')
  }
  setMessage(msg:string)
  {
    this.message = msg
  }
}
