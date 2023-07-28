import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HelloComponentComponent } from './hello-component.component';

describe('HelloComponentComponent', () => {
  let component: HelloComponentComponent;
  let fixture: ComponentFixture<HelloComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HelloComponentComponent]
    }).compileComponents();
    fixture = TestBed.createComponent(HelloComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
  it('should display the correct greeting message', () => {
    component.name = 'John';
    fixture.detectChanges();
    const greetingElement = fixture.nativeElement.querySelector('.greeting');
    expect(greetingElement.textContent).toContain('Hello, John!');
  });
});
