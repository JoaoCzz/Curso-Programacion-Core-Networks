import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-hijo',
  standalone: true,
  imports: [],
  templateUrl: './hijo.component.html',
  styleUrl: './hijo.component.css'
})
export class HijoComponent {
@Output()llamadaPadre = new EventEmitter<string>();
productos: string[]=['Leche','Pan','café','huevos','azucar']

pasarApadre(elemento:string){
  this.llamadaPadre.emit(elemento);
}
}
