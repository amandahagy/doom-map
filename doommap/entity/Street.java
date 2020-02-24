package com.doommap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_street")
public class Street {

	@Id
	@SequenceGenerator(name="street",sequenceName="sq_tbl_street",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="street")
	@Column(name="id_street")
	private Integer id;
	
	@Column(name="nm_street",length=70,nullable=false)
	private String street;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
