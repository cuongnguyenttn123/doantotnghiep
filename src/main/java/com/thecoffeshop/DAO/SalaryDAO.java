package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.SalaryDAOImp;
import com.thecoffeshop.entity.Salary;
import com.thecoffeshop.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SalaryDAO implements SalaryDAOImp {
	@Autowired
	SalaryRepository salaryRepository;

	@Override
	public Boolean addSalary(Salary salary) {
		Boolean aBoolean;
		try{
			salaryRepository.save(salary);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Salary getInfoById(int salaryid) {
		return salaryRepository.findBySalaryidAndIsdelete(salaryid, this.IS_NOT_DELETE);
	}

	@Override
	public int getSalaryByEmployeeid(String employeeid) {
		return salaryRepository.findBySalaryid(employeeid).getSalaryonhour();
	}

	@Override
	public Boolean deleteSalary(Salary Salary) {
		Boolean aBoolean;
		try{
			salaryRepository.delete(Salary);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editSalary(Salary Salary) {
		Boolean aBoolean;
		try{
			salaryRepository.save(Salary);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}
}