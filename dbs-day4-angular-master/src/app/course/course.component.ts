import { Component,  Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.css']
})
export class CourseComponent {

   @Input("everyCourse") course;
   @Output('del') delete = new EventEmitter();

   deleteCourse(obj){
     console.log('came inside the delete method ');
     console.log(obj)
     this.delete.emit(obj.id);
   }


}
