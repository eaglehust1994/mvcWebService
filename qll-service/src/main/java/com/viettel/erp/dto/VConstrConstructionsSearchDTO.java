/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.erp.dto;



import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thuannht
 */
@XmlRootElement(name = "V_CONSTR_CONSTRUCTIONSBO")
public class VConstrConstructionsSearchDTO implements Serializable{

	private static final long serialVersionUID = -7525957447922763873L;

	private java.lang.String contractNo;
	private java.lang.Long projectId;
	private java.lang.String investProjectName;
	private java.lang.String constrtCode;
	private java.lang.String constrtName;
	private java.lang.String partnerName;
	private java.lang.Long partnerId;
	private java.lang.Long constrType;
	private java.lang.Long provinceId;
	public java.lang.String getContractNo() {
		return contractNo;
	}
	public void setContractNo(java.lang.String contractNo) {
		this.contractNo = contractNo;
	}
	public java.lang.Long getProjectId() {
		return projectId;
	}
	public void setProjectId(java.lang.Long projectId) {
		this.projectId = projectId;
	}
	public java.lang.String getConstrtCode() {
		return constrtCode;
	}
	public void setConstrtCode(java.lang.String constrtCode) {
		this.constrtCode = constrtCode;
	}
	public java.lang.String getConstrtName() {
		return constrtName;
	}
	public void setConstrtName(java.lang.String constrtName) {
		this.constrtName = constrtName;
	}
	public java.lang.Long getConstrType() {
		return constrType;
	}
	public void setConstrType(java.lang.Long constrType) {
		this.constrType = constrType;
	}
	public java.lang.Long getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(java.lang.Long provinceId) {
		this.provinceId = provinceId;
	}
	public java.lang.String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(java.lang.String partnerName) {
		this.partnerName = partnerName;
	}
	public java.lang.Long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(java.lang.Long partnerId) {
		this.partnerId = partnerId;
	}
	public java.lang.String getInvestProjectName() {
		return investProjectName;
	}
	public void setInvestProjectName(java.lang.String investProjectName) {
		this.investProjectName = investProjectName;
	}


   
}
