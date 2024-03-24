package com.jopapps.www.First.Job.app.Service.ServiceImpl;

import com.jopapps.www.First.Job.app.Entity.Job;
import com.jopapps.www.First.Job.app.Service.DashboardService;
import com.jopapps.www.First.Job.app.Service.JobService;
import com.jopapps.www.First.Job.app.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    JobService jobService;
    @Autowired
    ProfileService profileService;
    @Override
    public List<Job> getRecommendedJobByProfileId(Long profileId) {

        return null;
    }

}
