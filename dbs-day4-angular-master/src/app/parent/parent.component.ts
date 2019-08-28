import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {

  attributes=['Name', 'Age', 'Salary']
  employees=[
    {
      'name':'Mohan',
      'age':32,
      'salary':320000
    },
    {
      'name':'Vikram',
      'age':30,
      'salary':300000
    },
    {
      'name':'Hari',
      'age':42,
      'salary':620000
    },
    {
      'name':'Jeeven',
      'age':34,
      'salary':360000
    },
    {
      'name':'Joseph',
      'age':28,
      'salary':240000
    }
  ]

  handleEventClicked($event){
    console.log('Handled the child event in the parent.....');  
    console.log($event);
  }

}
