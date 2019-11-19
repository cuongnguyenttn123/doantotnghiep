package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.MaterialdetailDAOImp;
import com.thecoffeshop.entity.Materialdetail;
import com.thecoffeshop.repository.MaterialdetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MaterialdetailDAO implements MaterialdetailDAOImp {
	@Autowired
	MaterialdetailRepository materialdetailRepository;

	@Override
	public int addMaterialdetail(Materialdetail materialdetail) {
		int lastId;
		try{
			materialdetailRepository.save(materialdetail);
			lastId = materialdetail.getMaterialdetailid();
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			lastId = -1;
		}
		return lastId;
	}

	@Override
	public List<Materialdetail> findAll() {
		return null;
	}

	@Override
	public List<Materialdetail> search(String materialdetailid, String name) {
		return null;
	}

	@Override
	public Materialdetail getInfoById(int materialdetailid) {
		return null;
	}

	@Override
	public Boolean deleteMaterialdetail(int materialdetailid) {
		Boolean aBoolean;
		try{
			materialdetailRepository.deleteById(materialdetailid);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editMaterialdetail(Materialdetail materialdetail) {
		Boolean aBoolean;
		try{
			materialdetailRepository.save(materialdetail);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean checkExistMaterial(int materialid) {
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
	public List<Materialdetail> layNguyenLieuTonKho(int materialid) {
		return null;
	}

	@Override
	public int laySoNguyenLieuTonKho(int materialid) {
		return 0;
	}
}