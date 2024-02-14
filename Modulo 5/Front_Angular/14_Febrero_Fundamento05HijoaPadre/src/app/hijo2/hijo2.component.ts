import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-hijo2',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './hijo2.component.html',
  styleUrl: './hijo2.component.css'
})
export class Hijo2Component {
 asignaturas:string[]=['Matematicas','Quimica','Fisica']
  asignaturaSeleccionada:string=this.asignaturas[0];
  @Output()enviarPadre= new EventEmitter<string>();
  pasarApadre(){
    this.enviarPadre.emit(this.asignaturaSeleccionada);
  }

}
