import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  userid:string;

  constructor(route:ActivatedRoute) {
    this.userid = route.snapshot.params.id;
   }

  ngOnInit() {
  }

}
