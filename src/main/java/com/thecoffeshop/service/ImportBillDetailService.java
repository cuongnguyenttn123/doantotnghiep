package com.thecoffeshop.service;

import com.thecoffeshop.DAO.ImportbilldetailDAO;
import com.thecoffeshop.DAOImpl.ImportbilldetailDAOImp;
import com.thecoffeshop.entity.Importbilldetail;
import com.thecoffeshop.entity.ImportbilldetailId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class ImportBillDetailService implements ImportbilldetailDAOImp {

	@Autowired
	ImportbilldetailDAO importbilldetailDAO;

	@Override
	public Boolean addImportbilldetail(Importbilldetail importbilldetail) {
		// TODO Auto-generated method stub
		return importbilldetailDAO.addImportbilldetail(importbilldetail);
	}

	@Override
	public List<Importbilldetail> getInfoByImportbillid(int importbillid) {
		// TODO Auto-generated method stub
		return importbilldetailDAO.getInfoByImportbillid(importbillid);
	}

	@Override
	public Importbilldetail getInfoByImportbilldetailId(ImportbilldetailId id) {
		// TODO Auto-generated method stub
		return importbilldetailDAO.getInfoByImportbilldetailId(id);
	}

	@Override
	public Boolean deleteImportbilldetail(Importbilldetail importbilldetail) {
		// TODO Auto-generated method stub
		return importbilldetailDAO.deleteImportbilldetail(importbilldetail);
	}

	@Override
	public Boolean editImportbilldetail(Importbilldetail importbilldetail) {
		// TODO Auto-generated method stub
		return importbilldetailDAO.editImportbilldetail(importbilldetail);
	}

	@Override
	public int getNumberImportbilldetail(int importbillid) {
		// TODO Auto-generated method stub
		return importbilldetailDAO.getNumberImportbilldetail(importbillid);
	}

	@Override
	public Boolean checkExistMaterialDetail(int materialdetailid) {
		// TODO Auto-generated method stub
		return importbilldetailDAO.checkExistMaterialDetail(materialdetailid);
	}

}
