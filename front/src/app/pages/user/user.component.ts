import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector: 'user-cmp',
    moduleId: module.id,
    templateUrl: 'user.component.html'
})

export class UserComponent implements OnInit{
    name:String;
    price:String;
    description:String;
    constructor(private http: HttpClient) { }

    ngOnInit(){
    }
    



    submit(){
        let product:any={
            
                "name" : this.name,
                "description": this.description,
                "price": this.price,
                "imagePath": "path"
            };
            console.log(product);

            this.http.post('http://localhost:8080/product/add/',product).subscribe((response) => {
                window.alert("utilisateur ajouté avec succèes!");


      });
        }
    }

