import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmpleadoComponent } from './empleado/empleado.component';
import { ArmaTuPcComponent } from './arma-tu-pc/arma-tu-pc.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,EmpleadoComponent,ArmaTuPcComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = '15_Febrero_EjerciciosFormularios';
}
