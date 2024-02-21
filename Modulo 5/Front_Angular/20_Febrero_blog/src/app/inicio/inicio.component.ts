import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ArticulosServiciosService } from '../_servicios/articulos-servicios.service';

@Component({
  selector: 'app-inicio',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './inicio.component.html',
  styleUrl: './inicio.component.css'
})
export class InicioComponent implements OnInit {
  articulos:any;

constructor(private articuloS: ArticulosServiciosService){
 }
  ngOnInit(): void {
    this.articulos=this.articuloS.obtenerTodosArticulos();
  }
 
}
