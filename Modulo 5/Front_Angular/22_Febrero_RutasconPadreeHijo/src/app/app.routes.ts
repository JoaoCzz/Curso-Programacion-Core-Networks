import { Routes } from '@angular/router';
import { CursoListaComponent } from './curso-lista/curso-lista.component';
import { CursoAltaComponent } from './curso-alta/curso-alta.component';

export const routes: Routes = [
    {path:'',component: CursoListaComponent, children: [
    {path: 'alta', component: CursoAltaComponent},
    {path: 'modificacion/:id', component: CursoAltaComponent},
    ] },    
   
];
