package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Importbill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ImportbillRepository extends JpaRepository<Importbill, Integer>, JpaSpecificationExecutor<Importbill> {

}