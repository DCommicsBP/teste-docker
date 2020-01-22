package br.com.compasso.data.infraestructure.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Resposta {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESPO_SEQ")
//	@SequenceGenerator(sequenceName = "resposta_seq", allocationSize = 1, name = "RESPO_SEQ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id; 
	@Column(unique = true)
	private String email;
	private String nome;
	private String justificativa;
	private boolean participa;
	private boolean logistica;
	@OneToOne
	private Logistica logisticaIda; 
	@OneToOne
	private Logistica logisticaVolta; 
	

	@ManyToMany
	private List<Atividade> atividades;
	@ManyToMany
	private List<Restricao> restricoes;
	@ManyToOne
	private Camiseta camiseta;
	
	
	public Logistica getLogisticaIda() {
		return logisticaIda;
	}

	public void setLogisticaIda(Logistica logisticaIda) {
		this.logisticaIda = logisticaIda;
	}

	public Logistica getLogisticaVolta() {
		return logisticaVolta;
	}

	public void setLogisticaVolta(Logistica logisticaVolta) {
		this.logisticaVolta = logisticaVolta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	
	public Camiseta getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isParticipa() {
		return participa;
	}

	public void setParticipa(boolean participa) {
		this.participa = participa;
	}

	public boolean isLogistica() {
		return logistica;
	}

	public void setLogistica(boolean logistica) {
		this.logistica = logistica;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public List<Restricao> getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(List<Restricao> restricoes) {
		this.restricoes = restricoes;
	}
}
