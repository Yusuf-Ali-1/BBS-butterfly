import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../user-service.service';
import { User } from '../../user';

@Component({
  selector: 'app-delete-post',
  templateUrl: './delete-post.component.html',
  styleUrls: ['./delete-post.component.css']
})
export class DeletePostComponent {

  user: User;
 
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private userService: UserService) {
    this.user = new User();
  }
 
  onSubmit() {
    this.userService.delete(this.user).subscribe(result => this.gotoUserList());
  }
 
  gotoUserList() {
    this.router.navigate(['/users']);
  }

}
