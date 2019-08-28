import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emphome',
  templateUrl: './emphome.component.html',
  styleUrls: ['./emphome.component.css']
})
export class EmphomeComponent implements OnInit {
  private _opened: boolean = false;

private _toggleSidebar() {
  this._opened = !this._opened;
}  
  constructor() { }

  ngOnInit() {
  }

}
