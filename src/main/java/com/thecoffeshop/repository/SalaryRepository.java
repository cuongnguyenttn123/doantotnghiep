package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalaryRepository extends JpaRepository<Salary, Integer>, JpaSpecificationExecutor<Salary> {

}