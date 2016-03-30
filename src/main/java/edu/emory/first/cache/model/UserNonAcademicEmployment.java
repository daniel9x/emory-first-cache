package edu.emory.first.cache.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[User Record Non-Academic Employment]")
public class UserNonAcademicEmployment {
	
	@EmbeddedId
	private UserRecordChildPrimaryKey primaryKey = new UserRecordChildPrimaryKey();
	
	@ManyToOne
    @JoinColumn(name = "\"User Record ID\"", insertable=false, updatable=false)
    private UserRecord userRecord;
	
	@Column(name = "[Employer Address City]")
    private String employerAddressCity;
    
    @Column(name = "[Employer Address Country]")
    private String employerAddressCountry;
    
    @Column(name = "[Employer Address Full Address]")
    private String employerAddressFullAddress;
    
    @Column(name = "[Employer Address ISO Country Code]")
    private String employerAddressISOCountryCode;
    
    @Column(name = "[Employer Address Name]")
    private String employerAddressName;
    
    @Column(name = "[Employer Address Organisation]")
    private String employerAddressOrganization;
    
    @Column(name = "[Employer Address Postcode]")
    private String employerAddressPostcode;
    
    @Column(name = "[Employer Address Privacy Level]")
    private String employerAddressPrivacyLevel;
    
    @Column(name = "[Employer Address Region]")
    private String employerAddressRegion;
    
    @Column(name = "[Employer Address Street]")
    private String employerAddressStreet;
    
    @Column(name = "[Employer Address Suborganisation]")
    private String employerAddressSuborganization;
    
    @Column(name = "[Employer Address Type]")
    private String employerAddressType;
    
    @Column(name = "[Start Date]")
    private String startDate;
    
    @Column(name = "[End Date]")
    private String endDate;
    
    @Column(name = "[Position]")
    private String position;
    
    @Column(name = "[Privacy Level]")
    private String privacyLevel;

	public String getEmployerAddressCity() {
		return employerAddressCity;
	}

	public String getEmployerAddressCountry() {
		return employerAddressCountry;
	}

	public String getEmployerAddressFullAddress() {
		return employerAddressFullAddress;
	}

	public String getEmployerAddressISOCountryCode() {
		return employerAddressISOCountryCode;
	}

	public String getEmployerAddressName() {
		return employerAddressName;
	}

	public String getEmployerAddressOrganization() {
		return employerAddressOrganization;
	}

	public String getEmployerAddressPostcode() {
		return employerAddressPostcode;
	}

	public String getEmployerAddressPrivacyLevel() {
		return employerAddressPrivacyLevel;
	}

	public String getEmployerAddressRegion() {
		return employerAddressRegion;
	}

	public String getEmployerAddressStreet() {
		return employerAddressStreet;
	}

	public String getEmployerAddressSuborganization() {
		return employerAddressSuborganization;
	}

	public String getEmployerAddressType() {
		return employerAddressType;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getPosition() {
		return position;
	}

	public String getPrivacyLevel() {
		return privacyLevel;
	}
	
}
