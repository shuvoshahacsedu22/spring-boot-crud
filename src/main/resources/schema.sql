CREATE TABLE IF NOT EXISTS department_table (
    DepartmentID INT AUTO_INCREMENT,
    DepartmentName VARCHAR(255),
    NumberOfEmployee INT DEFAULT 0,
    RunningProjects VARCHAR(255),
    PRIMARY KEY (DepartmentID)
);
CREATE TABLE IF NOT EXISTS employee_table (
    EmployeeID INT AUTO_INCREMENT,
    EmployeeName VARCHAR(255),
    EmployeeDesignation VARCHAR(255),
    EmployeeEmail VARCHAR(255),
    EmployeeMobile VARCHAR(255),
    DepartmentName VARCHAR(255),
    DepartmentID INT,
    JoiningDate VARCHAR(45),
    PRIMARY KEY (EmployeeID),
    FOREIGN KEY (DepartmentID)
        REFERENCES department_table (DepartmentID)
);