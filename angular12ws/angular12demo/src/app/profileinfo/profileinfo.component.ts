import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profileinfo',
  templateUrl: './profileinfo.component.html',
  styleUrls: ['./profileinfo.component.css']
})
export class ProfileinfoComponent implements OnInit {
//http://localhost:4200/employees/1/info
  constructor(private route:ActivatedRoute) { }
  eid:number = 0;
  ngOnInit(): void {
    this.route.parent?.params.subscribe(param => this.eid = parseInt(param.id))
  }

}
