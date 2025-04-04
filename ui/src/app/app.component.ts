import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ButtonDemo } from './check/button-demo.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ButtonDemo],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
})
export class AppComponent {
  title = 'ui';
}
