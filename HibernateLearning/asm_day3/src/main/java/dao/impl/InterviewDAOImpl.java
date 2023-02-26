package dao.impl;

import dao.AbstractDAO;
import dao.InterviewDAO;
import entity.Interview;

public class InterviewDAOImpl extends AbstractDAO<Interview> implements InterviewDAO {
	private static InterviewDAOImpl instance;
	
	public static InterviewDAOImpl getInstance() {
		if(instance == null) {
			instance = new InterviewDAOImpl();
		}
		return instance;
	}
	
	protected InterviewDAOImpl() {
		super(Interview.class);
	}
	
	
}
