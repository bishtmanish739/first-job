package com.jopapps.www.First.Job.app.Service.Dto;

import lombok.*;

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

    private Long minExp;
    private  Long maxExp;
    private List<String> skills;

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
