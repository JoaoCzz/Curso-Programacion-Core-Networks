import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-factura-padre',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './factura-padre.component.html',
  styleUrl: './factura-padre.component.css'
})
export class FacturaPadreComponent {
CodigoCliente:number=0;
FormadePago:string='';
DireccionEntrega:string='';
Producto:String='';

}
