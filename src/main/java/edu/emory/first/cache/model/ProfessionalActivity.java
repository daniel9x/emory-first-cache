package edu.emory.first.cache.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[Professional Activity (Field Display Names)]")
public class ProfessionalActivity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "[Activity Name]")
    private String name;
    
    @Column(name = "[Start Date]")
    private String startDate;
    
    @Column(name = "[End Date]")
    private String endDate;
    
    @Column(name = "[Type]")
    private String type;
    
    @Column(name = "[Type ID ]")
    private Integer typeId;
    
    @Column(name = "[Computed Title]")
    private String computedTitle;
    
    @Column(name = "[Degree]")
    private String degree;
    
    @Column(name = "[Department]")
    private String department;
    
    @Column(name = "[Major or Focus]")
    private String majorOrFocus;
    
    @Column(name = "[Name of Institution]")
    private String nameOfInstitution;
    
    @Column(name = "[Name of Department or Facility]")
    private String nameOfDepartmentOrFacility;
    
    @Column(name = "[Post Graduate Specialization]")
    private String postGraduateSpecialization;
    
    @Column(name = "[Post Graduate Training Category]")
    private String postGraduateTrainingCategory;
    
    @Column(name = "[Expiration Date]")
    private String expirdationDate;
    
    @Column(name = "[Issue or Appointment Date]")
    private String issueOrAppointmentDate;
    
    @Column(name = "[Issuing Authority]")
    private String issuingAuthority;
    
    @Column(name = "[Appointment Status]")
    private String appointmentStatus;
    
    @Column(name = "[Name of Board]")
    private String nameOfBoard;
    
    @Column(name = "[Awarded By]")
    private String awardedBy;
    
    @Column(name = "[Name of Honor or Award]")
    private String nameOfHonorOrAward;
    
    @Column(name = "[Recognition Date]")
    private String recognitionDate;
    
    @Column(name = "[Membership End Date]")
    private String membershipEndDate;
    
    @Column(name = "[Membership Start Date]")
    private String membershipStartDate;
    
    @Column(name = "[Name of Society]")
    private String nameOfSociety;
    
    @Column(name = "[Name of Journal or Publication]")
    private String nameOfJournalOrPublication;
    
    @Column(name = "[Role or Position]")
    private String roleOrPosition;
    
    @Column(name = "[Committee Name]")
    private String committeeName;
    
    @Column(name = "[Committee Type]")
    private String committeeType;
    
    @Column(name = "[Name of Organization Agency or Institution]")
    private String nameOfOrganizationAgencyOrInstitution;
    
    @Column(name = "[Reporting Date 1]")
    private String reportingDate1;
    
    @Column(name = "[Reporting Date 2]")
    private String reportingDate2;
    
    @Column(name = "[Appointment Start Date]")
    private String appointmentStartDate;
    
    @Column(name = "[Appointment End Date]")
    private String appointmentEndDate;
    
    @ManyToOne
    @JoinTable(name = "Professional_Activity_User_Relationship_View", 
 		   joinColumns = @JoinColumn(name = "\"Professional Activity ID\""),
 		   inverseJoinColumns = @JoinColumn(name = "\"User ID\""))
    private User user;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getType() {
		return type;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public String getComputedTitle() {
		return computedTitle;
	}

	public String getDegree() {
		return degree;
	}

	public String getDepartment() {
		return department;
	}

	public String getMajorOrFocus() {
		return majorOrFocus;
	}

	public String getNameOfInstitution() {
		return nameOfInstitution;
	}

	public String getNameOfDepartmentOrFacility() {
		return nameOfDepartmentOrFacility;
	}

	public String getPostGraduateSpecialization() {
		return postGraduateSpecialization;
	}

	public String getPostGraduateTrainingCategory() {
		return postGraduateTrainingCategory;
	}

	public String getExpirdationDate() {
		return expirdationDate;
	}

	public String getIssueOrAppointmentDate() {
		return issueOrAppointmentDate;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public String getNameOfBoard() {
		return nameOfBoard;
	}

	public String getAwardedBy() {
		return awardedBy;
	}

	public String getNameOfHonorOrAward() {
		return nameOfHonorOrAward;
	}

	public String getRecognitionDate() {
		return recognitionDate;
	}

	public String getMembershipEndDate() {
		return membershipEndDate;
	}

	public String getMembershipStartDate() {
		return membershipStartDate;
	}

	public String getNameOfSociety() {
		return nameOfSociety;
	}

	public String getNameOfJournalOrPublication() {
		return nameOfJournalOrPublication;
	}

	public String getRoleOrPosition() {
		return roleOrPosition;
	}

	public String getCommitteeName() {
		return committeeName;
	}

	public String getCommitteeType() {
		return committeeType;
	}

	public String getNameOfOrganizationAgencyOrInstitution() {
		return nameOfOrganizationAgencyOrInstitution;
	}

	public String getReportingDate1() {
		return reportingDate1;
	}

	public String getReportingDate2() {
		return reportingDate2;
	}

	public String getAppointmentStartDate() {
		return appointmentStartDate;
	}

	public String getAppointmentEndDate() {
		return appointmentEndDate;
	}
    
}

