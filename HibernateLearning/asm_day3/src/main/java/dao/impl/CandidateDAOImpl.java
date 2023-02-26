package dao.impl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.AbstractDAO;
import dao.CandidateDAO;
import entity.Candidate;
import utils.HibernateUtils;

@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
public class CandidateDAOImpl extends AbstractDAO<Candidate> implements CandidateDAO {
	private static CandidateDAOImpl instance;
	
	public static CandidateDAOImpl getInstance() {
		if(instance == null) {
			instance = new CandidateDAOImpl();
		}
		return instance;
	}
	
	protected CandidateDAOImpl() {
		super(Candidate.class);
	}

	@Override
	public List<Candidate> findBySkillAndSkillLevel(String skillName, Integer level) {
	    List<Candidate> candidates = new ArrayList<>();
    	try(
        	Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();
    		String hql = "FROM Candidate c WHERE c.skill = :skillName AND c.level = :level";
    		Query<Candidate> query = session.createQuery(hql);
    		query.setParameter("skillName", skillName);
    	    query.setParameter("level", level);
    	    candidates = query.list();
    		tx.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return candidates;
	}

	@Override
	public List<Candidate> findByForeignLanguageAndSkill(String foreignLanguage, String skill) {
		List<Candidate> candidates = new ArrayList<>();
    	try(
        	Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();
    		String hql = "FROM Candidate c WHERE c.foreignLanguage = :foreignLanguage AND c.skill = :skill";
    	    Query query = session.createQuery(hql);
    	    query.setParameter("foreignLanguage", foreignLanguage);
    	    query.setParameter("skill", skill);
    	    candidates = query.list();
    		tx.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return candidates;
	}

	@Override
	public List<Candidate> findBySkillAndEntryTestResult(String skillName, String result, LocalDate testDate) {
	    List<Candidate> candidates = new ArrayList<>();
    	try(
        	Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();
    		
    		String hql = "SELECT c FROM Candidate c "
 	               + "JOIN c.entryTests e "
 	               + "WHERE c.skill = :skillName "
 	               + "AND e.result = :result "
 	               + "AND e.date = :testDate";
    		Query query = session.createQuery(hql);
	 	    query.setParameter("skillName", skillName);
	 	    query.setParameter("result", result);
	 	    query.setParameter("testDate", testDate);
 	    
    	    candidates = query.list();
    		tx.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return candidates;
	}

	@Override
	public List<Candidate> findPassedCandidatesOnDate(LocalDate date) {
	    List<Candidate> candidates = new ArrayList<>();
    	try(
        	Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();
    		String hql = "SELECT c FROM Candidate c JOIN c.interviews i "
	                + "WHERE i.interviewResult = 'Passed' AND i.date = :date";
	        Query query = session.createQuery(hql);
	        query.setParameter("date", date);
	        candidates = query.list();
    		tx.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return candidates;
	}

	@Override
	public Boolean updateInactiveRemarkForNoContactCandidates() {
    	try(
    		Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();  
    		String hql = "UPDATE Candidate c SET c.remark = 'Inactive' "
    				+ "WHERE c.phone IS NULL OR c.email IS NULL OR c.cv IS NULL";
	        Query query = session.createQuery(hql);
	        int rowsAffected = query.executeUpdate();
    		 
    		tx.commit();
    		return rowsAffected > 0;
    	} catch(Exception e) {
    		e.printStackTrace();
    		return false;
    	}
	}

	@Override
	public List<Candidate> findByPage(int pageNumber, int pageSize) {
	    List<Candidate> candidates = new ArrayList<>();
    	try(
        	Session session = HibernateUtils.getSessionFactory().openSession();
    	){
    		Transaction tx = session.beginTransaction();
    	    Query query = session.createQuery("FROM Candidate");

    	    query.setFirstResult((pageNumber - 1) * pageSize);
    	    query.setMaxResults(pageSize);
	        candidates = query.list();
    		tx.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return candidates;
	}
	
	
}
