package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.ProductDAOImp;
import com.thecoffeshop.entity.Product;
import com.thecoffeshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductDAO implements ProductDAOImp {
	@Autowired
	ProductRepository productRepository;

	@Override
	public Boolean addProduct(Product product) {
		Boolean aBoolean;
		try{
			productRepository.save(product);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public List<Product> findAll() {
		return null;
	}

	@Override
	public List<Product> findLimit(int startPosition) {
		return null;
	}

	@Override
	public List<Product> getListProductLimit(int startPosition, String cgPrdId, String strSearch, String isHotDeal, String priceAZ, String priceZA, String productid) {
		return null;
	}

	@Override
	public Boolean checkExistCategoryProduct(String categoryproductid) {
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
	public Product getInfoById(String productid) {
		return productRepository.findById(productid).get();
	}

	@Override
	public Boolean checkExistNameProduct(String name) {
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
	public Boolean checkIsNewProduct(String productid) {
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
	public Boolean deleteProduct(String productid) {
		Boolean aBoolean;
		try{
			productRepository.deleteById(productid);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editProduct(Product product) {
		Boolean aBoolean;
		try{
			productRepository.save(product);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}
}
