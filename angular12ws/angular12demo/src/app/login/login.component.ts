import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public loginValid = true;
  public username = 'Deepak@gmail.com';
  public password = 'dep@123!';

  constructor() { }

  ngOnInit(): void {
  }
  /**
   * when user click on login button, take to books dashboard for vaild credentials
   * or display an error message for invalid credentials and remain on login page
   */
  public onSubmit(): void {
    this.loginValid = true;
    // if(this.hs.loginUser(this.username, this.password))
    // {
    //   localStorage.setItem('email', this.username);
    //   localStorage.setItem('token','JWT:12345678910');
      
    // }
    // else{
    //   this.loginValid = false;
    // }
  }

}
