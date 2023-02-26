package dao;

import java.time.LocalDate;
import java.util.List;

import entity.Candidate;
import entity.EntryTest;

public interface CandidateDAO extends DAO<Candidate>{
	List<Candidate> findBySkillAndSkillLevel(String skillName, Integer level);
	List<Candidate> findByForeignLanguageAndSkill(String foreignLanguage, String skill);
	List<Candidate> findBySkillAndEntryTestResult(String skillName, String result, LocalDate testDate);
	List<Candidate> findPassedCandidatesOnDate(LocalDate date);
	Boolean updateInactiveRemarkForNoContactCandidates();
	List<Candidate> findByPage(int pageNumber, int pageSize);
}
