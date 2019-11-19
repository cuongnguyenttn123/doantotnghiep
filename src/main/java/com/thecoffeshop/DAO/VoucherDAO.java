package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.VoucherDAOImp;
import com.thecoffeshop.entity.Voucher;
import com.thecoffeshop.repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class VoucherDAO implements VoucherDAOImp {
	@Autowired
	VoucherRepository voucherRepository;

	@Override
	public Boolean addVoucher(Voucher voucher) {
		Boolean aBoolean;
		try{
			voucherRepository.save(voucher);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public List<Voucher> findAll() {
		return null;
	}

	@Override
	public List<Voucher> findLimit(int startPosition) {
		return null;
	}

	@Override
	public Voucher findById(int voucherid) {
		return null;
	}

	@Override
	public Voucher findByName(String name) {
		return null;
	}

	@Override
	public Boolean checkVoucher(String name) {
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
	public Boolean deleteVoucher(int voucherid) {
		Boolean aBoolean;
		try{
			voucherRepository.deleteById(voucherid);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editVoucher(Voucher voucher) {
		Boolean aBoolean;
		try{
			voucherRepository.save(voucher);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}
}
