package com.jopapps.www.First.Job.app.Service.ServiceImpl;

import com.jopapps.www.First.Job.app.Repository.JobRepository;
import com.jopapps.www.First.Job.app.Entity.Job;
import com.jopapps.www.First.Job.app.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class JobServiceImpl implements JobService {
    @Autowired
    JobRepository jobRepository;
    @Override
    public Job postJob(Job job) {
        return job;
    }

    @Override
    public List<Job> findAll() {
        List<Job> allJobs= jobRepository.findAll();

        return allJobs;
    }

    @Override
    public List<Job> findAllJobByCompanyId(Long id) {
        return jobRepository.findAllByCompanyId(id);
    }

    @Override
    public Job getJobById(Long id) {
      return  null;

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
