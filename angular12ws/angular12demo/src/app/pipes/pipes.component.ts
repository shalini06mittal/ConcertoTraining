import { Component, OnInit } from '@angular/core';
import { LOCALE_ID, Inject } from '@angular/core';
@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  bdate  = new Date()
  constructor(@Inject(LOCALE_ID) public locale: string) { }

  ngOnInit(): void {
  }

}
