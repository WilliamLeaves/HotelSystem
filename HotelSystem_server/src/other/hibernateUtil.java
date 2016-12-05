package other;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibernateUtil {
    private static SessionFactory sf;
    
    static {
    	 StandardServiceRegistry  serviceRegistry=new StandardServiceRegistryBuilder().configure().build();   
	     sf=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory(); 
	}
    
    public static Session getSession(){
    	return sf.openSession();
    }
    
    public static void add(Object entity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = hibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(entity);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public static void delete(Object entity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = hibernateUtil.getSession();
			tx = session.beginTransaction();
			session.delete(entity);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public static void update(Object entity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = hibernateUtil.getSession();
			tx = session.beginTransaction();
			session.update(entity);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public static Object findById(Class clazz, Serializable id) {
		Session session = null;
		try {
			session = hibernateUtil.getSession();
			Object ob = session.get(clazz, id);
			return ob;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	public static List findbySome(String classname,String some,Serializable realId){
		Session session = null;
		List list =null;
		try{
			session = hibernateUtil.getSession();
			Query que = session.createQuery("from "+classname+" where "+some+" =:"+some);
			que.setParameter(some, realId);
			list = que.getResultList();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session!=null)
				session.close();
		}
		return list;
	}

}
