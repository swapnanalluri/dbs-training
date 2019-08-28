import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../User';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent  {

  constructor(private userService:UserService, private router:Router) { }


  handleFormData(data:User){
   let user:User = new User(12, data.name);
   this.userService.saveUser(user).subscribe(response => {
     console.log('Response');
     console.log(response);
     this.router.navigate(['/']);
   })
  }

}
