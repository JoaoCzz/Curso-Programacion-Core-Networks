import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TiendaonlineComponent } from './tiendaonline/tiendaonline.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,TiendaonlineComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = '15_Febrero_RespasoHTML';
}
