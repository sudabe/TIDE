package model;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.apache.taglibs.standard.tag.rt.core.OutTag;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AdminDaoImp {
	
	public List<Object[]> verifyLogin(String username,String password) throws NoSuchAlgorithmException{
		  Transaction trns = null;
		  SessionFactory sessFact = HibernateSessionFactory.getSessionFactory();
		  Session session = sessFact.getCurrentSession();
		  PassEncryption passEn = new PassEncryption();
		  String hashpassword = passEn.hashPass(password);
		  System.out.println(hashpassword);
		  try {
		   trns = session.beginTransaction();
		   String sql="select username , password from admin where username='"+username+"' and password='"+hashpassword+"'";
		   List<Object[]> list = session.createSQLQuery(sql).list();	 
		   trns.commit();
		   return list; 
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

		

				  
		

		

