package com.tigerit.springbootcrud.repository;

import com.tigerit.springbootcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
