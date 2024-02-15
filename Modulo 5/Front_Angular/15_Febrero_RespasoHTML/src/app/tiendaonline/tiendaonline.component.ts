import { Component } from '@angular/core';
import { DetalleproductoComponent } from '../detalleproducto/detalleproducto.component';
import { PiedepaginaComponent } from '../piedepagina/piedepagina.component';

@Component({
  selector: 'app-tiendaonline',
  standalone: true,
  imports: [DetalleproductoComponent,PiedepaginaComponent],
  templateUrl: './tiendaonline.component.html',
  styleUrl: './tiendaonline.component.css'
})
export class TiendaonlineComponent {

}
