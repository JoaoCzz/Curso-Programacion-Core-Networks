import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-array-ejemplo',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './array-ejemplo.component.html',
  styleUrl: './array-ejemplo.component.css'
})
export class ArrayEjemploComponent {
  nombres:string[]=['Luka','Jude','Toni','Dani','Antonio'];
  nombre:string="";
  edades:number[]=[21,15,28,27,30,20,17,15]
  edadesfiltradas:number[]=[];
  edadesDobles:number[]=[]
  agregar():void{
    this.nombres.push(this.nombre);
  }
  eliminar():void{
    this.nombres.pop()
  }

  recorrerArray():void{
    this.nombres.forEach(elemento=>console.log(elemento));
  }
  filtrarArray():void{
    this.edadesfiltradas =this.edades.filter(elemento=>elemento>18);
    this.edadesfiltradas.forEach(elemento=>console.log(elemento));
  }
  EdadesDobles():void{
    this.edadesDobles= this.edades.map(elemento=>elemento*2);
    this.edadesDobles.forEach(elemento=>console.log(elemento));

  }

}
