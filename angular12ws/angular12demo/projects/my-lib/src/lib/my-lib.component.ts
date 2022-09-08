import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'lib-my-lib',
  template: `
  <div>
  <input #box1  value="0"> 
  <input #box2 value="0"> 
  <button (click)="onKey(box1.value, box2.value)">Add</button>
  <p>Result : {{res}}</p>
</div>
  `,
  styles: [
  ]
})
export class MyLibComponent implements OnInit {

  constructor() { }
  res:number = 0;
  onKey(data1:any, data2:any){
      this.res =  parseInt(data1) + parseInt(data2);
  }
  ngOnInit(): void {
  }

}
