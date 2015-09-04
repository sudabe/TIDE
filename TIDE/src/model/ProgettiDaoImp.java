package model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.*;



public class ProgettiDaoImp {

	public boolean addProgetto(String id_progetti, String id_cliente,
			String nome_progetto, String data_iniz_pianif, String data_cons_pianif,
			int ore_pianf_tot, String data_iniz_effettiva,
			String data_cons_effettiva, int ore_scosta_tot,
			int indice_compl_prog,String technologia) {
					boolean res =false;
					Transaction trns=null;
				 	SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
					Session session = sessFact.getCurrentSession();
					try{
					trns=session.beginTransaction();
					String sql= "insert into progetti values('"+id_progetti+"','"+id_cliente+"','"+nome_progetto+"','"+data_iniz_pianif+"','"+data_cons_pianif+"',"
							+ "'"+ore_pianf_tot+"','"+data_iniz_effettiva+"','"+data_cons_effettiva+"','"+ore_scosta_tot+"','"+indice_compl_prog+"','"+technologia+"')";
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

	
	public boolean updateProgetto(String id_progetti, String id_cliente, String nome_progetto,
			String data_iniz_pianif, String data_cons_pianif, int ore_pianf_tot,
			String data_iniz_effettiva, String data_cons_effettiva,
			int ore_scosta_tot, int indice_compl_prog,String technologia) {
				   boolean res=false;
				   Transaction trns = null;
				   SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
				   Session session = (Session) sessFact.getCurrentSession();
				   try {
				   trns = session.beginTransaction();
				   String sql="update progetti as p set p.id_cliente='"+id_cliente+"';"
				   		+ "p.data_iniz_pianif='"+data_iniz_pianif+"',p.data_cons_pianif='"+data_cons_pianif+"',p.ore_pianf_tot='"+ore_pianf_tot+"',"
				   		+ "p.data_iniz_effettiva='"+data_iniz_effettiva+"',p.data_cons_effettiva='"+data_cons_effettiva+"',"
				   		+ "p.ore_scosta_tot='"+ore_scosta_tot+"',p.indice_compl_prog='"+indice_compl_prog+"',p.technologia='"+technologia+"' "
				   		+ "where p.nome_progetto='"+nome_progetto+"'";
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


	public boolean deleteProgetto(String nome_progetto) {
		  boolean res=false;
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="delete from progetti as p where p.nome_progetto = '"+nome_progetto+"'";
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

	
	public List<Object[]> findAllProgetti() {
		 Transaction trns = null;
		 SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		 Session session =sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select p.nome_progetto, p.data_iniz_pianif, p.data_cons_pianif, p.technologia from progetti as p";
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

	
	public List<Object[]> findProgettoById(int id_progetti) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select p.id_progetti,p.id_cliente,p.nome_progetto,p.data_iniz_pianif,p.data_cons_pianif "
		   		+ "p.ore_pianf_tot,p.data_iniz_effettiva,p.data_cons_effettiva,p.ore_scosta_tot,p.indice_compl_prog,p.technologia"
		   		+ "from progetti as p where p.id_progetti = '"+id_progetti+"'";
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

	
	public List<Object[]> findProgettoByNome(String nome_progetto) {
		Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select p.id_progetti,p.id_cliente,p.nome_progetto,p.data_iniz_pianif,p.data_cons_pianif "
		   		+ "p.ore_pianf_tot,p.data_iniz_effettiva,p.data_cons_effettiva,p.ore_scosta_tot,p.indice_compl_prog,p.technologia"
		   		+ "from progetti as p where p.nome_progetto ='"+ nome_progetto+"'";
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

	
	public List<Object[]> findProgettoByCliente(int id_cliente) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select p.id_progetti,p.id_cliente,p.nome_progetto,p.data_iniz_pianif,p.data_cons_pianif "
		   		+ "p.ore_pianf_tot,p.data_iniz_effettiva,p.data_cons_effettiva,p.ore_scosta_tot,p.indice_compl_prog,p.technologia"
		   		+ "from progetti as p where p.id_cliente = '"+id_cliente+"'";
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
	
	public List<Object[]> findProgettoByClienteName(String nome_cliente) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   String sql="select p.id_progetti,p.id_cliente,p.nome_progetto,p.data_iniz_pianif,p.data_cons_pianif, p.ore_pianf_tot,p.data_iniz_effettiva,p.data_cons_effettiva,p.ore_scosta_tot,p.indice_compl_prog,p.technologia from progetti as p where p.id_cliente = (select id_cliente from referenti_clienti where nome = '"+nome_cliente+"')";
		   		System.out.println(sql);
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
