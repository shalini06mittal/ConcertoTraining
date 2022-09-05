import { Component, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';
import { foodItem } from '../database/data';
import { Product } from '../model/Product';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit, OnChanges {

  @Input()
  category:string='biryani'
  @Output()
  //cartItem:Product = {};
  products:Product[]
  constructor() { 
    this.products=[]
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log("category changes",this.category)
    this.products = foodItem.filter(item=>item.category===this.category);
  }

  ngOnInit(): void {
    this.products = foodItem.filter(item=>item.category===this.category);
    console.log("category on init",this.category)
  }

  addToCart(e:any){
    console.log(e)
  }
  
}
