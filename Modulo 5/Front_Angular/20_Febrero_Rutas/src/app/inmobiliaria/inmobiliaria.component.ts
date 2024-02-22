import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';
import { Inmueble } from '../_modelo/inmueble';
import { InmobiliariaService } from '../_servicio/inmobiliaria.service';


@Component({
  selector: 'app-inmobiliaria',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './inmobiliaria.component.html',
  styleUrl: './inmobiliaria.component.css'
})
export class InmobiliariaComponent implements OnInit{
  
  inmuebles:Inmueble[]=[];

  constructor(private inmuebleServicio: InmobiliariaService){}
  
  ngOnInit(): void {
    this.inmuebles=this.inmuebleServicio.ObtenerTodos();
    
  }
  
  



  
 
 
  }
