package com.tigerit.springbootcrud.controller;


import com.tigerit.springbootcrud.model.Department;
import com.tigerit.springbootcrud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/dept/find-all")
    public ResponseEntity<List<Department>> findAll() {
        return ResponseEntity.ok(departmentService.findAll());
    }

    @PostMapping("/dept/save")
    public ResponseEntity create(@RequestBody Department product) {
        return ResponseEntity.ok(departmentService.save(product));
    }

    @GetMapping("/dept/find-by-id/{id}")
    public ResponseEntity<Department> findById(@PathVariable Long id) {
        Optional<Department> department = departmentService.findById(id);
        if (!department.isPresent()) {
            System.out.println("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(department.get());
    }

    @PutMapping("/dept/update-by-id/{id}")
    public ResponseEntity<Department> update(@PathVariable Long id, @Valid @RequestBody Department department) {
        if (!departmentService.findById(id).isPresent()) {
            System.out.println("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(departmentService.save(department));
    }

    @DeleteMapping("/dept/delete-by-id/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (!departmentService.findById(id).isPresent()) {
            System.out.println("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        departmentService.deleteById(id);

        return ResponseEntity.ok().build();
    }
}