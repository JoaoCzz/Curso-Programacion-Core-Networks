import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PadreComponent } from './padre/padre.component';
import { Padre2Component } from './padre2/padre2.component';
import { ArrayEjemploComponent } from './array-ejemplo/array-ejemplo.component';
import { EjercicioMetodoDePagoComponent } from './ejercicio-metodo-de-pago/ejercicio-metodo-de-pago.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,PadreComponent,Padre2Component,ArrayEjemploComponent,EjercicioMetodoDePagoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = '14_Febrero_Fundamento05HijoaPadre';
}
