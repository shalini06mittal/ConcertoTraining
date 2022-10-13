import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AuthService } from './auth.service';
import { UserService } from './user.service';

@Injectable({
  providedIn: 'root'
})
export class TokenService implements HttpInterceptor{

  constructor(private us:UserService) { }
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    console.log('interceptor')
    let reqclone = req;
    if(this.us.isAuthencticated()){
      console.log('yes')
      let token = localStorage.getItem('token')
      console.log(token)
       reqclone = req.clone({
        headers: req.headers.set("Authorization",
                    "Bearer " + token)
      })
     // console.log(reqclone);
      
    }
    return next.handle(reqclone);
    // else
    //   return next.handle(req);
  }
}
