package com.doommap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_bairro")
public class Bairro {

	@Id
	@SequenceGenerator(name="bairro",sequenceName="sq_tbl_bairro",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bairro")
	@Column(name="id_bairro")
	private Integer id;
	
	@Column(name="nm_bairro",length=40,nullable=false,unique=true)
	private String bairro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
