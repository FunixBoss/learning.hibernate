package dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Projects;
import utils.HibernateUtils;

public class ProjectDAO {
		public boolean save(Projects project) {
			Session session = null;
			Transaction transaction = null;

			try {
				session = HibernateUtils.getSessionFactory().openSession();
				transaction = session.beginTransaction();
				Serializable result = session.save(project);
				transaction.commit();

				return (result != null);

			} finally {
				if (session != null) {
					session.close();
				}
			}
		}
}
