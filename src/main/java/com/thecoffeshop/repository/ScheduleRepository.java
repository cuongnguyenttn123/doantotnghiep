package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ScheduleRepository extends JpaRepository<Schedule, String>, JpaSpecificationExecutor<Schedule> {

}