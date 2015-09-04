package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Referenti_clientiDaoImp {
	
	public boolean addReferente(String id_cliente,String nome,String cognome,String recapito,String email) {
					boolean res =false;
					Transaction trns=null;
				 	SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
					Session session = sessFact.getCurrentSession();
					try{
					trns=session.beginTransaction();
					String sql="insert into referenti_clienti(id_cliente,nome,cognome,recapito,email) values('"+id_cliente+"',"
							+ "'"+nome+"','"+cognome+"','"+recapito+"','"+email+"')";
					Query query = session.createSQLQuery(sql);
					query.executeUpdate();
					trns.commit();
					System.out.println("Successfully Saved");
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
	
	public boolean updateReferente(String id_cliente,String nome,String cognome,String recapito,String email) {
				   boolean res=false;
				   Transaction trns = null;
				   SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
				   Session session = (Session) sessFact.getCurrentSession();
				   try {
				   trns = session.beginTransaction();
				   String sql="update referenti_clienti set nome='"+nome+"',cognome='"+cognome+"',recapito='"+recapito+"',"
				   		+ "email='"+email+"' where id_cliente='cliente1'";
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
	
	public List<Object[]> findAllReferenti() {
		 Transaction trns = null;
		 SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		 Session session =sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select id_referente,id_cliente,nome,cognome,recapito,email from referenti_clienti";
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

}
