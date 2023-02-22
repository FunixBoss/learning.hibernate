package dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Employees;
import entity.Jobs;
import utils.HibernateUtils;

public class EmployeeDAO {
	public boolean save(Employees emp) {
		Transaction transaction = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(emp.getJob());
			Serializable result = session.save(emp);
			transaction.commit();

			return (result != null);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
}
