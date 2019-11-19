package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MaterialRepository extends JpaRepository<Material, Integer>, JpaSpecificationExecutor<Material> {

}