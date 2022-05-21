package com.acadmaster.springRest.service;

import com.acadmaster.springRest.entity.Department;
import com.acadmaster.springRest.repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

//addDep, deleteDep, updateDep, allStudentinDep
@Service
public class departmentService {

    @Autowired
    private departmentRepository dpr;

    @Transactional
    private Department addDepartment(Department department){
        return dpr.save(department);
    }

    @Transactional
    private  void deleteDepartment(int id){
//        Department dep = dpr.findById(id).get();
        dpr.deleteById(id);
    }

    @Transactional
    private Department upadteDepartment(int id, Department dep){
        dep.setDepartmentId(id);
        return dpr.save(dep);
    }

    private List<Department> allDepartment(){
        return dpr.findAll();
    }

    private Department getDepartment(int id){
        return dpr.findById(id).get();
    }


}
