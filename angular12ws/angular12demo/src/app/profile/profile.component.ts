import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../model/employee';
import { EmphttpService } from '../service/emphttp.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
//id
  employee:Employee;
  constructor(private route:ActivatedRoute, private es :EmphttpService,
    private router:Router) {
    this.employee = {eid:0,ename:'',phone:'',email:'',address:{country:''}}
   }

  
  ngOnInit(): void {
    this.route.params.subscribe(data => {
      console.log(data.id)
      this.es.getEmployeeById(parseInt(data.id))
      .subscribe(emp => this.employee = emp);
    })
  }

  back(eid:number)
  {
    // this add ; in the url
      //this.router.navigate(['../',{id:eid}],{relativeTo:this.route})

      // to pass query parameter with ? syntax
      this.router.navigate(['../'],{relativeTo:this.route, queryParams:{id:eid}})
  }
  displayAddress()
  {
    this.router.navigate(['info'],{relativeTo:this.route})
  }
}
