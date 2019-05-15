package com.kazale.pontointeligente.api.entities;

import javax.naming.spi.DirStateFactory.Result;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	
	@PostMapping
	public ResponseEntity<EmpresaDto> cadastrar(
			@Valid @RequestBody EmpresaDto empresaDto, BindingResult result) {
			Response<EmpresaDto> response = new Response<EmpresaDto>();
		
	}

}