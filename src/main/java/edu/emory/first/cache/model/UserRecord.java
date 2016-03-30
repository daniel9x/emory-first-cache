package edu.emory.first.cache.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[User Record (Field Display Names)]")
public class UserRecord {

	@Id
	@Column(name = "[ID]")
	private Long id;

	@OneToOne
	@JoinColumn(name = "[User ID]")
	private User user;

	@OneToMany(mappedBy="userRecord")
	private List<UserAcademicAppointment> academicAppointments;
	
	@OneToMany(mappedBy="userRecord")
	private List<UserNonAcademicEmployment> nonAcademicEmployments;
	
	@OneToMany(mappedBy="userRecord")
	private List<UserDegree> degrees;	

	@OneToMany(mappedBy="userRecord")
	private List<UserPostgraduateTraining> postgraduateTrainings;

	@OneToMany(mappedBy="userRecord")
	private List<UserWebAddress> webAddress;

	public List<UserAcademicAppointment> getAcademicAppointments() {
		return academicAppointments;
	}

	public List<UserNonAcademicEmployment> getNonAcademicEmployments() {
		return nonAcademicEmployments;
	}

	public List<UserDegree> getDegrees() {
		return degrees;
	}

	public List<UserPostgraduateTraining> getPostgraduateTrainings() {
		return postgraduateTrainings;
	}

	public List<UserWebAddress> getWebAddress() {
		return webAddress;
	}
}
