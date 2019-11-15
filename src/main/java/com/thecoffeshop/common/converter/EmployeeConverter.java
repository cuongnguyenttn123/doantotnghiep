package com.thecoffeshop.common.converter;

import com.thecoffeshop.entity.Employee;

import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.List;

@Converter
public class EmployeeConverter {
    public List<Employee> converterIsDelete(List<Employee> employees){
        List<Employee> employees1 = new ArrayList<>();
        for (Employee x: employees) {
            if (x.getDelete()!=true){
                Employee employee = new Employee();
                employee.setEmployeeId(x.getEmployeeId());
                employee.setName(x.getName());
                employee.setSex(x.isSex());
                employee.setAddRess(x.getAddRess());
                employee.setUserName(x.getUserName());
                employee.setPassWord(x.getPassWord());
                employee.setDelete(x.getDelete());
                employee.setUpDateAt(x.getUpDateAt());
                employees1.add(employee);
            }
        }
        return employees1;
    }
}
