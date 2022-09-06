import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css'],
})
export class EmployeesComponent implements OnInit, OnChanges {

  nos:number[] = []
  employees:any[]=[]
  @Input()
  newemp:any={}
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
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log(this.newemp)
    if(this.newemp !== undefined)
    this.employees.push(this.newemp)
  }

  ngOnInit(): void {
  }

}
