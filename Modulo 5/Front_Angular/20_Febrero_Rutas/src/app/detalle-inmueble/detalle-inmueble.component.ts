import { Component, OnInit, Input } from '@angular/core';
import { RouterModule } from '@angular/router';
import { Inmueble } from '../_modelo/inmueble';
import { InmobiliariaService } from '../_servicio/inmobiliaria.service';

@Component({
  selector: 'app-detalle-inmueble',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './detalle-inmueble.component.html',
  styleUrl: './detalle-inmueble.component.css'
})
export class DetalleInmuebleComponent implements OnInit {
  @Input() id:string = '';
  inmueble:Inmueble=new Inmueble;
  constructor(private inmuebleServicio: InmobiliariaService){}
  ngOnInit(): void {
    console.log("id ->" + this.id);
    this.inmueble= this.inmuebleServicio.ObtenerUno(this.id);
  }
  
 
}
