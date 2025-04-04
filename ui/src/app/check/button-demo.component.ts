import { Component } from '@angular/core';
import { ButtonModule } from 'primeng/button';

@Component({
  selector: 'button-demo',
  template: `
    <div class="card flex justify-center">
      <p-button label="Check" />
    </div>
  `,
  standalone: true,
  imports: [ButtonModule],
})
export class ButtonDemo {}
