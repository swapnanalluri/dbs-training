import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

import { Emp } from 'emp';

@Component({
  selector: 'app-logemp',
  templateUrl: './logemp.component.html',
  styleUrls: ['./logemp.component.css']
})
export class LogempComponent {

  emp=[];
  constructor(private empservice:EmpService) { 

  }

  handleFormData(form){
    
    let emp:Emp=new Emp("sravani","sravani");
    this.empservice.addEmp(emp);
  }
  
}
