package com.jopapps.www.First.Job.app.Repository;

import com.jopapps.www.First.Job.app.Entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter,Long>{

}