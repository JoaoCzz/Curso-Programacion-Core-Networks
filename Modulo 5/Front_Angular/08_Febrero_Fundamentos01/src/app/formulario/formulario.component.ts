import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-formulario',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './formulario.component.html',
  styleUrl: './formulario.component.css'
})
export class FormularioComponent {
  nombre=""
  dni=""
  edad:number=0
  Curso_solicitado=""
  Nivel_de_estudio:number=0
  onSubmit(): void {
    console.log(this.nombre)
    console.log(this.dni)
    console.log(this.edad)
    console.log(this.Curso_solicitado)
    console.log(this.Nivel_de_estudio)
    console.log('Si sirve XD')
  



}
}
