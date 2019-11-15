package com.thecoffeshop.controller;

import com.thecoffeshop.common.converter.EmployeeConverter;
import com.thecoffeshop.entity.Employee;
import com.thecoffeshop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    EmployeeService employeeService;



    @GetMapping()
    public String getHome(){
        EmployeeConverter employeeConverter = new EmployeeConverter();
        List<Employee> employees12 = employeeService.findAll();
        List<Employee> employees123 = employeeConverter.converterIsDelete(employees12);
        List<Employee> employees = employeeService.findLimit(0);

        return "home";
    }
}
