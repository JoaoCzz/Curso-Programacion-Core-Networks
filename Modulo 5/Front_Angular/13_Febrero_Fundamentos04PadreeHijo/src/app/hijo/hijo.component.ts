import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-hijo',
  standalone: true,
  imports: [],
  templateUrl: './hijo.component.html',
  styleUrl: './hijo.component.css'
})
export class HijoComponent {

  @Input() datoHijo:any='';
  alumnos:String[]=[];
  agregar():void{
    this.alumnos.push(this.datoHijo);
  }
}
