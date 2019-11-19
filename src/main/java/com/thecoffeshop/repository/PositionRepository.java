package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PositionRepository extends JpaRepository<Position, String>, JpaSpecificationExecutor<Position> {

}