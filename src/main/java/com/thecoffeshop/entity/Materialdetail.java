package com.thecoffeshop.entity;
// Generated Nov 20, 2018 8:44:18 AM by Hibernate Tools 5.1.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Materialdetail generated by hbm2java
 */
@Entity
@Table(name = "materialdetail", catalog = "theshopcoffee")
public class Materialdetail implements java.io.Serializable {

	private int materialdetailid;
	private Material material;
	private Date dateofmanufacture;
	private Date expirationdate;
	private Integer quantity;
	private Integer price;
	private Date updateat;
	private Boolean isdelete;
	private Set<Importbilldetail> importbilldetails = new HashSet<Importbilldetail>(0);
	private Set<Exportbilldetail> exportbilldetails = new HashSet<Exportbilldetail>(0);

	public Materialdetail() {
	}

	public Materialdetail(int materialdetailid) {
		this.materialdetailid = materialdetailid;
	}

	public Materialdetail(int materialdetailid, Material material, Date dateofmanufacture, Date expirationdate,
			Integer quantity, Date updateat, Boolean isdelete, Set<Importbilldetail> importbilldetails,
			Set<Exportbilldetail> exportbilldetails, Integer price) {
		this.materialdetailid = materialdetailid;
		this.material = material;
		this.dateofmanufacture = dateofmanufacture;
		this.expirationdate = expirationdate;
		this.quantity = quantity;
		this.price = price;
		this.updateat = updateat;
		this.isdelete = isdelete;
		this.importbilldetails = importbilldetails;
		this.exportbilldetails = exportbilldetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MATERIALDETAILID", unique = true, nullable = false)
	public int getMaterialdetailid() {
		return this.materialdetailid;
	}

	public void setMaterialdetailid(int materialdetailid) {
		this.materialdetailid = materialdetailid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MATERIALID")
	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEOFMANUFACTURE", length = 10)
	public Date getDateofmanufacture() {
		return this.dateofmanufacture;
	}

	public void setDateofmanufacture(Date dateofmanufacture) {
		this.dateofmanufacture = dateofmanufacture;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRATIONDATE", length = 10)
	public Date getExpirationdate() {
		return this.expirationdate;
	}

	public void setExpirationdate(Date expirationdate) {
		this.expirationdate = expirationdate;
	}

	@Column(name = "QUANTITY")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Column(name = "PRICE")
	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
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

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "materialdetail")
	public Set<Importbilldetail> getImportbilldetails() {
		return this.importbilldetails;
	}

	public void setImportbilldetails(Set<Importbilldetail> importbilldetails) {
		this.importbilldetails = importbilldetails;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "materialdetail")
	public Set<Exportbilldetail> getExportbilldetails() {
		return this.exportbilldetails;
	}

	public void setExportbilldetails(Set<Exportbilldetail> exportbilldetails) {
		this.exportbilldetails = exportbilldetails;
	}

}
