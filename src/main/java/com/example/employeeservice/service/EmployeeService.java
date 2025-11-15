package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    private final Map<Integer, Employee> employeeMap = new HashMap<>();

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    public Employee getEmployeeById(Integer id) {
        return employeeMap.get(id);
    }

    public Employee addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        return employee;
    }

    public Employee updateEmployee(Integer id, Employee updated) {
        updated.setId(id);
        employeeMap.put(id, updated);
        return updated;
    }

    public boolean deleteEmployee(Integer id) {
        return employeeMap.remove(id) != null;
    }
}
