package com.tigerit.testspb.springbootcrud.service;

import com.tigerit.testspb.springbootcrud.model.Department;
import com.tigerit.testspb.springbootcrud.model.Employee;
import com.tigerit.testspb.springbootcrud.repository.DepartmentRepository;
import com.tigerit.testspb.springbootcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public void deleteById(Long id) {
        departmentRepository.deleteById(id);
    }
}