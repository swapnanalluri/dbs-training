import { Component, OnInit } from '@angular/core';
import { CourseService } from '../course.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit{

  private courses:any[];

  constructor(private courseService:CourseService){}

  ngOnInit(): void {
    this.courses = this.courseService.getAllCourses();
  }

  register(c){
    console.log(c);
    console.log(`came inside the register method !!`);
  }

  onCourseNameChange(){
   // console.log(`came inside the change event ${this.coursename}` );
  }

  deleteCourseHandler(id){
    console.log('came inside the delete course handler inside the parent '+id);
  }
  
}
