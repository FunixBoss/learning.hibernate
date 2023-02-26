package utils;

import java.time.LocalDate;

import dao.CandidateDAO;
import dao.EntryTestDAO;
import dao.InterviewDAO;
import dao.impl.CandidateDAOImpl;
import dao.impl.EntryTestDAOImpl;
import dao.impl.InterviewDAOImpl;
import entity.Candidate;
import entity.EntryTest;
import entity.Interview;

public class DummyData {
	private static CandidateDAO cddDAO = CandidateDAOImpl.getInstance();
	private static EntryTestDAO etDAO = EntryTestDAOImpl.getInstance();
	private static InterviewDAO itDAO = InterviewDAOImpl.getInstance();

	static {
		createDummyData();
	}
	
	private static void createDummyData() {
		questionAnB();
		questionC();
		questionD();
		questionE();
	}
	
	
	private static void questionAnB() {
		
		// a/
		Candidate candidate = new Candidate();
        candidate.setFullname("Cdd01");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd01@gmail.com");
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);

        candidate = new Candidate();
        candidate.setFullname("Cdd02");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd02@gmail.com");
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("Japanese");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd03");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("cdd03@gmail.com");
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        
//       b/
        candidate = new Candidate();
        candidate.setFullname("Cdd04");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd04@gmail.com");
        candidate.setSkill("Python/ML");
        candidate.setForeignLanguage("Japanese");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd05");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd05@gmail.com");
        candidate.setSkill("Python/ML");
        candidate.setForeignLanguage("Japanese");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd06");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd06@gmail.com");
        candidate.setSkill("Python/ML");
        candidate.setForeignLanguage("Japanese");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);

        
        
        
        
	}
	private static void questionC() {
		Candidate candidate = new Candidate();
		// c
        candidate = new Candidate();
        candidate.setFullname("Cdd07");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd07@gmail.com");
        candidate.setSkill("Java");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        
        EntryTest entryTest = new EntryTest(candidate);
        entryTest.setTime("morning");
        entryTest.setDate(LocalDate.of(2020, 10, 1));
        entryTest.setLanguageValuator(null);;
        entryTest.setLanguageResult(null);
        entryTest.setTechnicalValuator(null);
        entryTest.setTechnicalResult(null);
        entryTest.setResult("Passed");
        entryTest.setRemark(null);
        entryTest.setEntryTestSkill(null);
        etDAO.save(entryTest);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd08");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd08@gmail.com");
        candidate.setSkill("Java");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        
        entryTest = new EntryTest(candidate);
        entryTest.setTime("morning");
        entryTest.setDate(LocalDate.of(2020, 10, 1));
        entryTest.setLanguageValuator(null);;
        entryTest.setLanguageResult(null);
        entryTest.setTechnicalValuator(null);
        entryTest.setTechnicalResult(null);
        entryTest.setResult("Passed");
        entryTest.setRemark(null);
        entryTest.setEntryTestSkill(null);
        etDAO.save(entryTest);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd09");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd09@gmail.com");
        candidate.setSkill("Java");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        
        entryTest = new EntryTest(candidate);
        entryTest.setTime("morning");
        entryTest.setDate(LocalDate.of(2020, 10, 1));
        entryTest.setLanguageValuator(null);;
        entryTest.setLanguageResult(null);
        entryTest.setTechnicalValuator(null);
        entryTest.setTechnicalResult(null);
        entryTest.setResult("Passed");
        entryTest.setRemark(null);
        entryTest.setEntryTestSkill(null);
        etDAO.save(entryTest);
	}
	
	private static void questionD() {
		Candidate candidate = new Candidate();
        candidate.setFullname("Cdd10");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd10@gmail.com");
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        
        Interview interview = new Interview(candidate);
        interview.setTime("morning");
        interview.setDate(LocalDate.of(2020, 10, 15));
        interview.setInterviewer("Mrs. Nguyen");
        interview.setComments("Awesome");
        interview.setInterviewResult("Passed");
        interview.setRemark(null);	
        itDAO.save(interview);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd11");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd10@gmail.com");
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        interview = new Interview(candidate);
        interview.setTime("morning");
        interview.setDate(LocalDate.of(2020, 10, 15));
        interview.setInterviewer("Mrs. Nguyen");
        interview.setComments("Awesome");
        interview.setInterviewResult("Passed");
        interview.setRemark(null);	
        itDAO.save(interview);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd12");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd10@gmail.com");
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark("active");
        cddDAO.save(candidate);
        interview = new Interview(candidate);
        interview.setTime("morning");
        interview.setDate(LocalDate.of(2020, 10, 15));
        interview.setInterviewer("Mrs. Nguyen");
        interview.setComments("Awesome");
        interview.setInterviewResult("Passed");
        interview.setRemark(null);	
        itDAO.save(interview);
	}
	
	private static void questionE() {
		Candidate candidate = new Candidate();

        candidate = new Candidate();
        candidate.setFullname("Cdd10");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail("Cdd10@gmail.com");
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv(null);
        candidate.setAllocationStatus(1);
        candidate.setRemark(null);
        cddDAO.save(candidate);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd11");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone("0783562372");
        candidate.setEmail(null);
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark(null);
        cddDAO.save(candidate);
        
        candidate = new Candidate();
        candidate.setFullname("Cdd12");
        candidate.setDateOfBirth(LocalDate.now());
        candidate.setGender(1);
        candidate.setGraduationYear(LocalDate.now());
        candidate.setPhone(null);
        candidate.setEmail("Cdd10@gmail.com");
        candidate.setSkill("Angular");
        candidate.setForeignLanguage("English");
        candidate.setLevel(2);
        candidate.setCv("cv");
        candidate.setAllocationStatus(1);
        candidate.setRemark(null);
        cddDAO.save(candidate);
	}
	
}
