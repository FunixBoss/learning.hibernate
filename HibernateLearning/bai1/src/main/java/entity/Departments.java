package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "dbo", name = "Departments")
public class Departments {

	@Id
	@Column(name = "department_id")
	private int departmentId;
	
	
}
