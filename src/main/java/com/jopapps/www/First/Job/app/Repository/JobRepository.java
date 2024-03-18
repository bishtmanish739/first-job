package com.jopapps.www.First.Job.app.Repository;

import com.jopapps.www.First.Job.app.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  JobRepository extends JpaRepository<Job, Long> {
}
