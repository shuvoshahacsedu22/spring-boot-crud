package com.tigerit.springbootcrud.controller;


import com.tigerit.springbootcrud.model.Employee;
import com.tigerit.springbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp/find-all")
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @PostMapping("/emp/save")
    public ResponseEntity create(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @GetMapping("/emp/find-by-id/{id}")
    public ResponseEntity<Employee> findById(@PathVariable Long id) {
        Optional<Employee> person = employeeService.findById(id);
        if (!person.isPresent()) {
            System.out.println("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(person.get());
    }

    @PutMapping("/emp/update-by-id/{id}")
    public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee employee) {
        if (!employeeService.findById(id).isPresent()) {
            System.out.println("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(employeeService.save(employee));
    }

    @DeleteMapping("/emp/delete-by-id/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (!employeeService.findById(id).isPresent()) {
            System.out.println("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        employeeService.deleteById(id);

        return ResponseEntity.ok().build();
    }
}