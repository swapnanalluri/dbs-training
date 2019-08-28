import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent{

  courses = [
    {
      name:"Java 8", 
      id:1,
      imgUrl:'../assets/angular.png', 
      price:8000,
      offer:true,
      duration:10,
      participants:0
    },
    {
      name:"Maven", 
      id:2, 
      price:4000,
      offer:false,
      imgUrl:'../assets/angular.png',
      duration:2,
      participants:0
    },
    {
      name:"Spring Boot", 
      id:3, 
      offer:true,
      price:10000,
      imgUrl:'../assets/angular.png',
      duration:8,
      participants:0
    },
    {
      name:"Hibernate", 
      id:4, 
      offer:true,
      imgUrl:'../assets/angular.png',
      price:8000,
      duration:4,
      participants:0
    },
    {
      name:"JPA", 
      id:5, 
      offer:false,
      price:8000,
      imgUrl:'../assets/angular.png',
      duration:4,
      participants:0
    },
    {
      name:"Angular", 
      id:6, 
      offer:false,
      price:10000,
      duration:4,
      imgUrl:'../assets/angular.png',
      participants:0
    }
  ];

  register(c){
    console.log(c);
    console.log(`came inside the register method !!`);
  }

  onCourseNameChange(){
   // console.log(`came inside the change event ${this.coursename}` );
  }
  
}
