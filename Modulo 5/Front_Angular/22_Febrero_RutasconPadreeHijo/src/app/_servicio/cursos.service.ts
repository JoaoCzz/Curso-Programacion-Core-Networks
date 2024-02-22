import { Injectable } from '@angular/core';
import { Curso, Nivel } from '../_modelo/curso';

@Injectable({
  providedIn: 'root'
})
export class CursosService {
  public Cursos: Curso[] = [
    new Curso(1, 'Angular', 30, Nivel.AVANZADO),
    new Curso(2, 'React', 20, Nivel.INTERMEDIO),
    new Curso(3, 'Vue', 15, Nivel.INICIACION),
    
  ];

  constructor() { }

  modificarCurso(id:number, nombre:string, duracion:number, nivel:Nivel){
    const cursoModificado=this.Cursos.find(curso=>curso._id===id);
    if(cursoModificado){
      let index= this.Cursos.indexOf(cursoModificado);
      cursoModificado._nombre=nombre;
      cursoModificado._duracion=duracion;
      cursoModificado._nivel=nivel;
      this.Cursos[index]=cursoModificado;

  }
}
}
