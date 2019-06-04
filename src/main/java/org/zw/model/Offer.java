package org.zw.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by summer on 2017/5/5.
 */
public class Offer implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long offer_id;
	private String offer_name;
	private String offer_type;
	private String description;
	private String prod_spec_id;
	private Double RC;
	private String payType;
	//private Long trademark;
	private Date create_date;
	
	private List<Map> roles;
	private List<Map> OTC;
	private List<Map> features;
	private List<Map> agreements;
	
	
	
	public String getOffer_type() {
		return offer_type;
	}
	public void setOffer_type(String offer_type) {
		this.offer_type = offer_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProd_spec_id() {
		return prod_spec_id;
	}
	public void setProd_spec_id(String prod_spec_id) {
		this.prod_spec_id = prod_spec_id;
	}
	public Double getRC() {
		return RC;
	}
	public void setRC(Double rC) {
		RC = rC;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public List<Map> getRoles() {
		return roles;
	}
	public void setRoles(List<Map> roles) {
		this.roles = roles;
	}
	public List<Map> getOTC() {
		return OTC;
	}
	public void setOTC(List<Map> oTC) {
		OTC = oTC;
	}
	public List<Map> getAgreements() {
		return agreements;
	}
	public void setAgreements(List<Map> agreements) {
		this.agreements = agreements;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<Map> getFeatures() {
		return features;
	}
	public void setFeatures(List<Map> features) {
		this.features = features;
	}
	public Long getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(Long offer_id) {
		this.offer_id = offer_id;
	}
	public String getOffer_name() {
		return offer_name;
	}
	public void setOffer_name(String offer_name) {
		this.offer_name = offer_name;
	}
	@Override
	public String toString() {
		return "Offer [offer_id=" + offer_id + ", offer_name=" + offer_name + ", offer_type=" + offer_type
				+ ", description=" + description + ", prod_spec_id=" + prod_spec_id + ", RC=" + RC + ", payType="
				+ payType + ", create_date=" + create_date + ", roles=" + roles + ", OTC="
				+ OTC + ", features=" + features + ", agreements=" + agreements + "]";
	}

}
