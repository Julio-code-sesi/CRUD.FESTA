package com.teste.festa.Model;

import java.util.UUID;

import com.teste.festa.DTO.FestaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Festa")
public class FestaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)

	private UUID id;
	private String nome;
	private String presente;

	public FestaModel(FestaDTO dto) {
		this.nome = dto.nome();
		this.presente = dto.presente();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPresente() {
		return presente;
	}

	public void setPresente(String presente) {
		this.presente = presente;
	}
	
	
	
}

