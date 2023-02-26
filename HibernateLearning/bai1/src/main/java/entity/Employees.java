package entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import entity.Projects;

@Entity
@Table(name = "EMPLOYEES", schema = "dbo")
@NamedNativeQueries({
	@NamedNativeQuery(name = "FIND_EMP_BY_JOB", query = "SELECT e.* "
			+ "FROM dbo.Employees e JOIN dbo.Jobs j ON e.job_id = j.job_id "
			+ "AND j.job_id LIKE :jobTitle", resultClass = Employees.class),
	@NamedNativeQuery(name = "EMP_FIND_ALL", query = "SELECT * FROM dbo.Employees", resultClass = Employees.class),
	@NamedNativeQuery(name = "COUNT_EMP", query = "SELECT AVG(e.salary) FROM dbo.Employees e "
			+ "WHERE e.job_id = :jobId") })

public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EMPLOYEES_PROJECTS", schema = "dbo", 
		joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), 
		inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
	private Set<Projects> projects;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_ID")
	private Jobs job;

	@Column
	private double salary;

	public Employees() {
		super();
	}

	public Set<Projects> getProjects() {
		return projects;
	}

	public void setProjects(Set<Projects> projects) {
		this.projects = projects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
