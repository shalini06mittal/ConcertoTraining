import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Employee } from '../model/employee';


@Component({
  selector: 'app-empform',
  templateUrl: './empform.component.html',
  styleUrls: ['./empform.component.css']
})
export class EmpformComponent implements OnInit{

  @Output()
  empadded:EventEmitter<Employee> = new EventEmitter();
  title:string;
  constructor(){
    
    this.title=''
  }
  ngOnInit(): void {
    
      this.title="Add Employee"
  }
  saveEmployee(emp:any)
  {
    //alert('yes')
    console.log(emp.value)
    this.empadded.emit(emp.value)
   // emp={eid:0, ename:'',email:'',phone:'', address:{city:"", country:"", zipcode:0}}
    emp.reset();
  }

}
