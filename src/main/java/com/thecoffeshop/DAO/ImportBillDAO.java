package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.ImportBillDAOImp;
import com.thecoffeshop.entity.Importbill;
import com.thecoffeshop.repository.ImportbillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ImportBillDAO implements ImportBillDAOImp {
	@Autowired
	ImportbillRepository importbillRepository;

	@Override
	public int addImportBill(Importbill importbill) {
		int lastId;
		try{
			importbillRepository.save(importbill);
			lastId = importbill.getImportbillid();
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			lastId = -1;
		}
		return lastId;
	}

	@Override
	public List<Importbill> findAll() {
		return null;
	}

	@Override
	public List<Importbill> findLimit(int startPosition) {
		return null;
	}

	@Override
	public Importbill getInfoById(int importbillid) {
		return null;
	}

	@Override
	public Boolean deleteImportBill(int importbillid) {
		Boolean aBoolean;
		try{
			importbillRepository.deleteById(importbillid);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editImportBill(Importbill importbill) {
		Boolean aBoolean;
		try{
			importbillRepository.save(importbill);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public int tongtienImportBill(Date date) {
		return 0;
	}

	@Override
	public int soluongImportBill(Date date) {
		return 0;
	}

	@Override
	public int tongtienImportBillTrongTuan(int tuan) {
		return 0;
	}

	@Override
	public int soluongImportBillTrongTuan(int tuan) {
		return 0;
	}

	@Override
	public int tongtienImportBillTrongThang(int thang) {
		return 0;
	}

	@Override
	public int soluongImportBillTrongThang(int thang) {
		return 0;
	}
}
