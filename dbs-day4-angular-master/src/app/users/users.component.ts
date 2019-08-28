import { Component, OnInit, OnDestroy } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../User';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit, OnDestroy {

  users:User[];
  currentUser:User;
  private subscription:Subscription;
  private currentUserSubscription:Subscription;

  constructor(private userService:UserService) { }

  ngOnInit() {
    this.subscription = this.userService
                              .listUsers()
                              .subscribe(response => {
                                this.users = response;
                              })

  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
    if(this.currentUserSubscription){
      this.currentUserSubscription.unsubscribe();
    }
  }

  findById(id):void{
    this.currentUserSubscription = this.userService
          .findByUserId(id)
          .subscribe(user => this.currentUser = user)
  }

  saveUser(user:User){
    this.userService.saveUser(user).subscribe(response => console.log('user saved...'))
  }

}
