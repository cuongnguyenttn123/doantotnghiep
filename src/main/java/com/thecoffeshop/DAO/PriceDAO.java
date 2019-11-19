package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.PriceDAOImp;
import com.thecoffeshop.entity.Price;
import com.thecoffeshop.entity.Product;
import com.thecoffeshop.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PriceDAO implements PriceDAOImp {
	@Autowired
	PriceRepository priceRepository;

	@Override
	public Boolean addPrice(Price price) {
		Boolean aBoolean;
		try{
			priceRepository.save(price);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Price getInfoById(String prId) {
		return null;
	}

	@Override
	public Price getInfoByProduct(String PId) {
		return null;
	}

	@Override
	public Price getSinglePriceOfBillDetail(String product, Boolean aBoolean, Date startdatetime) {
		return priceRepository.getSinglePriceOfBillDetail(product, aBoolean, startdatetime, 1);
	}

	@Override
	public Boolean editPrice(Price price) {
		Boolean aBoolean;
		try{
			priceRepository.save(price);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Price getNewPrice(String PId) {
		return null;
	}

	@Override
	public int getOldPrice(String PId) {
		return 0;
	}
}
