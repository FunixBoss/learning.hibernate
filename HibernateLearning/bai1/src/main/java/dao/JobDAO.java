package dao;

import java.io.Serializable;
import java.util.Set;

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
	
	public Jobs findById(Integer jobId)  {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Jobs job = session.get(Jobs.class, jobId);
		Set<Employees> employees = job.getEmployees();

		tx.commit();
		session.close();
		return job;
    }

}
