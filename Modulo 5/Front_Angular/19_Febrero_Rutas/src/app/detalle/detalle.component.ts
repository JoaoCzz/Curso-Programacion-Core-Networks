import { Component,Input, OnInit } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

@Component({
  selector: 'app-detalle',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './detalle.component.html',
  styleUrl: './detalle.component.css'
})
export class DetalleComponent implements OnInit {
  @Input() id:number=0;
  productos:any = [
    {
      id:1,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/Please%20Please%20Me.jpg?itok=tzOPWi8O',
      name: 'Please Please Me',
      precio: '190€'
    },
    {
      id:2,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/With%20the%20Beatles.jpg?itok=3cGBeX7f',
      name: 'With the beatles',
      precio: '90€'
    },
    {
      id:3,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/A%20Hard%20Days%20Night.jpg?itok=gDdWFeas',
      name: 'A hard days night',
      precio: '120€'

    },
    {
      id:4,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/The%20Beatles%20for%20Sale.jpg?itok=wCTmlGz3',
      name: 'Beatles for sale',
      precio: '80€'
    },
    {
      id:5,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/Help.jpg?itok=Jz2wnyjj',
      name: 'Help',
      precio: '150€'
    },
    {
      id:6,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/Rubber%20Soul.jpg?itok=TsRSHu1Q',
      name: 'Robber soul',
      precio: '170€'
    },
    {
      id:7,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/Revolver.jpg?itok=J0Q8YaGs',
      name: 'Revolver',
      precio: '200€'
    },
    {
      id:8,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/Sgt%20Pepper.jpg?itok=0CcJLuzl',
      name: 'Sggt pepper lonely clubs band',
      precio: '250€'
    },
    {
      id:9,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/Magical-Mystery-Tour.jpg?itok=8midCi2f',
      name: 'Magical Mistery tour',
      precio: '120€'
    },
    {
      id:10,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/WA_Press_26.jpg?itok=WwQjTuUy',
      name: 'The beatles',
      precio: '250€'
    },
    {
      id:11,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/Yellow%20Sub.jpg?itok=aj5oY5EQ',
      name: 'Yellow Submarine',
      precio: '90€'
    },
    {
      id:12,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/Abbey%20Road.jpg?itok=OWcQY3Ee',
      name: 'Abbey Road',
      precio: '250€'
    },
    {
      id:13,
      img: 'https://www.thebeatles.com/sites/default/files/styles/responsive_thumbnail_mobile/public/2021-06/CoverLetItBe.jpg?itok=giGHBt2f',
      name: 'Let it be',
      precio: '200€'
    },
  ];

  ngOnInit():void{
    console.log( "id ->" +this.id);
  }

}
