import { Component } from '@angular/core';
import { RouterOutlet,RouterModule} from '@angular/router';
import { InicioComponent } from './inicio/inicio.component';
import { DondeEstamosComponent } from './donde-estamos/donde-estamos.component';
import { QuienesSomosComponent } from './quienes-somos/quienes-somos.component';
import { ContactarComponent } from './contactar/contactar.component';
import { DetalleComponent } from './detalle/detalle.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,RouterModule, InicioComponent, DondeEstamosComponent, QuienesSomosComponent, ContactarComponent,DetalleComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = '19_Febrero_Rutas';
}
