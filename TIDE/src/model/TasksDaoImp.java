package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TasksDaoImp {
	
	
	public boolean addTask1(String id_cliente,String id_progetto,int id_attiv_pianif,String data_inizio,String data_consegna,
			String descrizione){
			boolean res =false;
			Transaction trns=null;
		 	SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			try{
			    trns=session.beginTransaction();
				String sql= "insert into tasks(id_cliente,id_progetto,id_attiv_pianif,data_inizio,data_consegna,descrizione) values('"+id_cliente+"','"+id_progetto+"','"+id_attiv_pianif+"','"+data_inizio+"','"+data_consegna+"','"+descrizione+"')";
				//System.out.println(sql);
				Query query = session.createSQLQuery(sql);
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
	
	public boolean addTask(String id_cliente,String id_progetto,int id_attiv_pianif,String data_inizio,String data_consegna,
			String descrizione,int snooze_ore,int freeze,int stato,int chiuso,String data_chiusura,int ore_totali,
			int ind_compl_task,int predecessore,int id_relaz_task){
			boolean res =false;
			Transaction trns=null;
		 	SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			try{
			    trns=session.beginTransaction();
				String sql= "insert into tasks(id_cliente,id_progetto,id_attiv_pianif,data_inizio,data_consegna,descrizione,snooze_ore,freeze,stato,chiuso,data_chiusura,ore_totali,ind_compl_task,predecessore,id_relaz_task) values('"+id_cliente+"','"+id_progetto+"','"+id_attiv_pianif+"','"+data_inizio+"','"+data_consegna+"','"+descrizione+"','"+snooze_ore+"','"+freeze+"','"+stato+"','"+chiuso+"','"+data_chiusura+"','"+ore_totali+"','"+ind_compl_task+"','"+predecessore+"','"+id_relaz_task+"')";
				//System.out.println(sql);
				session.createSQLQuery(sql);
				session.flush();
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
	public boolean deleteTask(String id_task){
		  boolean res=false;
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="delete from tasks where id_task='"+id_task+"'";
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
	
	public boolean updateTask(String id_cliente,String id_progetto){
		
		   boolean res=false;
		   Transaction trns = null;
		   SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		   Session session = (Session) sessFact.getCurrentSession();
		   try {
		   trns = session.beginTransaction();
		   String sql="update tasks set id_cliente='"+id_cliente+"',id_progetto='"+id_progetto+"' where id_task=";
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
	
	public List<Object[]> findAllTasks(){
		 Transaction trns = null;
		 SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		 Session session =sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select * from tasks";
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
	
	public List<Object[]> findAllTasksByProgetto(String nome_progetto){
		Transaction trns = null;
		SessionFactory sessFac = HibernateSessionFactory.getSessionFactory();
		Session session = sessFac.getCurrentSession();
		try{
			trns = session.beginTransaction();
			String sql="select * from tasks where id_progetto =( select id_progetti from progetti where nome_progetto='"+nome_progetto+"')";
			List<Object[]> tlist = session.createSQLQuery(sql).list();
			trns.commit();
			return tlist;
		}
		catch(RuntimeException e){
			 if(trns != null){
				    trns.rollback();
				   }
				   e.printStackTrace();
				   return null;
				  } 
	}
}
			

