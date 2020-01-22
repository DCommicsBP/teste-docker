package br.com.compasso.data.infraestructure.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne; 

import br.com.compasso.data.api.enums.Trajeto;
import br.com.compasso.data.api.enums.Transporte;

@Entity
public class Logistica {
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOGIS_SEQ")
//	@SequenceGenerator(sequenceName = "logistica_seq", allocationSize = 1, name = "LOGIS_SEQ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private Transporte modal;
	@ManyToOne
	private Sede sede;
	@ManyToOne
	private Aeroporto aeroporto;
	private boolean voucher;
	private String percurso;
	private LocalDateTime dataDeEmbarque; 
	private Trajeto trajeto; 
	@ManyToOne
	private Resposta resposta; 
	
	
	public Trajeto getTrajeto() {
		return trajeto;
	}

	public void setTrajeto(Trajeto trajeto) {
		this.trajeto = trajeto;
	}

	public LocalDateTime getDataDeEmbarque() {
		return dataDeEmbarque;
	}

	public void setDataDeEmbarque(LocalDateTime dataDeEmbarque) {
		this.dataDeEmbarque = dataDeEmbarque;
	}

	public Transporte getModal() {
		return modal;
	}

	public void setModal(Transporte modal) {
		this.modal = modal;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Aeroporto getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(Aeroporto aeroporto) {
		this.aeroporto = aeroporto;
	}

	public boolean isVoucher() {
		return voucher;
	}

	public void setVoucher(boolean voucher) {
		this.voucher = voucher;
	}

	public String getPercurso() {
		return percurso;
	}

	public void setPercurso(String percurso) {
		this.percurso = percurso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;	
	}
	

}
