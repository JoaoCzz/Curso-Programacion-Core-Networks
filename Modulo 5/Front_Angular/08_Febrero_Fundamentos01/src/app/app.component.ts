import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Componente01Component } from './componente01/componente01.component';
import { FormularioComponent } from './formulario/formulario.component';

@Component({
  selector: 'raiz',
  standalone: true,
  imports: [RouterOutlet,Componente01Component,FormularioComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = '08_Febrero_Fundamentos01';
}
