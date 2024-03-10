package com.jopapps.www.First.Job.app.Service.ServiceImpl;

import com.jopapps.www.First.Job.app.Service.Dto.Job;
import com.jopapps.www.First.Job.app.Service.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class JobServiceImpl implements JobService {
    @Override
    public Job postJob(Job job) {
        return null;
    }

    @Override
    public List<Job> findAll() {
        List<Job> allJobs= new ArrayList<Job>();
        allJobs.add(   new Job(
                1L,   "jobTitle","Job Des",1L,1L,3L,null));
        return allJobs;
    }
}
