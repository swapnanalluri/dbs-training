import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SubOneComponent } from './sub-one.component';

describe('SubOneComponent', () => {
  let component: SubOneComponent;
  let fixture: ComponentFixture<SubOneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SubOneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SubOneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
