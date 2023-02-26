package entity;

import java.time.LocalDate;
import java.util.List;

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
@Table(schema = "training", name = "CANDIDATE")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidate_id")
	private Integer candidateId;

	@Column(name = "full_name", length = 255, nullable = false)
	private String fullname;

	@Column(name = "date_of_birth", columnDefinition = "DATE")
	private LocalDate dateOfBirth;

	@Column(name = "gender")
	private Integer gender;

	@Column(name = "graduation_year", columnDefinition = "DATE")
	private LocalDate graduationYear;

	@Column(name = "phone", length = 255)
	private String phone;

	@Column(name = "email", length = 255)
	private String email;

	@Column(name = "skill", length = 255)
	private String skill;

	@Column(name = "foreign_language", length = 255)
	private String foreignLanguage;

	@Column(name = "level")
	private Integer level;

	@Column(name = "cv", length = 255)
	private String cv;

	@Column(name = "allocation_status")
	private Integer allocationStatus;

	@Column(name = "remark", length = 1000)
	private String remark;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "candidate", fetch = FetchType.LAZY)
	private List<Interview> interviews;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "candidate", fetch = FetchType.LAZY)
	private List<EntryTest> entryTests;

	public Candidate() {

	}

	public Candidate(String fullname) {
		this.fullname = fullname;
	}

	public Candidate(String fullname, LocalDate dateOfBirth, Integer gender,
			LocalDate graduationYear, String phone, String email, String skill, String foreignLanguage, Integer level,
			String cv, Integer allocationStatus, String remark) {
		super();
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.graduationYear = graduationYear;
		this.phone = phone;
		this.email = email;
		this.skill = skill;
		this.foreignLanguage = foreignLanguage;
		this.level = level;
		this.cv = cv;
		this.allocationStatus = allocationStatus;
		this.remark = remark;
	}

	public Integer getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public LocalDate getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(LocalDate graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getForeignLanguage() {
		return foreignLanguage;
	}

	public void setForeignLanguage(String foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public Integer getAllocationStatus() {
		return allocationStatus;
	}

	public void setAllocationStatus(Integer allocationStatus) {
		this.allocationStatus = allocationStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", fullname=" + fullname + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", graduationYear=" + graduationYear + ", phone=" + phone + ", email=" + email
				+ ", skill=" + skill + ", foreignLanguage=" + foreignLanguage + ", level=" + level + ", cv=" + cv
				+ ", allocationStatus=" + allocationStatus + ", remark=" + remark + "]";
	}

	public List<Interview> getInterviews() {
		return interviews;
	}

	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}

	public List<EntryTest> getEntryTests() {
		return entryTests;
	}

	public void setEntryTests(List<EntryTest> entryTests) {
		this.entryTests = entryTests;
	}
}
