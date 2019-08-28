import { Injectable } from '@angular/core';
import { User } from './User';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private USER_API_URL ="https://jsonplaceholder.typicode.com/users";

  users:any[]=[];
  constructor(private httpClient:HttpClient) { }

  addUser(user:User):void{
    this.users.push(user);
  }

  listUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.USER_API_URL)   
  }

  findByUserId(id:number):Observable<User>{
    return this.httpClient.get<User>(this.USER_API_URL+"/"+id)
  }

  saveUser(user:User):Observable<any>{
    return this.httpClient.post(this.USER_API_URL, JSON.stringify(user))
  }
  
  updateUser(id: number, user:User):Observable<any>{
    return this.httpClient.put(this.USER_API_URL+"/"+id, JSON.stringify(user))
  }

  deleteUser(id:number):Observable<any>{
    return this.httpClient.delete(this.USER_API_URL+"/"+id);
  }



}
