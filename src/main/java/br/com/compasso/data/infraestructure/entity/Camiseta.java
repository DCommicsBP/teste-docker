package br.com.compasso.data.infraestructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Camiseta {
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAMIS_SEQ")
//	@SequenceGenerator(sequenceName = "camiseta_seq", allocationSize = 1, name = "CAMIS_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private String tipo;
	private String tamanho;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanhos() {
		return tamanho;
	}

	public void setTamanhos(String tamanhos) {
		this.tamanho = tamanhos;
	}

}
