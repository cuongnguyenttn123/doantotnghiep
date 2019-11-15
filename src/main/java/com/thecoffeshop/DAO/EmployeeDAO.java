package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.EmployeeDAOImp;
import com.thecoffeshop.entity.Employee;
import com.thecoffeshop.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import java.util.List;

@Repository
@org.springframework.transaction.annotation.Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class EmployeeDAO implements EmployeeDAOImp {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> findLimit(int startPosition) {
        List<Employee> employees;
        try {
            int size = employeeRepository.findAll().size();
            int fromIndex = startPosition*this.MAX_RESULTS;
            int toIndex = startPosition*this.MAX_RESULTS+this.MAX_RESULTS;
            if (size>toIndex){
                employees = employeeRepository.findAll().subList(fromIndex, toIndex);
            }else {
                employees = employeeRepository.findAll().subList(fromIndex, size);
            }
        }catch (Exception e){
            e.printStackTrace();
            employees = null;
        }
        return employees;
    }

    @Override
    public Boolean addEmployee(Employee employee) {
        Boolean aBoolean = false;
        try {
            employeeRepository.save(employee);
            aBoolean = true;
        }catch (Exception e){
            e.printStackTrace();
            aBoolean = false;
        }
        return aBoolean;
    }

    @Override
    public String logIn(String username, String password) {
        String employeeId = "";
        Employee employee;
        try{
            employee = employeeRepository.findByUserNameAndPassWord(username, password);
            employeeId = employee.getEmployeeId();
        }catch (Exception e){
            e.printStackTrace();
        }
        return employeeId;
    }

    @Override
    public Employee getInfoById(String employeeid) {
        return employeeRepository.findById(employeeid).get();
    }

    @Override
    public Boolean checkExistUseName(String usename) {
        Boolean aBoolean = false;
        Employee employee;
        try {
            employee = employeeRepository.findByUserName(usename);
            if (employee != null){
                aBoolean = true;
            } else {
                aBoolean = false;
            }
        }catch (Exception e){
            e.printStackTrace();
            aBoolean = false;
        }
        return aBoolean;
    }

    @Override
    public Boolean deleteEmployee(String employeeid) {
        Boolean aBoolean = false;
        try {
            employeeRepository.deleteById(employeeid);
            aBoolean = true;
        }catch (Exception e){
            e.printStackTrace();

        }
        return aBoolean;
    }

    @Override
    @Transactional
    public Boolean editEmployee(Employee employee) {
        Boolean aBoolean = false;
        try {
            employeeRepository.save(employee);
            aBoolean = true;
        }catch (Exception e){

            e.printStackTrace();
            aBoolean = false;
        }
        return aBoolean;
    }
}
