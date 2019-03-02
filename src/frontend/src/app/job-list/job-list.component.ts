import { Component, OnInit } from '@angular/core';
import {JobService} from "../shared/job/job.service";

@Component({
  selector: 'app-job-list',
  templateUrl: './job-list.component.html',
  styleUrls: ['./job-list.component.scss']
})
export class JobListComponent implements OnInit {
  jobs: Array<any>;

  constructor(private jobService: JobService) { }

  ngOnInit() {
    this.jobService.getAll().subscribe(data => {
      this.jobs= data;
    });
  }

}
