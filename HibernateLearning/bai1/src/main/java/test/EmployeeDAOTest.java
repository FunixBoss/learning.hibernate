package test;

import java.util.HashSet;
import java.util.Set;

import dao.ProjectDAO;
import entity.Employees;
import entity.Projects;

public class EmployeeDAOTest {
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
}
