package com.jopapps.www.First.Job.app.Service.ServiceImpl;

import com.jopapps.www.First.Job.app.DummyObject;
import com.jopapps.www.First.Job.app.Service.Dto.Job;
import com.jopapps.www.First.Job.app.Service.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class JobServiceImpl implements JobService {
    @Override
    public Job postJob(Job job) {
        return job;
    }

    @Override
    public List<Job> findAll() {
        List<Job> allJobs= new ArrayList<Job>();
        allJobs.add(DummyObject.job);
        return allJobs;
    }

    @Override
    public Job getJobById(Long id) {
      return  DummyObject.job;

    }

    @Override
    public Job deleteJobById(Long id) {
        return null;
    }

    @Override
    public Job updateJobById(Long id, Job job) {
        return null;
    }
}
