package com.tigerit.testspb.springbootcrud.repository;

import com.tigerit.testspb.springbootcrud.model.Department;
import com.tigerit.testspb.springbootcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
