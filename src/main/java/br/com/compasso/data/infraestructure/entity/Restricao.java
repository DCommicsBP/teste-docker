package br.com.compasso.data.infraestructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Restricao {
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESPO_SEQ")
//	@SequenceGenerator(sequenceName = "resposta_seq", allocationSize = 1, name = "RESPO_SEQ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private String tipo;

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

}
