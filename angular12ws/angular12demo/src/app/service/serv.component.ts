
import { Component, OnInit } from '@angular/core';
import { DemoService } from './demo.service';

@Component({
  selector: 'app-serv',
  templateUrl: './serv.component.html',
  styleUrls: ['./serv.component.css'],
  providers:[DemoService]
})
export class ServComponent implements OnInit {
  title:string;
  constructor(public service:DemoService) {
    this.title = service.message
   }
  
  ngOnInit(): void {
  }
  changeTitle(){
  this.service.setMessage(this.title);
  }
}
