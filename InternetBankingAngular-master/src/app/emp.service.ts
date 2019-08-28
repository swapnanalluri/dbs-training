import { Injectable } from '@angular/core';

import { Emp } from 'Emp';

@Injectable({
  providedIn: 'root'
})
export class EmpService {
  emps:Emp[]=[];
  constructor() { }

  addEmp(emp:Emp):void{
    this.emps.push(emp);
  }

  listEmps():Emp[]{
    return this.emps;
  }

  

}