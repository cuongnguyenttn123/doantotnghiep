package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>, JpaSpecificationExecutor<Employee> {
    Employee findByUserNameAndPassWord(String userName, String passWord);
    Employee findByUserName(String useName);
}
