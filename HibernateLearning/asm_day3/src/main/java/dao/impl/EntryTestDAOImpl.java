package dao.impl;

import dao.AbstractDAO;
import dao.CandidateDAO;
import dao.EntryTestDAO;
import entity.Candidate;
import entity.EntryTest;

public class EntryTestDAOImpl extends AbstractDAO<EntryTest> implements EntryTestDAO {
	private static EntryTestDAOImpl instance;
	
	public static EntryTestDAOImpl getInstance() {
		if(instance == null) {
			instance = new EntryTestDAOImpl();
		}
		return instance;
	}
	
	protected EntryTestDAOImpl() {
		super(EntryTest.class);
	}
	
	
}
