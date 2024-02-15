import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-empleado',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './empleado.component.html',
  styleUrl: './empleado.component.css'
})
export class EmpleadoComponent {
nombre: string= '';
fechaNacimiento:any='';
nacionalidad: string='';
genero: string='';
cmas:boolean=false;
java:boolean=false;
js:boolean=false;
pynthons:boolean=false;

mostrarinfo():void{
  let mensaje:string=` Nombre ${this.nombre}
  Fecha nacimiento: ${this.fechaNacimiento}
  Nacionalidad: ${this.nacionalidad}
  Genero: ${this.genero}
  Lenguajes de programacion : `;
  if(this.cmas){
    mensaje += 'C++ '
  }
  if(this.java){
    mensaje += 'Java '
  }
  if(this.js){
    mensaje += 'JavaScript '
  }
  if(this.pynthons){
    mensaje +='Phyntons '
  }

  alert(mensaje)
}

}
