package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.ScheduleDAOImp;
import com.thecoffeshop.entity.Schedule;
import com.thecoffeshop.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ScheduleDAO implements ScheduleDAOImp {
	@Autowired
	ScheduleRepository scheduleRepository;

	@Override
	public Boolean addSchedule(Schedule schedule) {
		Boolean aBoolean;
		try{
			scheduleRepository.save(schedule);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public List<Schedule> findAll() {
		return null;
	}

	@Override
	public List<Schedule> findLimit(int startPosition) {
		return null;
	}

	@Override
	public Schedule getInfoById(String scheduleid) {
		return null;
	}

	@Override
	public Boolean deleteSchedule(String scheduleid) {
		Boolean aBoolean;
		try{
			scheduleRepository.deleteById(scheduleid);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editSchedule(Schedule schedule) {
		Boolean aBoolean;
		try{
			scheduleRepository.save(schedule);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}
}