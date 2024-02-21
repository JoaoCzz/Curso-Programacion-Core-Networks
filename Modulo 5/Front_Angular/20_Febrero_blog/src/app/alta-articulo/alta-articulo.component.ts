import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Articulo } from '../_modelo/articulo';
import { ArticulosServiciosService } from '../_servicios/articulos-servicios.service';

@Component({
  selector: 'app-alta-articulo',
  standalone: true,
  imports: [FormsModule,RouterModule],
  templateUrl: './alta-articulo.component.html',
  styleUrl: './alta-articulo.component.css'
})
export class AltaArticuloComponent {
  constructor(private articuloServicio:ArticulosServiciosService){}

  articulo:Articulo=new Articulo();

guardarArticulo(){
  this.articuloServicio.darDeAlta(this.articulo)
  console.log(this.articulo);
}
}
