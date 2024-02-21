import { Injectable } from '@angular/core';
import { Articulo } from '../_modelo/articulo';

@Injectable({
  providedIn: 'root'
})
export class ArticulosServiciosService {
  articulos=[
    {"id":1,
     "titulo":"Hacking etico",
     "resumen":"Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui eaque consequatur blanditiis, ipsam, eveniet doloremque sunt ex voluptas praesentium, nobis deleniti provident! Eius reiciendis soluta fugiat cupiditate repudiandae veniam voluptatem?",
     "imagen":"https://th.bing.com/th/id/OIP.rGyflVf4J_Y7cKR4VD8_XAHaEH?rs=1&pid=ImgDetMain"
    },
    {"id":2,
     "titulo":"Legislacion de Seguridad en Europa",
     "resumen":"Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui eaque consequatur blanditiis, ipsam, eveniet doloremque sunt ex voluptas praesentium, nobis deleniti provident! Eius reiciendis soluta fugiat cupiditate repudiandae veniam voluptatem?",
     "imagen":"https://www.seguritecnia.es/wp-content/uploads/2020/10/union-de-la-seguridad-1200x800.jpg"    
    },
    {"id":3,
     "titulo":"¿Como evetiar que te hacken la cuenta?",
     "resumen":"Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui eaque consequatur blanditiis, ipsam, eveniet doloremque sunt ex voluptas praesentium, nobis deleniti provident! Eius reiciendis soluta fugiat cupiditate repudiandae veniam voluptatem?",
     "imagen":"https://th.bing.com/th/id/OIP.6sbvpLDVmFsW0Yk9ezeOpgHaEL?rs=1&pid=ImgDetMain"  
    },
    {"id":4,
     "titulo":"¿Que es fishing?",
     "resumen":"Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui eaque consequatur blanditiis, ipsam, eveniet doloremque sunt ex voluptas praesentium, nobis deleniti provident! Eius reiciendis soluta fugiat cupiditate repudiandae veniam voluptatem?",
     "imagen":"https://th.bing.com/th/id/OIP.jqtNG4lSNpR7ZzSzMUg4WAHaHa?rs=1&pid=ImgDetMain"
    },
    {"id":5,
     "titulo":"¿Que datos NUNCA te deben pedir?",
     "resumen":"Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui eaque consequatur blanditiis, ipsam, eveniet doloremque sunt ex voluptas praesentium, nobis deleniti provident! Eius reiciendis soluta fugiat cupiditate repudiandae veniam voluptatem?",
     "imagen":"https://www.unotv.com/uploads/2022/12/datos-sensibles-no-debes-dar-credito-condusef-145018.jpg"
    },
    {"id":6,
     "titulo":"¿Porque aprender Linux?",
     "resumen":"Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui eaque consequatur blanditiis, ipsam, eveniet doloremque sunt ex voluptas praesentium, nobis deleniti provident! Eius reiciendis soluta fugiat cupiditate repudiandae veniam voluptatem?",
     "imagen":"https://th.bing.com/th/id/OIP.Cc4Tb5Aa6x6MZrkn7eqAhgHaIL?rs=1&pid=ImgDetMain"
    },
    
  ]

  constructor() { }
   ObtenerUno(indice:number){
 return this.articulos[indice];
} 
obtenerTodosArticulos(){
  return this.articulos;
}

darDeAlta(articulo:Articulo){
this.articulos.push(articulo)
}
}
