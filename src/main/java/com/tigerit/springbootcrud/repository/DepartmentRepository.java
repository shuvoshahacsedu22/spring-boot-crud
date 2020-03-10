package com.tigerit.springbootcrud.repository;

import com.tigerit.springbootcrud.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
