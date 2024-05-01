package com.example.SpringRestApi.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestApi.entity.Employeedetails;

public interface EmployeeRepository extends JpaRepository<Employeedetails, Long>{

}
