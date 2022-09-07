import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { hasExclamationMark } from '../validators/password';

@Component({
  selector: 'app-empreactiveform',
  templateUrl: './empreactiveform.component.html',
  styleUrls: ['./empreactiveform.component.css']
})
export class EmpreactiveformComponent implements OnInit {

  subsemail:FormControl;
  empform:FormGroup;
  email:FormControl;
  address:FormGroup
  city:FormControl
  password:FormControl;
  constructor() { 
    this.subsemail = new FormControl('',Validators.required);
    this.email=new FormControl('',Validators.required);
    this.city = new FormControl('',Validators.required);
    this.address = new FormGroup({city:this.city})
    this.password=new FormControl('',hasExclamationMark)
    console.log(this.subsemail) 
    this.empform = new FormGroup({
      ename:new FormControl('Sample name',[Validators.required, Validators.minLength(5)]),
      email:this.email,
      address:this.address,
      password:this.password
    })
  }
  subscribe()
  {
    console.log(this.subsemail.value)
  }
  ngOnInit(): void {
  }
  
  
}

