import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public loginValid = true;
  public username = 'abc';
  public password = 'abc123';

  constructor(private userserv : UserService, private router:Router) { }

  ngOnInit(): void {
  }
  /**
   * when user click on login button, take to books dashboard for vaild credentials
   * or display an error message for invalid credentials and remain on login page
   */
  public onSubmit(): void {
    this.loginValid = true;
    console.log('login')
    this.userserv.loginUser(this.username, this.password)
    .subscribe(resp => {
      console.log('response')
      console.log(resp.message)
      // if(resp[0] !== undefined && resp[0].username === this.username && resp[0].password === this.password)
      // {
      //   localStorage.setItem("username",this.username);
      //   this.router.navigate(['/employees']);
      // }
      // else{
      //   this.loginValid = false;
      // }
      if(resp !== undefined && resp.message === "SUCCESS")
      {
        localStorage.setItem("username",this.username);
        this.router.navigate(['/employees']);
      }
    },error=>{
      console.log('failed')
      this.loginValid = false;
    })
  }

}
