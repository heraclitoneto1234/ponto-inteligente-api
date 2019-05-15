package com.kazale.pontointeligente.api.entities;


import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {
	
	private static final long serialVersionUID = 3960436649365666213L;
	
	private long id;
	private String razaoSocial;
	private String cnpj;
	private Data dataCriacao;
	private Data dataAtualizacao;
	private List<Funcionarios> Funcionarios;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Data getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Data dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Data getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Data dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public List<Funcionarios> getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(List<Funcionarios> funcionarios) {
		this.Funcionarios = funcionarios;
	}

}
