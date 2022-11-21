import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutenticacionService {
  url="https://brianbackend.herokuapp.com/auth/login";
  currentUserSubjet: BehaviorSubject<any>;
  constructor(private https:HttpClient) {
    console.log("El servicio de autenticación está corriendo");
    this.currentUserSubjet= new BehaviorSubject<any>(JSON.parse(sessionStorage.getItem('currentUser') || '{}'))
   }

   IniciarSesion(credenciales:any):Observable<any>
   {
     return this.https.post(this.url, credenciales).pipe(map(data=> {
      sessionStorage.setItem('currentUser', JSON.stringify(data)); 
      return data;
     }))
   }

}
