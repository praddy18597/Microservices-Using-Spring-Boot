package com.dailycodebuffer.departmentservice.repository;

import com.dailycodebuffer.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository    // this will extend JPA repository and mention the types Department and ID is of Long
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);

}
