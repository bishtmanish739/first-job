package com.jopapps.www.First.Job.app.Service.Dto;

import lombok.*;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    private  Long id;
    private String jobTitle;
    private  String JobDescription;
    private  Long companyId;
    private  String companyName;

    private Long minExp;
    private  Long maxExp;
    private  Long minSal;
    private  Long maxSal;
    private List<String> skills;
    private  List<String> location;
    private  Long noticePeriod;
    private  String qualification;
    private  List<String> employmentType;
    private  String role;
    private  String industry;
    private  Long openings;
    private  Long applicants;
    private ZonedDateTime postedDate;
    private  Long jobViews;


//    public Job(Long id, String jobTitle, String jobDescription, Long companyId, Long minExp, Long maxExp, List<String> skills) {
//        this.id = id;
//        this.jobTitle = jobTitle;
//        JobDescription = jobDescription;
//        this.companyId = companyId;
//        this.minExp = minExp;
//        this.maxExp = maxExp;
//        this.skills = skills;
//    }
}
