package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Integer id) {
        Employee emp = service.getEmployeeById(id);
        if (emp == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(emp);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Integer id, @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        boolean removed = service.deleteEmployee(id);
        if (!removed) return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }
}
