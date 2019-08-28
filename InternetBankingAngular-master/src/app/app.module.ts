import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { RouterModule } from '@angular/router';
import { SidebarModule } from 'ng-sidebar';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ServicesComponent } from './services/services.component';
import { HelpComponent } from './help/help.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { LoguserComponent } from './loguser/loguser.component';
import { LogempComponent } from './logemp/logemp.component';
import { RegisterComponent } from './register/register.component';
import { EmphomeComponent } from './emphome/emphome.component';
import { DelaccComponent } from './delacc/delacc.component';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ServicesComponent,
    HelpComponent,
    NotFoundComponent,
    LoguserComponent,
    LogempComponent,
    RegisterComponent,
    EmphomeComponent,
    DelaccComponent,
    CustomerDashboardComponent
     
  ],
  imports: [
    BrowserModule,
    FormsModule,
    SidebarModule,
    RouterModule.forRoot([
      {
        path:'',
        component:HomeComponent
      },
      {
        path:'home',
        component:HomeComponent
      },
      {
        path:'services',
        component:ServicesComponent
      },
      {
        path:'help',
        component:HelpComponent
      },
      {
        path:'logemp',
        component:LogempComponent
      },
      {
        path:'loguser',
        component:LoguserComponent
      },
      {
        path:'register',
        component:RegisterComponent
      },
      {
        path:'emphome',
        component:EmphomeComponent
      },
      {
        path:'deleteaccount',
        component:DelaccComponent
      },
      {
        path:'**',
        component:NotFoundComponent
      }

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
