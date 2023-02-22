package app;

import java.util.HashSet;
import java.util.Set;

import dao.EmployeeDAO;
import dao.JobDAO;
import dao.ProjectDAO;
import entity.Employees;
import entity.Jobs;
import entity.Projects;

public class Program {
	public static void main(String[] args) {
		Program pro = new Program();
//		pro.saveJob();
//		pro.save();

		pro.findJob();
	}

	private void save() {
		Employees employee = new Employees();
		Projects project = new Projects();

		Set<Employees> employees = new HashSet<>();
		employees.add(employee);

		Set<Projects> projects = new HashSet<>();
		projects.add(project);

		project.setEmployees(employees);
		employee.setProjects(projects);

		ProjectDAO dao = new ProjectDAO();
		dao.save(project);
	}

	public void saveJob() {
		Jobs jobs = new Jobs("abcxyz");
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
}
