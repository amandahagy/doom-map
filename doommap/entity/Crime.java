package com.doommap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_crime")
public class Crime {
	@Id
	@SequenceGenerator(name="crime",sequenceName="sq_tbl_crime",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="crime")
	@Column(name="id_crime")
	private Integer id;
	
	@Column(name="ds_crime",length=20,nullable=false,unique=true)
	private String crime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}
}
