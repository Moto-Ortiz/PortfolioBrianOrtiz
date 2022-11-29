import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL = 'back-production-brianortiz.up.railway.app/personas/';

  constructor(private https: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.https.get<persona>(this.URL+'traer/perfil');
  }
}
