import { Component, OnInit, Input } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-detalle-inmueble',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './detalle-inmueble.component.html',
  styleUrl: './detalle-inmueble.component.css'
})
export class DetalleInmuebleComponent implements OnInit {
  ngOnInit(): void {
    console.log("id ->" + this.id);
  }
  
  @Input() id:number = 0;
}
