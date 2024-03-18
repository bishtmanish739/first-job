package com.jopapps.www.First.Job.app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long id;
    private  String reviewDescription;
    private  double rating;
    private  Long likes;
    private  Long dislikes;
    @ManyToOne
    private Profile profile;
    @ManyToOne
    private  Company company;



}
