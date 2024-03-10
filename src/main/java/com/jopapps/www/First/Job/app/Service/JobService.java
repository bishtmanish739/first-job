package com.jopapps.www.First.Job.app.Service;

import com.jopapps.www.First.Job.app.Service.Dto.Job;

import java.util.List;

public interface JobService {
    public Job postJob(Job job);
    public List<Job> findAll();
}
