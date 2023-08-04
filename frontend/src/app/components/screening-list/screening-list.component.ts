import { Component } from '@angular/core';
import {ScreeningListItemModel} from "../../models/screening-list-item.model";
import {ScreeningService} from "../../services/screening.service";

@Component({
  selector: 'app-screening-list',
  templateUrl: './screening-list.component.html',
  styleUrls: ['./screening-list.component.css']
})
export class ScreeningListComponent {

  screenings!: ScreeningListItemModel[];


  constructor(private screeningService: ScreeningService) {
    this.screeningService.getAllScreenings().subscribe({
      next: data => this.screenings = data,
      error: err => console.log(err),
      complete: () => {console.log(this.screenings)}
    })
  }

  dateFormat(date: Date) {
   return new Date(date).toLocaleDateString();
  }

}
