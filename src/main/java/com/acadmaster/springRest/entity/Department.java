package com.acadmaster.springRest.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deaprtmentId;
    private String departmentName;

    Set<Student> students;
}
