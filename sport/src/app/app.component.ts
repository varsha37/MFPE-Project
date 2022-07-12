import { Component } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  email!:string;
  password!:string;

  constructor(){

  }
  Loginuser()
  {
    if(this.email=="admin" && this.password=="123456789")
    {
    console.log("Welcome");
    }
    else
    {
      console.log("Unauthorized");
    }
  }
}
