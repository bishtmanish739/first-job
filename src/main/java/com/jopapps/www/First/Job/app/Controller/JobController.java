package com.jopapps.www.First.Job.app.Controller;

import com.jopapps.www.First.Job.app.Service.Dto.Job;
import com.jopapps.www.First.Job.app.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class JobController {
   @Autowired
    JobService jobService;

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getAllJobs(){
        return ResponseEntity.ok(jobService.findAll());

    }
}
