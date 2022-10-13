import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  //url:string ="http://localhost:3000/users?username=";
  url:string ="http://localhost:8080/";
  constructor(private http:HttpClient) { }
   
  loginUser(username:string, password:string){
    let emp ={username, password}
      return this.http.post<any>(this.url+"auth", emp);
  }

  isAuthencticated():boolean{
    return !!localStorage.getItem("token");
  }
  logout(){
    localStorage.removeItem("token");
  } 
}
