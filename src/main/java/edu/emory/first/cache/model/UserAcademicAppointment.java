package edu.emory.first.cache.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[User Record Academic Appointment]")
public class UserAcademicAppointment {
	
	@EmbeddedId
	private UserRecordChildPrimaryKey primaryKey = new UserRecordChildPrimaryKey();

    @Column(name = "[Institution Address City]")
    private String institutionAddressCity;
    
    @Column(name = "[Institution Address Country]")
    private String institutionAddressCountry;
    
    @Column(name = "[Institution Address Full Address]")
    private String institutionAddressFullAddress;
    
    @Column(name = "[Institution Address ISO Country Code]")
    private String institutionAddressISOCountryCode;
    
    @Column(name = "[Institution Address Name]")
    private String institutionAddressName;
    
    @Column(name = "[Institution Address Organisation]")
    private String institutionAddressOrganization;
    
    @Column(name = "[Institution Address Postcode]")
    private String institutionAddressPostcode;
    
    @Column(name = "[Institution Address Privacy Level]")
    private String institutionAddressPrivacyLevel;
    
    @Column(name = "[Institution Address Region]")
    private String institutionAddressRegion;
    
    @Column(name = "[Institution Address Street]")
    private String institutionAddressStreet;
    
    @Column(name = "[Institution Address Suborganisation]")
    private String institutionAddressSuborganization;
    
    @Column(name = "[Institution Address Type]")
    private String institutionAddressType;
    
    @Column(name = "[Position]")
    private String position;
    
    @Column(name = "[Privacy Level]")
    private String privacyLevel;
    
    @Column(name = "[Start Date]")
    private String startDate;
    
    @Column(name = "[End Date]")
    private String endDate;
    
    @ManyToOne
    @JoinColumn(name = "\"User Record ID\"", insertable=false, updatable=false)
    private UserRecord userRecord;

	public String getInstitutionAddressCity() {
		return institutionAddressCity;
	}

	public String getInstitutionAddressCountry() {
		return institutionAddressCountry;
	}

	public String getInstitutionAddressFullAddress() {
		return institutionAddressFullAddress;
	}

	public String getInstitutionAddressISOCountryCode() {
		return institutionAddressISOCountryCode;
	}

	public String getInstitutionAddressName() {
		return institutionAddressName;
	}

	public String getInstitutionAddressOrganization() {
		return institutionAddressOrganization;
	}

	public String getInstitutionAddressPostcode() {
		return institutionAddressPostcode;
	}

	public String getInstitutionAddressPrivacyLevel() {
		return institutionAddressPrivacyLevel;
	}

	public String getInstitutionAddressRegion() {
		return institutionAddressRegion;
	}

	public String getInstitutionAddressStreet() {
		return institutionAddressStreet;
	}

	public String getInstitutionAddressSuborganization() {
		return institutionAddressSuborganization;
	}

	public String getInstitutionAddressType() {
		return institutionAddressType;
	}

	public String getPosition() {
		return position;
	}

	public String getPrivacyLevel() {
		return privacyLevel;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}
}
