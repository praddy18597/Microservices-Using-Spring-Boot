package com.dailycodebuffer.departmentservice.controller;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")   //will request the
@Slf4j                            //adding the loggers as well
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;  //will create object of service

    // method for save the department
    @PostMapping("/")   // so basically / is an URL endpoint. whenever i will hit /department/PostMapping
    public Department saveDepartment(@RequestBody Department department){ // and i will pass department as a request body then i will able to save department in our database
        log.info("Inside saveDepartment method of DepartmentController");  //adding the log info
        return departmentService.saveDepartment(department);
    }

    // method for the get the department based on department ID
    @GetMapping("/{id}")  // we pass id in GetMapping
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {  //this id will be PathVariable
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}

