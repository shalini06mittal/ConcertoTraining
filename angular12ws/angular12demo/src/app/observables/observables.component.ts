import { Component, OnDestroy, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit , OnDestroy{

  data:Observable<string> | null;
  fruits: Array<string> = []; 
  anyErrors: boolean =false; 
  finished: boolean = false;
  sub:any;
  Start(){ 
    //alert('start')
    this.data = new Observable (observer =>
    { 
      setTimeout(() => {  observer.next('Apple'); }, 1000);
      setTimeout(() => {  observer.next('mango'); }, 2000);
      setTimeout(() => {  observer.next('Orannge'); }, 3000); 
      setTimeout(() => {  observer.next('banana'); }, 4000); 
      setTimeout(() => {  observer.next('grapes'); }, 5000); 
      setTimeout(() => {  observer.next('watermelon'); }, 6000); 
     // setTimeout(() => {  observer.error('something went wrong'); }, 4000); 
      setTimeout(() => {  observer.complete(); }, 7000);
    })

     this.sub = this.data.subscribe(fruit => {
        console.log(fruit);
        this.fruits.push(fruit)
      },
      error => this.anyErrors = true,
      () => this.finished = true)

    // setTimeout(() => {
    //   sub.unsubscribe()
    // }, 4000);
}
  constructor() { 
    this.data = null;
  }
  ngOnDestroy(): void {
    this.sub.unsubscribe()
  }

  ngOnInit(): void {
  }

}
