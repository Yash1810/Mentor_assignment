package com.acadmaster.springRest.repository;

import com.acadmaster.springRest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface studentRepository extends JpaRepository<Student, CriteriaBuilder.In> {

}
