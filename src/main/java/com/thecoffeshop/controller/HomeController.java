package com.thecoffeshop.controller;

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
        List<Employee> employees12 = employeeService.findAll();
        List<Employee> employees = employeeService.findLimit(1);
        Boolean aBoolean = employeeService.checkExistUseName("admin");
        Employee employee = employeeService.getInfoById("2");
        employee.setUserName("admin update");
        Employee employee1 = new Employee();
        employee1.setUserName("thu ngan");
        employee1.setEmployeeId("7");
        employee1.setName("NguyenHoangNgan");
        employee1.setDelete(false);
        employee1.setSex(true);
        employee1.setPassWord("123456");
        employee1.setAddRess("Duc lam duc tho ha tinh");
        Boolean aBoolean12 = employeeService.addEmployee(employee1);
        Boolean aBoolean1 = employeeService.editEmployee(employee);
        return "home";
    }
}
