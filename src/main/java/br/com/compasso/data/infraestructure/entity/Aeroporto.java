package br.com.compasso.data.infraestructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Aeroporto {

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AERO_SEQ")
//	@SequenceGenerator(sequenceName = "aeroporto_seq", allocationSize = 1, name = "AERO_SEQ")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
