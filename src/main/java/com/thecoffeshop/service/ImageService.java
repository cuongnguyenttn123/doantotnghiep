package com.thecoffeshop.service;

import com.thecoffeshop.DAO.ImageDAO;
import com.thecoffeshop.DAOImpl.ImageDAOImp;
import com.thecoffeshop.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class ImageService implements ImageDAOImp {

	@Autowired
	private ImageDAO imageDAO;

	@Override
	public List<Image> getListImageOfProduct(String PId) {

		return imageDAO.getListImageOfProduct(PId);
	}

}
