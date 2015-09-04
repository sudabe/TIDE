package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "progetti")


public class Progetti implements Serializable  {
	@Id
	@Column(name="id_progetti")
	private String id_progetti;
	@Column(name= "id_cliente")
	private String id_cliente;
	@Column(name= "nome_progetto")
	private String nome_progetto;
	@Column(name= "data_iniz_pianif")
	private String data_iniz_pianif;
	@Column(name= "data_cons_pianif")
	private String data_cons_pianif;
	@Column(name= "ore_pianf_tot")
    private int	ore_pianf_tot;
	@Column(name= "data_iniz_effettiva")
    private String data_iniz_effettiva;
	@Column(name= "data_cons_effettiva")
    private String data_cons_effettiva;
	@Column(name= "ore_scosta_tot")
    private int ore_scosta_tot;
	@Column(name= "indice_compl_prog")
    private int indice_compl_prog;//complexity of project
	@Column(name= "technologia")
    private String technologia;
   
    public String getId_progetti(){
    	return id_progetti;
    }
    public void setId_progetti(String id_progetti){
    	this.id_progetti=id_progetti;
    }
    public String getId_cliente(){
    	return id_cliente;
    }
    public void setId_cliente(String id_cliente){
    	this.id_cliente=id_cliente;
    }
    public String getNome_progetto(){
    	return nome_progetto;
    }
    public void setNome_progetto(String nome_progetto){
    	this.nome_progetto=nome_progetto; 
    }
    public String getData_iniz_pianif(){
    	return data_iniz_pianif;
    }
    public void setData_iniz_pianif(String data_iniz_pianif){
    	this.data_iniz_pianif=data_iniz_pianif;
    }
    public String getData_cons_pianif(){
    	return data_cons_pianif;
    }
    public void setData_cons_pianif(String data_cons_pianif){
    	this.data_cons_pianif=data_cons_pianif;
    }
    public int getOre_pianf_tot(){
    	return ore_pianf_tot;
    }
    public void setOre_pianf_tot(int ore_pianf_tot){
    	this.ore_pianf_tot=ore_pianf_tot; 	
    }
    public String getData_iniz_effettiva(){
    	return data_iniz_effettiva;
    }
    public void setData_iniz_effettiva(String data_iniz_effettiva){
    	this.data_iniz_effettiva=data_iniz_effettiva;
    }
    public String getData_cons_effettiva(){
    	return data_cons_effettiva;
    }
    public void setData_cons_effettiva(String data_cons_effettiva){
    	this.data_cons_effettiva=data_cons_effettiva;
    }
    public int getOre_scosta_tot(){
    	return ore_scosta_tot;
    }
    public void setOre_scosta_tot(int ore_scosta_tot){
    	this.ore_scosta_tot=ore_scosta_tot;
    }
    public int getIndice_compl_prog(){
    	return indice_compl_prog;
    }
    public void setIndice_compl_prog(int indice_compl_prog){
    	this.indice_compl_prog=indice_compl_prog;
    }
    public String getTechnologia(){
    	return technologia;
    }
    public void setTechnologia(String technologia){
    	this.technologia=technologia;
    }
 
}
