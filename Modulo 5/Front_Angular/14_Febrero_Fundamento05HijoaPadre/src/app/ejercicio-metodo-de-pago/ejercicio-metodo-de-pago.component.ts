import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio-metodo-de-pago',
  standalone: true,
  imports: [],
  templateUrl: './ejercicio-metodo-de-pago.component.html',
  styleUrl: './ejercicio-metodo-de-pago.component.css'
})
export class EjercicioMetodoDePagoComponent {
MetodoPago:string[]=['Efectivo','Tarjeta de credito','Contra reembolso',
'Paypal','Bizum','Bitcoin']
PagoElegido:string[]=[];
}
