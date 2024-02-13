import { Component,Input } from '@angular/core';

@Component({
  selector: 'app-factura-hijo',
  standalone: true,
  imports: [],
  templateUrl: './factura-hijo.component.html',
  styleUrl: './factura-hijo.component.css'
})
export class FacturaHijoComponent {
@Input() datoHijo:any='';
productos:String[]=[];

}
