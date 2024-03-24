package com.jopapps.www.First.Job.app.Service;

import com.jopapps.www.First.Job.app.Entity.Job;

import java.util.List;

public interface DashboardService {
    List<Job> getRecommendedJobByProfileId(Long profileId);
}
