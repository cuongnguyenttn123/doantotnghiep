package com.thecoffeshop.DAO;

import com.thecoffeshop.DAOImpl.BillDAOImp;
import com.thecoffeshop.entity.Bill;
import com.thecoffeshop.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BillDAO implements BillDAOImp {
    @Autowired
    BillRepository repository;

    @Override
    public int addBill(Bill bill) {
        int lastId;
        try {
            repository.save(bill);
            lastId = bill.getBillid();
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            lastId = -1;
        }
        return lastId;
    }

    @Override
    public List<Bill> findAll() {
        return repository.findAllByIsdelete(this.IS_NOT_DELETE);
    }

    @Override
    public List<Bill> findLimit(int startPosition) {
        return repository.findAllByLimit(this.IS_NOT_DELETE,startPosition, this.MAX_RESULTS);
    }

    @Override
    public Bill getInfoById(int billid) {
        return repository.findById(billid).get();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Boolean deleteBill(int billid) {
        Boolean aBoolean;
        try {
            repository.deleteById(billid);
            aBoolean = true;
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            aBoolean = false;
        }
        return aBoolean;
    }

    @Override
    public Boolean editBill(Bill bill) {
        Boolean aBoolean;
        try {
            repository.save(bill);
            aBoolean = true;
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            aBoolean = false;
        }
        return aBoolean;
    }

    @Override
    public Boolean checkExistBillStatus(String billstatusid) {
        Boolean aBoolean;
        List<Bill> billList;
        try {
            billList = repository.checkExistBillStatus(billstatusid);
            if (billList.size()!= 0){
                aBoolean = true;
            }else {
                aBoolean= false;
            }
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            aBoolean = false;
        }
        return aBoolean;
    }

    @Override
    public Boolean checkExistVoucher(int voucherid) {
        Boolean aBoolean;
        List<Bill> billList;
        try {
            billList = repository.checkExistVoucher(voucherid);
            if (billList.size()!= 0){
                aBoolean = true;
            }else {
                aBoolean= false;
            }
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            aBoolean = false;
        }
        return aBoolean;
    }

    @Override
    public Boolean checkExistDinnerTable(int dinnerTableId) {
        Boolean aBoolean;
        List<Bill> billList;
        try {
            billList = repository.checkExistDinnerTable(dinnerTableId);
            if (billList.size()!= 0){
                aBoolean = true;
            }else {
                aBoolean= false;
            }
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            aBoolean = false;
        }
        return aBoolean;
    }

    @Override
    public int getTotalPriceOfBill(int billid) {
        return 0;
    }

    @Override
    public Bill getInfoLastBill(int dinnertableid) {
        return null;
    }

    @Override
    public int thongkeTongTienTrongNgay(Date date) {
        return 0;
    }

    @Override
    public int thongkeSoHoaDonTrongNgay(Date date) {
        return 0;
    }

    @Override
    public int thongkeTongTienTrongTuan(int tuan) {
        return 0;
    }

    @Override
    public int thongkeSoHoaDonTrongTuan(int tuan) {
        return 0;
    }

    @Override
    public int thongkeTongTienTrongThang(int thang) {
        return 0;
    }

    @Override
    public int thongkeSoHoaDonTrongThang(int thang) {
        return 0;
    }
}
