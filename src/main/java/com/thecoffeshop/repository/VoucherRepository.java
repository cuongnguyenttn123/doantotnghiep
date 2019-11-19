package com.thecoffeshop.repository;

import com.thecoffeshop.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VoucherRepository extends JpaRepository<Voucher, Integer>, JpaSpecificationExecutor<Voucher> {

}