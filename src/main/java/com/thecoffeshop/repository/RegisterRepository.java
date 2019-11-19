package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegisterRepository extends JpaRepository<Register, String>, JpaSpecificationExecutor<Register> {

}