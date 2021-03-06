package com.thecoffeshop.entity;
// Generated Nov 20, 2018 8:44:18 AM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ImportbilldetailId generated by hbm2java
 */
@Embeddable
public class ImportbilldetailId implements java.io.Serializable {

	private int materialdetailid;
	private int importbillid;

	public ImportbilldetailId() {
	}

	public ImportbilldetailId(int materialdetailid, int importbillid) {
		this.materialdetailid = materialdetailid;
		this.importbillid = importbillid;
	}

	@Column(name = "MATERIALDETAILID", nullable = false)
	public int getMaterialdetailid() {
		return this.materialdetailid;
	}

	public void setMaterialdetailid(int materialdetailid) {
		this.materialdetailid = materialdetailid;
	}

	@Column(name = "IMPORTBILLID", nullable = false)
	public int getImportbillid() {
		return this.importbillid;
	}

	public void setImportbillid(int importbillid) {
		this.importbillid = importbillid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ImportbilldetailId))
			return false;
		ImportbilldetailId castOther = (ImportbilldetailId) other;

		return (this.getMaterialdetailid() == castOther.getMaterialdetailid())
				&& (this.getImportbillid() == castOther.getImportbillid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMaterialdetailid();
		result = 37 * result + this.getImportbillid();
		return result;
	}

}
