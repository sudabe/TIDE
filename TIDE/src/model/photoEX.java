package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "photo")
public class photoEX implements Serializable {

		@Id
		@Column(name="name")
		 private String name;
		@Column(name="image")
		private byte[] image;
		
		public String getName(){
	    	return name;
	    }
	    public void setName(String name){
	    	this.name=name;
	    }
	    public byte[] getImage(){
	    	return image;
	    }
	    public void setImage(byte[] image){
	    	this.image=image;
	    }
		 
	}



