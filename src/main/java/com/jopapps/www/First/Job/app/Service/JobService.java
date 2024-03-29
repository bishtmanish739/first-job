package com.jopapps.www.First.Job.app.Service;

import com.jopapps.www.First.Job.app.Entity.Job;

import java.util.List;

public interface JobService {
    public Job postJob(Job job);
    public List<Job> findAll();
    public  List<Job> findAllJobByCompanyId(Long id);
    Job getJobById(Long id);

    Job deleteJobById(Long id);

    Job updateJobById(Long id, Job job);
}
