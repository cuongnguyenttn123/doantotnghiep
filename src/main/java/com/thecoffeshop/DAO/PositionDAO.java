package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.PositionDAOImp;
import com.thecoffeshop.entity.Position;
import com.thecoffeshop.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PositionDAO implements PositionDAOImp {
	@Autowired
	PositionRepository positionRepository;

	@Override
	public Boolean addPosition(Position position) {
		Boolean aBoolean;
		try{
			positionRepository.save(position);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public List<Position> findAll() {
		return positionRepository.findAllByIsdelete(this.IS_NOT_DELETE);
	}

	@Override
	public List<Position> findLimit(int start) {
		return positionRepository.findAllLimit(this.IS_NOT_DELETE, start*this.MAX_RESULTS, this.MAX_RESULTS);
	}

	@Override
	public Position getInfoById(String positionid) {
		return positionRepository.findById(positionid).get();
	}

	@Override
	public Position getInfoByName(String name) {
		Position position;
		try {
			position = positionRepository.findByIsdeleteAndName(this.IS_NOT_DELETE, name);
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			position = null;
		}
		return position;
	}

	@Override
	public Boolean deletePosition(String positionid) {
		Boolean aBoolean;
		try{
			positionRepository.deleteById(positionid);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}

	@Override
	public Boolean editPosition(Position position) {
		Boolean aBoolean;
		try{
			positionRepository.save(position);
			aBoolean = true;
		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			aBoolean = false;
		}
		return aBoolean;
	}
}