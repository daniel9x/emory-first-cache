package edu.emory.first.cache.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[User (Field Display Names)]")
public class User implements Serializable {
	
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "[ID]")
    private Long id;
    
    @Column(name = "[Username]")
    private String userName;
    
    @Column(name = "[Last Name]")
    private String lastName;
    
    @Column(name = "[First Name]")
    private String firstName;
    
    @Column(name = "[Email]")
    private String eMail;
    
    @Column(name = "[Suffix]")
    private String suffix;
    
    @Column(name = "[Primary Group Descriptor]")
    private String primaryGroupDescriptor;
    
    @Column(name = "[Position]")
    private String position;
    
    @Column(name = "[Department]")
    private String derpartment;
    
    @Column(name = "[Employee ID]")
    private String employeeId;
    
    @Column(name = "[Primary Department Code]")
    private String primaryDepartmentCode;
    
    @Column(name = "[All Department Codes]")
    private String allDepartmentCodes;
    
    @Column(name = "[All Department Code Descriptions]")
    private String allDepartmentCodeDescriptions;
    
    @Column(name = "[Primary Administrative Department Code]")
    private String primaryAdministrativeDepartmentCode;
    
    @Column(name = "[Primary Administrative Department Description]")
    private String primaryAdministrativeDepartmentDescription;
    
    @Column(name = "[Primary Department Description]")
    private String primaryDepartmentDescription;
    
    @Column(name = "[Primary Group Descriptor Code]")
    private String primaryGroupDescriptorCode;
    
    @Column(name = "[Primary Academic Department]")
    private String primaryAcademicDepartment;
    
    @Column(name = "[Primary Academic Department Description]")
    private String primaryAcademicDepartmentDescription;
    
    @Column(name = "[Employee Type]")
    private String employeeType;
    
    @Column(name = "[Work Telephone]")
    private String workTelephone;
    
    @OneToOne(mappedBy="user")
	private UserRecord userRecord;

	@OneToMany(mappedBy="user")
	private List<UserPublicationPreference> userPublicationPreferences;

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String geteMail() {
		return eMail;
	}

	public String getSuffix() {
		return suffix;
	}

	public String getPrimaryGroupDescriptor() {
		return primaryGroupDescriptor;
	}

	public String getPosition() {
		return position;
	}

	public String getDerpartment() {
		return derpartment;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getPrimaryDepartmentCode() {
		return primaryDepartmentCode;
	}

	public String getAllDepartmentCodes() {
		return allDepartmentCodes;
	}

	public String getAllDepartmentCodeDescriptions() {
		return allDepartmentCodeDescriptions;
	}

	public String getPrimaryAdministrativeDepartmentCode() {
		return primaryAdministrativeDepartmentCode;
	}

	public String getPrimaryAdministrativeDepartmentDescription() {
		return primaryAdministrativeDepartmentDescription;
	}

	public String getPrimaryDepartmentDescription() {
		return primaryDepartmentDescription;
	}

	public String getPrimaryGroupDescriptorCode() {
		return primaryGroupDescriptorCode;
	}

	public String getPrimaryAcademicDepartment() {
		return primaryAcademicDepartment;
	}

	public String getPrimaryAcademicDepartmentDescription() {
		return primaryAcademicDepartmentDescription;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public String getWorkTelephone() {
		return workTelephone;
	}
	
	public UserRecord getUserRecord() {
		return userRecord;
	}
}
