package com.tigerit.springbootcrud.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "employee_table")
@EntityListeners(AuditingEntityListener.class)
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long employeeId;
    @NotBlank
    @Column(nullable = false)
    private String employeeName;
    @NotBlank
    @Column(nullable = false)
    private String employeeDesignation;
    @NotBlank
    @Column(nullable = false)
    private String employeeEmail;
    @NotBlank
    @Column(nullable = false)
    private String employeeMobile;
    @NotBlank
    @Column(nullable = false)
    private String departmentName;
    @NotNull
    @Column(nullable = false)
    private Long departmentId;
    @NotBlank
    @Column(nullable = false)
    private String joiningDate;
    @NotNull
    @Column(columnDefinition = "bigint default 1")  //this ensures that we can insert without specifying this column
    private Long status;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeMobile='" + employeeMobile + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public Long getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(String employeeMobile) {
        this.employeeMobile = employeeMobile;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getdepartmentId() {
        return departmentId;
    }

    public void setdepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Long getStatus(){return status;}
    public void setStatus(Long status){this.status=status;}

    public Employee(Long employeeId, String employeeName, String employeeDesignation, String employeeEmail, String employeeMobile, String departmentName, Long departmentId, String joiningDate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeEmail = employeeEmail;
        this.employeeMobile = employeeMobile;
        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.joiningDate = joiningDate;
        this.status = 1L;
    }
    public Employee(){
        this.employeeId = null;
        this.employeeName = null;
        this.employeeDesignation = null;
        this.employeeEmail = null;
        this.employeeMobile = null;
        this.departmentName = null;
        this.departmentId = null;
        this.joiningDate = null;
        this.joiningDate = null;
        this.status = 1L;

    }
}