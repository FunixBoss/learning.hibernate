package test;

import java.util.List;

import dao.EmployeeDAO;
import dao.JobDAO;
import entity.Employees;
import entity.Jobs;

public class JobDAOTest {
	private static JobDAO dao = new JobDAO();
	public static void main(String[] args) {
		JobDAOTest test = new JobDAOTest();
//		try {
//			test.findAll();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		test.findByJob();
	}
	
	public void saveJob() {
		Jobs jobs = new Jobs("324");
		Employees emp = new Employees();
		emp.setJob(jobs);
		
		EmployeeDAO dao = new EmployeeDAO();
		dao.save(emp);
	}
	
	public void findJob() {
		Jobs job = new JobDAO().findById(1);
		job.getEmployees();
		System.out.println(job);
	}
	
	public void findAll() throws Exception {
		List<Jobs> jobs = dao.findAll();
		
		jobs.stream().forEach(System.out::println);
	}
	
	public void findByJob() {
		List<Employees> emps = dao.findByJob("abc");
		emps.stream().forEach(System.out::println);
	}
}
