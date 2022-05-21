package com.acadmaster.springRest.service;

import com.acadmaster.springRest.entity.Student;
import com.acadmaster.springRest.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//addstudent, deleteStudent, updateStudent, addDeaprtmenttoStudent
@Service
public class studentService {

    @Autowired
    private studentRepository str;
    @Transactional
    private Student addStudent(Student student){
        return str.save(student);
    }
    @Transactional
    private void deleteStudent(Integer id){
        str.deleteById(id);
    }
    @Transactional
    private Student updateStudent(int id, Student student){
        student.setRollNo(id);
        return str.save(student);
    }

}
