package com.dailycodebuffer.departmentservice.service;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j        // Adding the loggers as well
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository; // create object of DepartmentRepository

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);

    }
}
