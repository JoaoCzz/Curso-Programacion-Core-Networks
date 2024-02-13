import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PadreComponent } from './padre/padre.component';
import { HijoComponent } from './hijo/hijo.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,PadreComponent,HijoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = '13_Febrero_Fundamentos04PadreeHijo';
}
