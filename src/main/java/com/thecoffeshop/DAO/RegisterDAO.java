package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.RegisterDAOImp;
import com.thecoffeshop.entity.Register;
import com.thecoffeshop.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RegisterDAO implements RegisterDAOImp {
	@Autowired
	RegisterRepository registerRepository;

	@Override
	public Boolean addRegister(Register register) {
		Boolean aBoolean;
		try{
			registerRepository.save(register);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Register getInfoById(int registerid) {
		return null;
	}

	@Override
	public List<Register> getListRegisterOnWeek(Date from, Date to) {
		return null;
	}

	@Override
	public Boolean checkExistSchedule(String scheduleid) {
		Boolean aBoolean;
		try{

			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean deleteRegister(Register register) {
		Boolean aBoolean;
		try{
			registerRepository.delete(register);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editRegister(Register register) {
		Boolean aBoolean;
		try{
			registerRepository.save(register);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public List<Register> listByDateScheduleid(Date date, String scheduleid) {
		return null;
	}
}
