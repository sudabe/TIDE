package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Clienti;

public class ClientiDaoImp {
	
	public boolean addClienti1(String id_cliente,String ragione_soc,String piva,String recapito, String cf,String telefono){
		boolean res =false;
		Transaction trns=null;
	 	SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		try{
		    trns=session.beginTransaction();
			String sql= "insert into clienti(id_cliente,ragione_soc,piva,recapito,cf,telefono) values('"+id_cliente+"','"+ragione_soc+"','"+piva+"','"+recapito+"','"+cf+"','"+telefono+"')";
			//System.out.println(sql);
			Query query = session.createSQLQuery(sql);
			//session.flush();
			query.executeUpdate();
			trns.commit();
			System.out.println("Successfully Saved");
			res=true;
		}catch (RuntimeException e) {
			   if(trns != null){
				    trns.rollback();
				   }
				   e.printStackTrace();
				  }
				  return res;
	}
	
	public boolean addClienti(String id_cliente,String ragione_soc,String piva,String recapito, String cf,String telefono,int id_referente){
		boolean res =false;
		Transaction trns=null;
	 	SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		try{
		trns=session.beginTransaction();
		String sql= "insert into clienti values('"+id_cliente+"','"+ragione_soc+"','"+piva+"','"+recapito+"','"+cf+"','"+telefono+"','"+id_referente+"')";
		}catch (RuntimeException e) {
			   if(trns != null){
				    trns.rollback();
				   }
				   e.printStackTrace();
				  }
				  return res;
	}
	public boolean modifyClienti(String id_cliente,String ragione_soc,String piva,String recapito, String cf,String telefono,int id_referente){
	
		   boolean res=false;
		   Transaction trns = null;
		   SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		   Session session = (Session) sessFact.getCurrentSession();
		   try {
		   trns = session.beginTransaction();
		String sql="update clienti set ragione_soc='"+ragione_soc+"',"+"',piva='"+piva+"',recapito='"+recapito+"',cf='"+cf+"',"
						+ "telefono='"+telefono+"',id_referenti='"+id_referente+"' where id_cliente='"+id_cliente+"'";
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
	public boolean deleteClienti(String id_cliente){
		  boolean res=false;
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="delete from clienti where id_cliente='"+id_cliente+"'";
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
	
	public  List<Object[]> findClientiBynome(String cognome){
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select rc.id_cliente,rc.nome,rc.cognome,rc.recapito,rc.email form referenti_clienti where rc.cognome= '"+cognome +"'";
		   List<Object[]> plist = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return plist; 
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  }
	}
	
	public List<Object[]> findClientiByIndirizzo(String indirizzo){
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select rc.id_cliente,rc.nome,rc.cognome,rc.recapito,rc.email form referenti_clienti where rc.recapito= '"+indirizzo +"'";
		   List<Object[]> plist = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return plist; 
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  }
	}
	public List<Object[]> findClientiByProjetto(String nome_progetto){
		 Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select rc.id_cliente,rc.nome,rc.cognome,rc.recapito,rc.email form referenti_clienti where "
		   		+ "id_cliente= select id_cliente from projetti where rc.nome_progetto=('"+nome_progetto +"')";
		   List<Object[]> plist = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return plist; 
		  } 
		  catch (RuntimeException e) {
		   if(trns != null){
		    trns.rollback();
		   }
		   e.printStackTrace();
		   return null;
		  }
	}
	public List<Object[]> findAllClienti(){
		 Transaction trns = null;
		 SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		 Session session =sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select c.id_cliente, c.ragione_soc,c.telefono,c.recapito from clienti as c";
		   List<Object[]> clist = session.createSQLQuery(sql).list();
		   trns.commit();
		   return clist; 
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
