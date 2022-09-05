import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  pcountry:string ='usa';
  emp = {"name":"Shalini"}
  constructor() { 
    console.log(`parent constructor`);
  }

  ngOnInit(): void {
    console.log(`parent ng oninit `);
  }

}
