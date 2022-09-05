import { Directive, ElementRef, HostBinding, HostListener, Input, OnChanges, OnInit, Renderer2, SimpleChanges } from '@angular/core';

@Directive({
  selector: '[appHover]'
})
export class HoverDirective implements OnInit, OnChanges {
// 2 events => mouseenter and mouseleave
//ElementRef => to get access of the element on which the directive is used

  //"../../assets/Matar-Paneer.jpg"
  @HostBinding("src")
  imgSrc:string='';
  @Input()
  itemname:string='';

  constructor(private el:ElementRef, private render:Renderer2) { 
    console.log(el.nativeElement)
    render.setStyle(el.nativeElement,'border','2px solid #eee');
    render.setStyle(el.nativeElement,'padding','10px');
    
  }
  ngOnInit(): void {
    this.imgSrc=`../../assets/${this.itemname}`
  }
  ngOnChanges(changes: SimpleChanges): void {
    this.imgSrc=`../../assets/${this.itemname}`
  }
  @HostListener('mouseenter')
  mouseenter(){
    this.render.setStyle(this.el.nativeElement,'border','2px solid #56ABEE');
  }
  @HostListener('mouseleave')
  mouseleave(){
    this.render.setStyle(this.el.nativeElement,'border','2px solid #eee');
  }

}
