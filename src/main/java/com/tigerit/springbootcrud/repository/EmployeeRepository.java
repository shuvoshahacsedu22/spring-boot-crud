package com.tigerit.springbootcrud.repository;

import com.tigerit.springbootcrud.model.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Override
    @Query("SELECT u FROM Employee u WHERE u.status = 1L")
    public List<Employee> findAll();

    @Override
    @Query("SELECT u FROM Employee u WHERE u.employeeId=?1 and u.status = 1L")
    public Optional<Employee> findById(Long id);

    @Override
    @Modifying(clearAutomatically = true)
    @Query("update Employee employee set employee.status =0L where employee.employeeId =?1")
    public void deleteById(Long id);

}
