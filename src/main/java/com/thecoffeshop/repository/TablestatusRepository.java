package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Tablestatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TablestatusRepository extends JpaRepository<Tablestatus, Integer>, JpaSpecificationExecutor<Tablestatus> {

}