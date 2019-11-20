package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Employee;
import com.thecoffeshop.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer>, JpaSpecificationExecutor<Salary> {
    @Query(
            value = "select * from salary s where s.employeeid = ?1",
            nativeQuery = true
    )
    Salary findBySalaryid(String employeeid);

    Salary findBySalaryidAndIsdelete(int id, Boolean aBoolean);
}