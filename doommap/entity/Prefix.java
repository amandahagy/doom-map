package com.doommap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_address_prefix")
public class Prefix {

	@Id
	@SequenceGenerator(name="address_prefix",sequenceName="sq_tbl_address_prefix",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="address_prefix")
	@Column(name="id_address_prefix")
	private Integer id;
	
	@Column(name="ds_address_prefix",length=10,nullable=false,unique=true)
	private String addressPrefix;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddressPrefix() {
		return addressPrefix;
	}

	public void setAddressPrefix(String addressPrefix) {
		this.addressPrefix = addressPrefix;
	}
}
