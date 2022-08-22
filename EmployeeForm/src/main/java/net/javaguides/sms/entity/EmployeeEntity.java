package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emplooyee_Details")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long EmployeeId;

	@Column(name = "First Name Of Employee")
	private String FirstName;

	@Column(name = "Last Name Of Employee")
	private String LastName;

	@Column(name = "SSN Number")
	private String SSN_Number;

	@Column(name = "Employee Qulification")
	private String EduQulifivation;

	@Column(name = "Employee Adress")
	private String Adress;

	public EmployeeEntity() {

	}

	public EmployeeEntity(String firstName, String lastName, String SSN_Number, String eduQulifivation, String adress) {
		super();
		FirstName = firstName;
		LastName = lastName;
		EduQulifivation = eduQulifivation;
		Adress = adress;
	}

	public Long getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Long employeeId) {
		EmployeeId = employeeId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSSN_Number() {
		return SSN_Number;
	}

	public void setSSN_Number(String sSN_Number) {
		SSN_Number = sSN_Number;
	}

	public String getEduQulifivation() {
		return EduQulifivation;
	}

	public void setEduQulifivation(String eduQulifivation) {
		EduQulifivation = eduQulifivation;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

}
