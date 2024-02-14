import { Component,Input } from '@angular/core';

@Component({
  selector: 'app-factura-hijo',
  standalone: true,
  imports: [],
  templateUrl: './factura-hijo.component.html',
  styleUrl: './factura-hijo.component.css'
})
export class FacturaHijoComponent {
  @Input() codigo_hijo: number = 0;
  @Input() pago_hijo: string = '';
  @Input() direccion_hijo: string = '';
  @Input() producto_hijo: string = '';
  facturas: string[] = [];
  agregar(): void {
    this.facturas.push(
        this.producto_hijo
    );

}
}
