import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../model/employee';
import { EmphttpService } from '../service/emphttp.service';


@Component({
  selector: 'app-empform',
  templateUrl: './empform.component.html',
  styleUrls: ['./empform.component.css']
})
export class EmpformComponent implements OnInit{

  @Output()
  empadded:EventEmitter<Employee> = new EventEmitter();
  title:string;
  constructor(private empservice:EmphttpService, private router:Router){
    console.log('emp form constructor')
    this.title=''
  }
  ngOnInit(): void {
    
      this.title="Add Employee"
  }
  saveEmployee(emp:any)
  {
    //alert('yes')
    console.log(emp.value)
    //this.empservice.addEmployee(emp.value)
    this.empservice.addEmployee(emp.value)
    .subscribe(data => {
      console.log(data)
      // redirect to list
      this.router.navigate(['/list']);
    });
  
  
    //   this.empadded.emit(emp.value)
  //  // emp={eid:0, ename:'',email:'',phone:'', address:{city:"", country:"", zipcode:0}}
  //   emp.reset();
  }

}
