package com.doommap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
public class User {
	
	@Id
	@SequenceGenerator(name="user",sequenceName="sq_tbl_user",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user")
	@Column(name="id_user")
	private Integer id;
	
	@Column(name="ds_pwd",length=15,nullable=false)
	private String pwd;

	@Column(name="nm_name",length=70,nullable=false)
	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}