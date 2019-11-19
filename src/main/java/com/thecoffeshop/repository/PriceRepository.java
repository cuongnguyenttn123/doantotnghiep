package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Price;
import com.thecoffeshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface PriceRepository extends JpaRepository<Price, Integer>, JpaSpecificationExecutor<Price> {
    @Query(value = "select * from price p where p.productid = ?1 and p.isdelete = ?2 and p.startdatetime <= ?3 order by p.startdatetime DESC limit ?4",
            nativeQuery = true
    )
    Price getSinglePriceOfBillDetail(String productid,Boolean aBoolean, Date startdatetime, int limit);

}