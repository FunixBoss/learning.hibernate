package app;

import java.sql.Date;
import java.time.LocalDate;

import dao.CandidateDAO;
import dao.impl.CandidateDAOImpl;
import dao.impl.EntryTestDAOImpl;
import utils.DummyData;

public class Program {
	private static CandidateDAO dao = CandidateDAOImpl.getInstance();

	public static void main(String[] args) {
		new DummyData();
		showResultQuestionA();
		showResultQuestionB();
		showResultQuestionC();
		showResultQuestionD();
		showResultQuestionE();
		showResultQuestionF();

	}

	public static void showResultQuestionA() {
		System.out.println("========Result Question A=====================================");
		dao.findBySkillAndSkillLevel("Angular", 2).stream().forEach(System.out::println);
		System.out.println("==============================================================");
	}

	public static void showResultQuestionB() {
		System.out.println("========Result Question B=====================================");
		dao.findByForeignLanguageAndSkill("Japanese", "Python/ML").stream().forEach(System.out::println);
		System.out.println("==============================================================");
	}

	public static void showResultQuestionC() {
		System.out.println("========Result Question C=====================================");
		dao.findBySkillAndEntryTestResult("Java", "Passed", LocalDate.of(2020, 10, 1))
			.stream().forEach(System.out::println);
		System.out.println("==============================================================");
	}
	
	public static void showResultQuestionD() {
		System.out.println("========Result Question D=====================================");
		dao.findPassedCandidatesOnDate(LocalDate.of(2020, 10, 15))
			.stream().forEach(System.out::println);
		System.out.println("==============================================================");
	}
	
	public static void showResultQuestionE() {
		System.out.println("========Result Question E=====================================");
		if(dao.updateInactiveRemarkForNoContactCandidates()) {
			System.out.println("Updated");
			dao.findAll().stream().forEach(System.out::println);
		} else {
			System.out.println("Updated failed");
		}
		System.out.println("==============================================================");
	}
	
	public static void showResultQuestionF() {
		int pageSize = 5;
		int pageNumber = 2;
		
		System.out.println("========Result Question D=====================================");
		dao.findByPage(pageNumber, pageSize)
			.stream().forEach(System.out::println);
		System.out.println("==============================================================");
		
		
	}
}
