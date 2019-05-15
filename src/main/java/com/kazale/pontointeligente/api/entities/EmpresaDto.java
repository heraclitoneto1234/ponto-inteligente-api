package com.kazale.pontointeligente.api.entities;

public class EmpresaDto {
	
	private long id;
	private String cnpj;
	private String razaoSocial;
	
	public EmpresaDto(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	@Override
	public String toString(){
		
		return "EmpresaDto[id=" + id +", razaoSocial=" + razaoSocial + ",cnpj=" + cnpj + "]";
	}

}
