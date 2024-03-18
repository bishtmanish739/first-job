package com.jopapps.www.First.Job.app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Company{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long id;
    private  String name;
    private  String aboutCompany;
    @OneToMany (fetch =FetchType.LAZY,  mappedBy = "company")
    private List<Review>  reviews;
    @OneToMany (fetch =FetchType.LAZY,  mappedBy = "company")

    private List<Job> jobs;

}
