package model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class UtenzeDaoImp{
	
	/*public boolean addUtenze1(String id, String nome, String cognome,
			String data_nascita,String luogo_nascita,String residenza,String indirizzo,
			String cf,String iban,String contratto,String tipo_cont,
			String data_iniz_contr,
		    String telefono, 
			String cellulare,String email,String skype,String password,
		 	String photo,String sede_di_lavoro) throws NoSuchAlgorithmException
	{
		    Transaction tr = null;
			boolean res=false;
		    SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			PassEncryption passEn = new PassEncryption();
			String hashpassword = passEn.hashPass(password);
			try{
				tr=session.beginTransaction();
				String sql="insert into utenze(id,nome,cognome,sede_di_lavoro,data_nascita,luogo_nascita,residenza,indirizzo,cf,iban,contratto,tipo_cont,data_iniz_contr, telefono,cellulare,email,skype,password,photo)"
						+ "values('"+id+"','"+nome+"','"+cognome+"','"+sede_di_lavoro+"','"+data_nascita+"',"
						+ "'"+luogo_nascita+"','"+residenza+"','"+indirizzo+"','"+cf+"','"+iban+"','"+contratto+"','"+tipo_cont+"',"
								+ "'"+data_iniz_contr+"','"+telefono+"','"+cellulare+"','"+email+"','"+skype+"','"+hashpassword+"',"
										+ "'"+photo+"')";
				Query query = session.createSQLQuery(sql);
				query.executeUpdate();
			    tr.commit();
			    System.out.println("Successfully Saved");
				res=true;
			  } 
			  catch (RuntimeException e) {
			   if(tr != null){
			    tr.rollback();
			   }
			   e.printStackTrace();
			  }
			  return res;
	}*/

	
	public boolean addUtenze2(String id, String nome, String cognome,String sede_di_lavoro,
			String data_nascita,String luogo_nascita,String residenza,String indirizzo,
			String cf,String iban,String contratto,String tipo_cont,String data_iniz_contr,
			String telefono, String cellulare,String email,String skype,String password,
			byte[] photo) throws NoSuchAlgorithmException{
		
			boolean res=false;
			Transaction tr=null;
		    SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			try{
			PassEncryption myHashpass = new PassEncryption();
			String hashpass = myHashpass.hashPass(password);
		    tr=session.beginTransaction();
		    Utenze utenze = new Utenze();
			utenze.setId(id);
			utenze.setNome(nome);
			utenze.setCognome(cognome);
			utenze.setSede_di_lavoro(sede_di_lavoro);
			utenze.setData_nascita(data_nascita);
			utenze.setLuogo_nascita(luogo_nascita);
			utenze.setResidenza(residenza);
			utenze.setIndirizzo(indirizzo);
			utenze.setCf(cf);
			utenze.setIban(iban);
			utenze.setContratto(contratto);
			utenze.setTipo_cont(tipo_cont);
			utenze.setData_iniz_contr(data_iniz_contr);
			utenze.setTelefono(telefono);
			utenze.setCellulare(cellulare);
			utenze.setEmail(email);
			utenze.setSkype(skype);
			utenze.setPassword(hashpass);
			utenze.setPhoto(photo);
			
			session.save(utenze);
			tr.commit();
			System.out.println("Successfully Saved");
			res=true;
			sessFact.close();
			return res;	
			}catch (RuntimeException e) {
			   if(tr != null){
				    tr.rollback();
				   }
				   e.printStackTrace();
				  }
				  return res;
	}
	 
	/*public boolean addUtenze(String id, String nome, String cognome,String sede_di_lavoro,
			String data_nascita,String luogo_nascita,String residenza,String indirizzo,
			int cap,String cf,String iban,String contratto,String tipo_cont,
			int ore_giorno,String data_iniz_contr,int durata_cont,
			int costo_mensile,int periodo_perm_az,int attivo,String telefono, 
			String cellulare,String email,String skype,String password,
			byte[] photo) throws NoSuchAlgorithmException{
		
			boolean res=false;
		    SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			Transaction tr=session.beginTransaction();
			
			PassEncryption passEn = new PassEncryption();
			String hashpassword = passEn.hashPass(password);
			
			Utenze utenze = new Utenze();
			utenze.setId(id);
			utenze.setNome(nome);
			utenze.setCognome(cognome);
			utenze.setSede_di_lavoro(sede_di_lavoro);
			utenze.setData_nascita(data_nascita);
			utenze.setLuogo_nascita(luogo_nascita);
			utenze.setResidenza(residenza);
			utenze.setIndirizzo(indirizzo);
			utenze.setCap(cap);
			utenze.setCf(cf);
			utenze.setIban(iban);
			utenze.setContratto(contratto);
			utenze.setTipo_cont(tipo_cont);
			utenze.setOre_giorno(ore_giorno);
			utenze.setData_iniz_contr(data_iniz_contr);
			utenze.setDurata_cont(durata_cont);
			utenze.setCosto_mensile(costo_mensile);
			utenze.setPeriodo_perm_az(periodo_perm_az);
			utenze.setAttivo(attivo);
			utenze.setTelefono(telefono);
			utenze.setCellulare(cellulare);
			utenze.setEmail(email);
			utenze.setSkype(skype);
			utenze.setPassword(hashpassword);
			utenze.setPhoto(photo);
			
			session.save(utenze);
			tr.commit();
			System.out.println("Successfully Saved");
			res=true;
			sessFact.close();
			return res;	
	}*/

	
	public boolean updateUtenze(String id, String nome, String cognome, Date data_nascita,
			String luogo_nascita, String residenza, String indirizzo, int cap,
			String cf, String iban, String contratto, String tipo_cont,
			int ore_giorno, Date data_iniz_contr, int durata_cont,
			int costo_mensile, int periodo_perm_az, int attivo,
			String telefono, String cellulare, String email, String skype,
			String password, String photo, String sede_di_lavoro) {
	
		  boolean res=false;
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = (Session) sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="update utenze as u set u.nome='"+nome+"', u.cognome='"+cognome+"',u.sede_di_lavoro='"+sede_di_lavoro+"',u.data_nascita='"+data_nascita+"',u.luogo_nascita='"+luogo_nascita+"',"
		   		+ "u.residenza='"+residenza+"',u.indirizzo='"+indirizzo+"',u.cap='"+cap+"',u.cf='"+cf+"',u.iban='"+iban+"',u.contratto='"+contratto+"',u.tipo_cont='"+tipo_cont+"'"
		   		+ "u.ore_giorno='"+ore_giorno+"',u.data_iniz_contr='"+data_iniz_contr+"'d,u.durata_cont='"+durata_cont+"',u.costo_mensile='"+costo_mensile+"'"
		   		+ "u.periodo_perm_az='"+periodo_perm_az+"',u.attivo='"+attivo+"',u.telefono='"+telefono+"',u.cellulare='"+cellulare+"',u.email='"+email+"',u.skype='"+skype+"'"
		   		+ "u.password='"+password+"',u.photo='"+photo+"' where u.id ='"+id+"'";
		   session.createSQLQuery(sql);	 
		   trns.commit();
		   res=true;
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		  }
		  return res;
	}

	public boolean deleteUtenze(String nome) {
		      boolean res=false;
			  Transaction trns = null;
			  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			  Session session = sessFact.getCurrentSession();
			  try {
			   trns = session.beginTransaction();
			   String sql="delete from utenze as u where u.nome ='"+nome+"'";
			   session.createSQLQuery(sql);	 
			   trns.commit();
			   res=true;
			   System.out.println("Successfully Deleted");
			  } 
			  catch (RuntimeException e) {
			   if(trns != null){
			    trns.rollback();
			   }
			   e.printStackTrace();
			  }
			return res;
		}
	public List<Object[]> findAllUtenzes() {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select u.id,u.nome,u.cognome ,u.sede_di_lavoro,u.contratto,u.telefono,u.cellulare,u.email,u.skype from utenze as u";
		   List<Object[]> ulist = session.createSQLQuery(sql).list();
		   trns.commit();
		   //System.out.println(ulist.size());
		   return ulist; 
		  } 
		   catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  } 		
	}

	public List<Object[]> findUtenzeById(String id) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select u.id,u.nome,u.cognome,u.cellulare,u.telefono,u.email,u.skype,u.contratto from utenze as u where u.id ='"+id+"'";
		   List<Object[]> ulist = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return ulist; 
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  }
		
	}

	
	public List<Object[]> findUtenzeByNome(String nome) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select u.id,u.nome,u.cognome,u.cellulare,u.telefono,u.email,u.skype,u.contratto from utenze as u where u.nome ='"+nome+"'";
		   List<Object[]> ulist = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return ulist; 
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  }
	}
	
	public List<Object[]> findUtenzeByCognome(String cognome) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select u.id,u.nome,u.cognome,u.cellulare,u.telefono,u.email,u.skype,u.contratto from utenze as u where u.cognome ='"+cognome+"'";
		   List<Object[]> ulist = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return ulist; 
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  }
	}

	public List<Object[]> findUtenzeByEmail(String email) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = (Session) sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select u.id,u.nome,u.cognome,u.cellulare,u.telefono,u.email,u.skype,u.contratto from utenze as u where u.email ='"+email+"'";
		   List<Object[]> ulist = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return ulist; 
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  }
	}

	public List<Object[]> findUtenzeBySedeDiLavoro(String SedeDiLavoro) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = (Session) sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select u.id,u.nome,u.cognome,u.cellulare,u.telefono,u.email,u.skype,u.contratto from utenze as u where u.SedeDiLavoro ='"+SedeDiLavoro+"'";
		   List <Object[]> ulist = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return ulist; 
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  }
	}

}
	



