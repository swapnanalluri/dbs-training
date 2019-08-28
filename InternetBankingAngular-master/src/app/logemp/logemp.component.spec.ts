import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LogempComponent } from './logemp.component';

describe('LogempComponent', () => {
  let component: LogempComponent;
  let fixture: ComponentFixture<LogempComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LogempComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LogempComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
