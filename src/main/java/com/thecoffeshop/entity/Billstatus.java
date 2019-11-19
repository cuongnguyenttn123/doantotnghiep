package com.thecoffeshop.entity;
// Generated Nov 20, 2018 8:44:18 AM by Hibernate Tools 5.1.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Billstatus generated by hbm2java
 */
@Entity
@Table(name = "billstatus", catalog = "theshopcoffee")
public class Billstatus implements java.io.Serializable {

	private String billstatusid;
	private String name;
	private Date updateat;
	private Boolean isdelete;
	private Set<Bill> bills = new HashSet<Bill>(0);

	public Billstatus() {
	}

	public Billstatus(String billstatusid) {
		this.billstatusid = billstatusid;
	}

	public Billstatus(String billstatusid, String name, Date updateat, Boolean isdelete, Set<Bill> bills) {
		this.billstatusid = billstatusid;
		this.name = name;
		this.updateat = updateat;
		this.isdelete = isdelete;
		this.bills = bills;
	}

	public Billstatus(String billstatusid, String name, Date updateat, Boolean isdelete) {
		this.billstatusid = billstatusid;
		this.name = name;
		this.updateat = updateat;
		this.isdelete = isdelete;
	}

	@Id

	@Column(name = "BILLSTATUSID", unique = true, nullable = false, length = 7)
	public String getBillstatusid() {
		return this.billstatusid;
	}

	public void setBillstatusid(String billstatusid) {
		this.billstatusid = billstatusid;
	}

	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATEAT", length = 19)
	public Date getUpdateat() {
		return this.updateat;
	}

	public void setUpdateat(Date updateat) {
		this.updateat = updateat;
	}

	@Column(name = "ISDELETE")
	public Boolean getIsdelete() {
		return this.isdelete;
	}

	public void setIsdelete(Boolean isdelete) {
		this.isdelete = isdelete;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "billstatus")
	public Set<Bill> getBills() {
		return this.bills;
	}

	public void setBills(Set<Bill> bills) {
		this.bills = bills;
	}

}
