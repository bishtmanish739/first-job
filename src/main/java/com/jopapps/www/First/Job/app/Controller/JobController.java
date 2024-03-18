package com.jopapps.www.First.Job.app.Controller;

import com.jopapps.www.First.Job.app.Entity.Job;
import com.jopapps.www.First.Job.app.Service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class JobController {
   @Autowired
    JobService jobService;

    Logger logger= LoggerFactory.getLogger(JobController.class);;

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getAllJobs(){
        List<Job> jobs= jobService.findAll();
        if(jobs==null){
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(jobs, HttpStatus.OK);

    }
    @PostMapping("/jobs")
    public ResponseEntity<Job> postJob(@RequestBody Job job){
        return ResponseEntity.ok(jobService.postJob(job));

    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobsById(@PathVariable Long id){
        return ResponseEntity.ok(jobService.getJobById(id));

    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<Job> deleteJobsById(@PathVariable Long id){
        return ResponseEntity.ok(jobService.deleteJobById(id));

    }

    @PatchMapping("/jobs")
    public ResponseEntity<Job> updateJobsById(@RequestParam("jobId") Long id,@RequestBody Job job){
        logger.info("Rest Request to update job id {},{}",id,job);

        return ResponseEntity.ok(jobService.updateJobById(id,job));

    }
}
