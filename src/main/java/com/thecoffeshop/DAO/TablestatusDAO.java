package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.TablestatusDAOImp;
import com.thecoffeshop.entity.Tablestatus;
import com.thecoffeshop.repository.TablestatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TablestatusDAO implements TablestatusDAOImp {
	@Autowired
	TablestatusRepository tablestatusRepository;

	@Override
	public Boolean addTablestatus(Tablestatus tablestatus) {
		Boolean aBoolean;
		try{
			tablestatusRepository.save(tablestatus);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public List<Tablestatus> findAll() {
		return null;
	}

	@Override
	public List<Tablestatus> findLimit(int startPosition) {
		return null;
	}

	@Override
	public Tablestatus getInfoById(int tablestatusid) {
		return null;
	}

	@Override
	public Boolean checkExist(String name) {
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
	public Boolean deleteTablestatus(int tablestatusid) {
		Boolean aBoolean;
		try{
			tablestatusRepository.deleteById(tablestatusid);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editTablestatus(Tablestatus tablestatus) {
		Boolean aBoolean;
		try{
			tablestatusRepository.save(tablestatus);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}
}