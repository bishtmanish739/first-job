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

public class Recruiter {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    private  String firstName;
    private  String lastName;
    private  String middleName;
    private  int age;
    private ZonedDateTime dob;
    private  String profileImage;
    private  String email;
    private  String password;
    @ManyToOne
    private Company company;


}
