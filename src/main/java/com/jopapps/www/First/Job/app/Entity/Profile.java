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
    private  int age;
    private ZonedDateTime dob;
    private  String resumeLink;
    private  String profileImage;
    @OneToMany
    private List<Job> appliedJob;
    @OneToMany
    private  List<Job> shortListedJobs;
    @OneToMany
    private  List<Review> reviews;

}
