package com.learn.demo.controllers;

import com.learn.demo.models.Employee;
import com.learn.demo.repositories.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Employee get (@PathVariable Long id) {
        return employeeRepository.getOne(id);
    }


    @PostMapping
    public Employee create (@RequestBody final Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Employee update (@PathVariable Long id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeRepository.getOne(id);
        BeanUtils.copyProperties(employee, existingEmployee, "employee_id");
        return employeeRepository.saveAndFlush(existingEmployee);
    }
}
