import { Component, OnInit } from '@angular/core';
import Chart from 'chart.js';
import { HttpClient } from '@angular/common/http';
@Component({
    selector: 'dashboard-cmp',
    moduleId: module.id,
    templateUrl: 'dashboard.component.html'
})

export class DashboardComponent implements OnInit{

  products: any;
  constructor(private http: HttpClient) { }


    ngOnInit() {
      this.http.get('http://localhost:8080/product/all').subscribe((response) => {
        this.products = response;
      });

    }
}
