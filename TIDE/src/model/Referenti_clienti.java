package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "referenti_clienti")

public class Referenti_clienti implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="id_referente")
	private int id_referente;
	@Column(name="id_cliente")
	private String id_cliente;
	@Column(name="nome")
	private String nome;
	@Column(name="cognome")
	private String cognome;
	@Column(name="recapito")
	private String recapito;
	@Column(name="email")
	private String email;
	
	public int getId_referente(){
		return id_referente;
	}
	public void setId_referente(int id_referente){
		this.id_referente=id_referente;
	}
	public String getId_cliente(){
		return id_cliente;
	}
	public void setId_cliente(String id_cliente){
		this.id_cliente=id_cliente;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getCognome(){
		return cognome;
	}
	public void setCognome(String cognome){
		this.cognome=cognome;
	}
	public String getRecapito(){
		return recapito;
	}
	public void setRecapito(String recapito){
		this.recapito=recapito;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	

}
