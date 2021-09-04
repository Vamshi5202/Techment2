package com.techment.service;

import java.util.List;

import com.techment.entity.Employee;

public interface IEmployeeService {
String addEmployee(Employee employee);
List<Employee> viewAllEmployee();
Employee viewEmployeeById(int id);
void deleteEmployeeById(int id);
void updateEmployee(Employee employee);

}
