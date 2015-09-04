 package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.*;



@Entity
@Table(name = "utenze")

public class Utenze implements Serializable {
	
		@Id
		@Column(name="id")
		private String id;
		@Column(name= "nome")
		private String nome;
		@Column(name= "cognome")
		private String cognome;
		@Column(name= "sede_di_lavoro")
		private String sede_di_lavoro;
		@Column(name= "data_nascita")
		private String data_nascita;
		@Column(name= "luogo_nascita")
		private String luogo_nascita;
		@Column(name= "residenza")
		private String residenza;
		@Column(name= "indirizzo")
		private String indirizzo;
		@Column(name= "cap")
		private int cap;
		@Column(name= "cf")
		private String cf;
		@Column(name= "iban")
		private String iban;
		@Column(name= "contratto")
		private String contratto;
		@Column(name= "tipo_cont")
		private String tipo_cont;
		@Column(name= "ore_giorno")
		private int ore_giorno;
		@Column(name= "data_iniz_contr")
		private String data_iniz_contr;
		@Column(name= "durata_cont")
		private int durata_cont;
		@Column(name= "costo_mensile")
		private int costo_mensile;
		@Column(name= "periodo_perm_az")
		private int periodo_perm_az;
		@Column(name= "attivo")
		private int attivo;
		@Column(name= "telefono")
		private String telefono;
		@Column(name= "cellulare")
		private String cellulare;
		@Column(name= "email")
		private String email;
		@Column(name= "skype")
		private String skype;
		@Column(name= "password")
		private String password;
		@Column(name="photo")
		private byte[] photo;
		
		
		
		public String getId(){
			return id;
		}
		public void setId(String id){
			this.id=id;
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
		public String getSede_di_lavoro(){
			return sede_di_lavoro;
		}
		public void setSede_di_lavoro(String sede_di_lavoro){
			this.sede_di_lavoro=sede_di_lavoro;
		}
		public String getData_nascita(){
			return data_nascita;
		}
		public void setData_nascita(String data_nascita){
			this.data_nascita=data_nascita;
		}
		public String getLuogo_nascita(){
			return luogo_nascita;
		}
		public void setLuogo_nascita(String luogo_nascita){
			this.luogo_nascita=luogo_nascita;
		}
		public String getResidenza(){
			return residenza;
		}
		public void setResidenza(String residenza){
			this.residenza=residenza;
		}
		public String getIndirizzo(){
			return indirizzo;
		}

		public void setIndirizzo(String indirizzo){
			this.indirizzo=indirizzo;
		}
		public int getCap(){
			return cap;
		}
		public void setCap(int cap){
			this.cap=cap;
		}
		public String getCf(){
			return cf;
		}
		public void setCf(String cf){
			this.cf=cf;
		}
		public String getIban(){
			return iban;
		}
		public void setIban(String iban){
			this.iban=iban;
		}
		public String getContratto(){
			return contratto;
		}
		public void setContratto(String contratto){
			this.contratto=contratto;
		}
		public String getTipo_cont(){
			return tipo_cont;
		}
		public void setTipo_cont(String tipo_cont){
			this.tipo_cont=tipo_cont;
		}

		public int getOre_giorno(){
			return ore_giorno;
		}
		public void setOre_giorno(int ore_giorno){
			this.ore_giorno=ore_giorno;
		}
		public String getData_iniz_contr(){
			return data_iniz_contr;
		}
		public void setData_iniz_contr(String data_iniz_contr){
			this.data_iniz_contr=data_iniz_contr;
		}
		public int getDurata_cont(){
			return durata_cont;
		}
		public void setDurata_cont(int durata_cont){
			this.durata_cont=durata_cont;
		}
		public int getCosto_mensile(){
			return costo_mensile;
		}
		public void setCosto_mensile(int costo_mensile){
			this.costo_mensile=costo_mensile;
		}
		public int getPeriodo_perm_az(){
			return periodo_perm_az;
		}
		public void setPeriodo_perm_az(int periodo_perm_az){
			this.periodo_perm_az=periodo_perm_az;
		}
		public int getAttivo(){
			return attivo;
		}
		public void setAttivo(int attivo){
			this.attivo=attivo;
		}
		public String getTelefono(){
			return telefono;
		}
		public void setTelefono(String telefono){
			this.telefono=telefono;
		}
		public String getCellulare(){
			return cellulare;
		}
		public void setCellulare(String cellulare){
			this.cellulare=cellulare;
		}
		public String getEmail(){
			return email;
		}
		public void setEmail(String email){
			this.email=email;
		}
		public String getSkype(){
			return skype;
		}
		public void setSkype(String skype){
			this.skype=skype;
		}
		public String getPassword(){
			return password;
		}
		public void setPassword(String password){
			this.password=password;
		}
		public byte[] getPhoto(){
	    	return photo;
	    }
	    public void setPhoto(byte[] photo){
	    	this.photo=photo;
	    }
		
}
