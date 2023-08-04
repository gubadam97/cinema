import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ScreeningListComponent } from './screening-list.component';

describe('ScreeningListComponent', () => {
  let component: ScreeningListComponent;
  let fixture: ComponentFixture<ScreeningListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ScreeningListComponent]
    });
    fixture = TestBed.createComponent(ScreeningListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
