import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-componente01',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './componente01.component.html',
  styleUrl: './componente01.component.css'
})
export class Componente01Component {
      nombre="Goku Kakaroto";
      dni:string="4464646216"
}
