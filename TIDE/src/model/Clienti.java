package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "clienti")

public class Clienti implements Serializable {
	@Id
	@Column(name="id_cliente")
	private String id_cliente;
	@Column(name="ragione_soc")
	private String ragione_soc;
	@Column(name="piva")
	private String piva;
	@Column(name="recapito")
	private String recapito;
	@Column(name="cf")
	private String cf;
	@Column(name="telefono")
	private String telefono;
	@Column(name="id_referente")
	private int id_referente;

	public String getId_cliente(){
		return id_cliente;
	}
	public void setId_cliente(String id_cliente){
		this.id_cliente=id_cliente;
	}
	public String getRagione_soc(){
		return ragione_soc;
	}
	public void setRagione_soc(String ragione_soc){
		this.ragione_soc=ragione_soc;
	}
	public String getPiva(){
		return piva;
	}
	public void setPiva(String piva){
		this.piva=piva;
	}
	public String getRecapito(){
		return recapito;
	}
	public void setRecapito(String recapito){
		this.recapito=recapito;
	}
	public String getCf(){
		return cf;
	}
	public void setCf(String cf){
		this.cf=cf;
	}
	public String getTelefono(){
		return telefono;
	}
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
	public int getId_referente(){
		return id_referente;
	}
	public void setId_referente(int id_referente){
		this.id_referente=id_referente;
	}
	
}

