package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtils;

public class AbstractDAO<T> implements DAO<T>{
    private final Class<T> entityClass;

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public Boolean save(T entity) {
    	try(
    		Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();    		
    		session.saveOrUpdate(entity);
    		tx.commit();
    		return true;
    	} catch(Exception e) {
    		e.printStackTrace();
    		return false;
    	}
    }

    public T findById(Integer id) {
    	T t = null;
    	try(
        	Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();
    		t = session.get(entityClass, id);
    		tx.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return t;
    }

    @SuppressWarnings("deprecation")
	public List<T> findAll() {
    	List<T> list = new ArrayList<>();
    	try(
        	Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();
    		Query<T> query = session.createQuery("from " + entityClass.getSimpleName(), entityClass);
    		list = query.list();
    		tx.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return list;
    }

    public Boolean delete(T t) {
    	try(
			Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();    		
    		session.delete(t);
    		tx.commit();
    		return true;
    	} catch(Exception e) {
    		e.printStackTrace();
    		return false;
    	}
    }

    public Boolean update(T t) {
    	try(
    		Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();    		
    		session.update(t);
    		tx.commit();
    		return true;
    	} catch(Exception e) {
    		e.printStackTrace();
    		return false;
    	}
    }
}
