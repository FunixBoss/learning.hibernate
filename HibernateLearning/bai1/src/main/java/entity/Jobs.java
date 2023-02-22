package entity;

import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JOBS", schema = "dbo")
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;	
	
	@Column(name = "TITLE", length = 255, nullable = false)
	private String title;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "job", fetch=FetchType.EAGER)
    private Set<Employees> employees;
	
	public Jobs() {
	}

	public Jobs(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employees> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		String empStr = employees.stream().map(emp -> String.valueOf(emp.getId())).collect(Collectors.joining(", "));
		return "Jobs [id=" + id + ", title=" + title + ", employees=" + empStr + "]";
	}

	
	

}
