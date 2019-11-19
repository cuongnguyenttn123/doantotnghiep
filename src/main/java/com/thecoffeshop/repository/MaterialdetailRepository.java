package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Materialdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MaterialdetailRepository extends JpaRepository<Materialdetail, Integer>, JpaSpecificationExecutor<Materialdetail> {

}