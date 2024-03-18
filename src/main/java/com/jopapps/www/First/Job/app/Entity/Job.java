package com.jopapps.www.First.Job.app.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  Long id;
    private String jobTitle;
    private  String JobDescription;
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
    @ManyToOne
    private Company company;

    @ManyToMany
    private  List<Profile> applicant;
    @ManyToMany
    private  List<Profile> shortlistedApplicant;


}
