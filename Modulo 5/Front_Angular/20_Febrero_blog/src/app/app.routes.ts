import { Routes } from '@angular/router';
import { InicioComponent } from './inicio/inicio.component';
import { DetalleComponent } from './detalle/detalle.component';
import { AltaArticuloComponent } from './alta-articulo/alta-articulo.component';

export const routes: Routes = [
    {"path": "inicio","component":InicioComponent},
    {"path":"detalle/:id","component":DetalleComponent},
    {"path":"",redirectTo:"/inicio",pathMatch:"full"},
    {"path":"altaArticulo","component":AltaArticuloComponent},   
];
