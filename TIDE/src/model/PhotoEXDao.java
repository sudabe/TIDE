package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PhotoEXDao {
	
	public boolean addPhoto(String name, byte[]image){
		
			boolean res =false;
			Transaction trns=null;
		 	SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			try{
			    trns=session.beginTransaction();
			    photoEX p = new photoEX();
			    p.setName(name);
			    p.setImage(image);
			    session.save(p);
			    trns.commit();
			    System.out.println("Successfully inserted");
				res=true;
				sessFact.close();
				return res;	
			}catch (RuntimeException e) {
				   if(trns != null){
					    trns.rollback();
					   }
					   e.printStackTrace();
					  }
					  return res;
	}
	
	public List<photoEX> findByNome(String name) {
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  try {
		   trns = session.beginTransaction();
		   //String sql="select p.name,p.image from photo as p where p.name ='"+name+"'";
		   //List<photoEX> ulist = session.createQuery("from photo as p where p.name=:m").setString(0, name).list();	
		   String hql = "from photoEX p where p.name = :name";
		   List<photoEX> ulist = session.createQuery(hql)
		   .setString("name", "p1")
		   .list();
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
