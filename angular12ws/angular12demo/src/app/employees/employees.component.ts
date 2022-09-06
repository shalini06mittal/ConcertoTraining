import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { Employee } from '../model/employee';
import { trigger, style, animate, transition , state} from '@angular/animations';
@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css'],
  animations: [
    trigger(
      'enterAnimation', [
        transition(':enter', [
          style({transform: 'translateX(100%)', opacity: 0}),
          animate('500ms', style({transform: 'translateX(0)', opacity: 1}))
        ]),
        transition(':leave', [
          style({transform: 'translateX(0)', opacity: 1}),
          animate('500ms', style({transform: 'translateX(100%)', opacity: 0}))
        ])
      ]
    ),
    // the fade-in/fade-out animation.
    trigger('simpleFadeAnimation', [
      // the "in" style determines the "resting" state of the element when it is visible.
      state('in', style({opacity: 1})),

      //fade in when created. this could also be written as transition('void => *')
      transition(':enter', [
        style({opacity: 0}),
        animate(1500)
      ]),

      // fade out when destroyed. this could also be written as transition('void => *')
      transition(':leave',
        animate(500, style({opacity: 0})))
    ])
  ],
})
export class EmployeesComponent implements  OnChanges {

  nos:number[] = []
  employees:Employee[]=[]
  @Input()
  newemp:any={}
  isEdit:boolean = true;
  employee:Employee | null;
  people: any[] = [
    {
    "name": "Douglas Pace",
    "age": 35,
    "country": 'MARS'
    },
    {
    "name": "Mcleod Mueller",
    "age": 32,
    "country": 'USA'
    },
    {
    "name": "Aguirre Ellis",
    "age": 34,
    "country": 'UK'
    },
    {
    "name": "Cook Tyson",
    "age": 32,
    "country": 'USA'
    }
    ];
    
  constructor() { 
    this.employees=[{eid:1,ename:'shalini',
    email:'shalini@gmail.com',phone:'1321312312'
    , address:{country:'India'}},
    {eid:2,ename:'shalini123',
    email:'shalini@gmail.com',phone:'1321312312'
    , address:{country:'India'}},
    {eid:3,ename:'shalini789',
    email:'shalini@gmail.com',phone:'1321312312'
    , address:{country:'India'}}]
    this.employee = null; //{eid:10, ename:'ss',email:'',phone:'', address:{city:"", country:"", zipcode:0}};

  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log(this.newemp)
    if(this.newemp !== undefined)
    this.employees.unshift(this.newemp)
  }

  delete(emp:Employee)
  {
    let objindx = this.employees.findIndex(employee=>employee.eid === emp.eid);
    this.employees.splice(objindx,1)
  }
  edit(emp:Employee)
  {
    this.isEdit = !this.isEdit
    this.employee = emp;
    console.log(this.employee)
  }
  updateEmployee(emp:any)
  {
    if(emp !== null)
      {
    let objindx = this.employees.findIndex(employee=>employee.eid === emp.eid);
      
      this.employees[objindx] = emp;
      }
      this.isEdit = !this.isEdit  
 
      
  }


}
