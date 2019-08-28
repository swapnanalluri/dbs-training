import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../User';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  constructor(private userService:UserService){

  }


  handleFormData(formData){
    let user:User = new User(12,"Hari");
    this.userService.addUser(user);
  }

}
