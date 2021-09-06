package com.dailycodebuffer.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data                               // we used lombok to create getter, setter and constructor
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id                            // User Id will be primary key
    @GeneratedValue(strategy = GenerationType.AUTO)   // it will generate automatic value
    private Long userId;          //define properties of user
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;

}
