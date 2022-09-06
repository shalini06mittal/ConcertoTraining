import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-empform',
  templateUrl: './empform.component.html',
  styleUrls: ['./empform.component.css']
})
export class EmpformComponent {

  @Output()
  empadded:EventEmitter<Employee> = new EventEmitter();
  saveEmployee(emp:Employee)
  {
    //alert('yes')
    console.log(emp)
    this.empadded.emit(emp)
  }

}
