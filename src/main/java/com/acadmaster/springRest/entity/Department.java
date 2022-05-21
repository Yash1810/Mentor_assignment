package com.acadmaster.springRest.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    private String departmentName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_department_map",
            joinColumns = @JoinColumn(
                    name = "department_id",
                    referencedColumnName = "departmentId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "rollNo"
            )
    )
    Set<Student> students;
}
