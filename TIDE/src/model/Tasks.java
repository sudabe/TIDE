package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")

public class Tasks implements Serializable {
	@Id
	@Column(name="id_task")
	private int id_task;
	@Column(name="id_cliente")
	private String id_cliente;
	@Column(name="id_progetto")
	private String id_progetto;
	@Column(name="id_attiv_pianif")
	private int id_attiv_pianif;
	@Column(name="data_inizio")
	private String data_inizio;
	@Column(name="data_consegna")
	private String data_consegna;
	@Column(name="descrizione")
	private String descrizione;
	@Column(name="snooze_ore")
	private int snooze_ore;
	@Column(name="freeze")
	private int freeze;
	@Column(name="stato")
	private int stato;
	@Column(name="chiuso")
	private int chiuso;
	@Column(name="data_chiusura")
	private String data_chiusura;
	@Column(name="ore_totali")
	private int ore_totali;
	@Column(name="ind_compl_task")
	private int ind_compl_task;
	@Column(name="predecessore")
	private int predecessore;
	@Column(name="id_relaz_task")
	private int id_relaz_task;
	@Column(name="task_predecessore")
	private String task_predecessore;
	
	public int getId_task(){
		return id_task;
	}
	public void setId_task(int id_task){
		this.id_task=id_task;
	}
	public String getId_cliente(){
		return id_cliente;
	}
	public void setId_cliente(String id_cliente){
		this.id_cliente=id_cliente;
	}
	public String getId_progetto(){
		return id_progetto;
	}
	public void setId_progetto(String id_progetto){
		this.id_progetto=id_progetto;
	}
	public int getId_attiv_pianif(){
		return id_attiv_pianif;
	}
	public void setId_attiv_pianif(int id_attiv_pianif){
		this.id_attiv_pianif=id_attiv_pianif;
	}
	public String getData_inizio(){
		return data_inizio;
	}
	public void setData_inizio(String data_inizio){
		this.data_inizio=data_inizio;
	}
	public String getData_consegna(){
		return data_consegna;
	}
	public void setData_consegna(String data_consegna){
		this.data_consegna=data_consegna;
	}
	public String getDescrizione(){
		return descrizione;
	}
	public void setDescrizione(String descrizione){
		this.descrizione=descrizione;
	}
	public int getSnooze_ore(){
		return snooze_ore;
	}
	public void setSnooze_ore(int snooze_ore){
		this.snooze_ore=snooze_ore;
	}
	public int getFreeze(){
		return freeze;
	}
	public void setFreeze(int freeze){
		this.freeze=freeze;
	}
	public int getStato(){
		return stato;
	}
	public void setStato(int stato){
		this.stato=stato;
	}
	public int getChiuso(){
		return chiuso;
	}
	public void setChiuso(int chiuso){
		this.chiuso=chiuso;
	}
	public String getData_chiusura(){
		return data_chiusura;
	}
	public void setData_chiusura(String data_chiusura){
		this.data_chiusura=data_chiusura;
	}
	public int getOre_totali(){
		return ore_totali;
	}
	public void setOre_totali(int ore_totali){
		this.ore_totali=ore_totali;
	}
	public int getInd_compl_task(){
		return ind_compl_task;
	}
	public void setInd_compl_task(int ind_compl_task){
		this.ind_compl_task=ind_compl_task;
	}
	public int getPredecessore(){
		return predecessore;
	}
	public void setPredecessore(int predecessore){
		this.predecessore=predecessore;
	}
	public int getId_relaz_task(){
		return id_relaz_task;
	}
	public void setId_relaz_task(int id_relaz_task){
		this.id_relaz_task=id_relaz_task;
	}
	public String getTask_predecessore(){
		return task_predecessore;
	}
	public void setTask_predecessore(String task_predecessore){
		this.task_predecessore=task_predecessore;
	}
}
