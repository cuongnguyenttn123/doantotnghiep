package com.thecoffeshop.entity;
// Generated Nov 20, 2018 8:44:18 AM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "theshopcoffee")
public class Customer implements java.io.Serializable {

	private int customerid;
	private String name;
	private String address;
	private Integer phone;
	private Boolean isdelete;
	private Set<Bill> bills = new HashSet<Bill>(0);
	private Set<Booktable> booktables = new HashSet<Booktable>(0);

	public Customer() {
	}

	public Customer(int customerid) {
		this.customerid = customerid;
	}

	public Customer(int customerid, String name, String address, Integer phone, Boolean isdelete, Set<Bill> bills,
			Set<Booktable> booktables) {
		this.customerid = customerid;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.isdelete = isdelete;
		this.bills = bills;
		this.booktables = booktables;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "CUSTOMERID", unique = true, nullable = false)
	public int getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ADDRESS")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "PHONE", precision = 8, scale = 0)
	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Column(name = "ISDELETE")
	public Boolean getIsdelete() {
		return this.isdelete;
	}

	public void setIsdelete(Boolean isdelete) {
		this.isdelete = isdelete;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
	public Set<Bill> getBills() {
		return this.bills;
	}

	public void setBills(Set<Bill> bills) {
		this.bills = bills;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
	public Set<Booktable> getBooktables() {
		return this.booktables;
	}

	public void setBooktables(Set<Booktable> booktables) {
		this.booktables = booktables;
	}

}
