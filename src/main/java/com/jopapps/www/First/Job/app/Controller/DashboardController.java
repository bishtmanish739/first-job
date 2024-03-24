package com.jopapps.www.First.Job.app.Controller;

import com.jopapps.www.First.Job.app.Entity.Job;
import com.jopapps.www.First.Job.app.Service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardController {
    @Autowired
    DashboardService dashboardService;

    @GetMapping("/user/{id}/recommended")
    ResponseEntity<List<Job>>  getRecommendedJob(@PathVariable Long profileId){
        return  ResponseEntity.ok(dashboardService.getRecommendedJobByProfileId(profileId));
    }
}
