import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './service/user-list/user-list.component';
import { UserFormComponent } from './service/user-form/user-form.component';
import { DeletePostComponent } from './service/delete-post/delete-post.component';
 
const routes: Routes = [
  { path: 'users', component: UserListComponent },
  { path: 'adduser', component: UserFormComponent },
  { path: 'deleteuser', component: DeletePostComponent } 
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
