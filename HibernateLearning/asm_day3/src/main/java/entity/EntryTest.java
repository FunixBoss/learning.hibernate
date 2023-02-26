package entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "training", name = "EntryTest")
public class EntryTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "test_id")
	private Integer testId;

	@Column(name = "time", length = 255)
	private String time;

	@Column(name = "date", columnDefinition = "DATE")
	private LocalDate date;

	@Column(name = "language_valuator", length = 255)
	private String languageValuator;

	@Column(name = "language_result", precision = 4, scale = 2)
	private Double languageResult;

	@Column(name = "technical_valuator", length = 255)
	private String technicalValuator;

	@Column(name = "technical_result", precision = 4, scale = 2)
	private Double technicalResult;
	
	@Column(name = "result", length = 255)
	private String result;

	@Column(name = "remark", length = 1000)
	private String remark;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

	@Column(name = "entry_tests_skill", length = 255)
	private String entryTestSkill;

	public EntryTest() {

	}

	public EntryTest(Candidate candidate) {
		this.candidate = candidate;
	}

	public EntryTest(Integer testId, String time, LocalDate date, String languageValuator, Double languageResult,
			String technicalValuator, Double technicalResult, String remark, Candidate candidate,
			String entryTestSkill) {
		super();
		this.testId = testId;
		this.time = time;
		this.date = date;
		this.languageValuator = languageValuator;
		this.languageResult = languageResult;
		this.technicalValuator = technicalValuator;
		this.technicalResult = technicalResult;
		this.remark = remark;
		this.candidate = candidate;
		this.entryTestSkill = entryTestSkill;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLanguageValuator() {
		return languageValuator;
	}

	public void setLanguageValuator(String languageValuator) {
		this.languageValuator = languageValuator;
	}

	public Double getLanguageResult() {
		return languageResult;
	}

	public void setLanguageResult(Double languageResult) {
		this.languageResult = languageResult;
	}

	public String getTechnicalValuator() {
		return technicalValuator;
	}

	public void setTechnicalValuator(String technicalValuator) {
		this.technicalValuator = technicalValuator;
	}

	public Double getTechnicalResult() {
		return technicalResult;
	}

	public void setTechnicalResult(Double technicalResult) {
		this.technicalResult = technicalResult;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public String getEntryTestSkill() {
		return entryTestSkill;
	}

	public void setEntryTestSkill(String entryTestSkill) {
		this.entryTestSkill = entryTestSkill;
	}
	
	

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "EntryTest [testId=" + testId + ", time=" + time + ", date=" + date + ", languageValuator="
				+ languageValuator + ", languageResult=" + languageResult + ", technicalValuator=" + technicalValuator
				+ ", technicalResult=" + technicalResult + ", result=" + result + ", remark=" + remark + ", candidate="
				+ candidate + ", entryTestSkill=" + entryTestSkill + "]";
	}


}
