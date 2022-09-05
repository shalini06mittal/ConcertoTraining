import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  category:string ="chicken"
  constructor() { }

  ngOnInit(): void {
    console.log("category ",this.category)
  }

}
