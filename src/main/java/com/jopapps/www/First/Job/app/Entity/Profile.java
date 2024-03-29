package com.jopapps.www.First.Job.app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Profile {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    private  String firstName;
    private  String lastName;
    private  String middleName;
    private  String email;
    private  String password;
    private  int age;
    private ZonedDateTime dob;
    private  String resumeLink;
    private  String profileImage;
    @ManyToMany(mappedBy = "applicant")
    private List<Job> appliedJob;
    @ManyToMany (mappedBy = "shortlistedApplicant")
    private  List<Job> shortListedJobs;
    @OneToMany(mappedBy = "profile")
    private  List<Review> reviews;

}
