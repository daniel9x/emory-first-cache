package edu.emory.first.cache.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[User Record Web Address]")
public class UserWebAddress {
	
	@EmbeddedId
	private UserRecordChildPrimaryKey primaryKey = new UserRecordChildPrimaryKey();

    @ManyToOne
    @JoinColumn(name = "\"User Record ID\"", insertable=false, updatable=false)
    private UserRecord userRecord;
    
    @Column(name = "[Label]")
    private String label;
    
    @Column(name = "[Privacy Level]")
    private String privacyLevel;
    
    @Column(name = "[Type ID]")
    private String typeId;
    
    @Column(name = "[URL]")
    private String URL;


	public String getLabel() {
		return label;
	}

	public String getPrivacyLevel() {
		return privacyLevel;
	}

	public String getTypeId() {
		return typeId;
	}

	public String getURL() {
		return URL;
	}
}
