package dao;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Employees;
import entity.Jobs;
import utils.HibernateUtils;

public class JobDAO {
	public boolean save(Jobs job) {
		Transaction transaction = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Serializable result = session.save(job);
			transaction.commit();

			return (result != null);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	public Jobs findById(Integer jobId) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Jobs job = session.get(Jobs.class, jobId);
		Set<Employees> employees = job.getEmployees();

		tx.commit();
		session.close();
		return job;
	}
	
	@SuppressWarnings("unchecked")
	public List<Employees> findByJob(String jobTile) {
		try (
			Session session = HibernateUtils.getSessionFactory().openSession();
		){
			Query<Employees> query = session.createNamedQuery("FIND_EMP_BY_JOB");
			query.setParameter("jobTitle", "%" + jobTile + "%");
			return query.list();
		} 
	}

	@SuppressWarnings("unchecked")
	public List<Jobs> findAll() throws Exception {
		try (
				Session session = HibernateUtils.getSessionFactory().openSession();
		){
			Query<Jobs> query = session.createNativeQuery("SELECT * FROM dbo.Jobs")
									.addEntity(Jobs.class);
			return query.list();
		}
	}

}
