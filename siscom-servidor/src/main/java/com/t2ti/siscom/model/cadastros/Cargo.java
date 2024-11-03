package com.t2ti.siscom.model.cadastros;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cargo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String descricao;
	
	private BigDecimal salario;
	
	@Column(name = "CBO_1994")
	private String cbo1994;
	
	@Column(name = "CBO_2022")
	private String cbo2022;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public String getCbo1994() {
		return cbo1994;
	}
	public void setCbo1994(String cbo1994) {
		this.cbo1994 = cbo1994;
	}
	public String getCbo2022() {
		return cbo2022;
	}
	public void setCbo2022(String cbo2022) {
		this.cbo2022 = cbo2022;
	}
	
}
