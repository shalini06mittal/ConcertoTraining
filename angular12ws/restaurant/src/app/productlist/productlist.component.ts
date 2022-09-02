import { Component, OnInit } from '@angular/core';
import { foodItem } from '../database/data';
import { Product } from '../model/Product';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {

  products:Product[]
  constructor() { 
    this.products = foodItem
  }

  ngOnInit(): void {
  }

}
