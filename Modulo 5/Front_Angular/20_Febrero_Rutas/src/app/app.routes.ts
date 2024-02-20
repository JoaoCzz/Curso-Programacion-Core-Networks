import { Routes } from '@angular/router';
import { InmobiliariaComponent} from './inmobiliaria/inmobiliaria.component';
import { DetalleInmuebleComponent } from './detalle-inmueble/detalle-inmueble.component';


export const routes: Routes = [
    {path: 'inmobiliaria', component: InmobiliariaComponent},
    {path: 'detalle/:id', component: DetalleInmuebleComponent},
    {path: '', redirectTo: '/inmuebles', pathMatch: 'full'},
    {path: "**", component: InmobiliariaComponent}
];
