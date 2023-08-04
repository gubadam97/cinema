import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ScreeningFormComponent} from "./components/screening-form/screening-form.component";
import {ScreeningListComponent} from "./components/screening-list/screening-list.component";
import {ReservationFormComponent} from "./components/reservation-form/reservation-form.component";

const routes: Routes = [
  {path: 'screening-form', component: ScreeningFormComponent},
  {path: 'screening-list', component: ScreeningListComponent},
  {path: 'reservation-form', component: ReservationFormComponent},
  {path: '**', redirectTo:'screening-list'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
