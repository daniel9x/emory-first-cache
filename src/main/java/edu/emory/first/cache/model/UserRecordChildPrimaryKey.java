package edu.emory.first.cache.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserRecordChildPrimaryKey implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "[Index]")
	private int index;
	
	@Column(name = "[Property]")
	private String property;
	
	@Column(name = "\"User Record ID\"")
	private Long userRecordId;
	
	
	public void setProperty(String property) {
		this.property = property;
	}

	public void setUserRecordId(Long userRecordId) {
		this.userRecordId = userRecordId;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UserRecordChildPrimaryKey)) {
			return false;
		}
		
		UserRecordChildPrimaryKey pk = (UserRecordChildPrimaryKey) obj;
		
		return (this.index == pk.index) && (this.property.equals(pk.property)) && this.userRecordId == pk.userRecordId;
	}
	
	@Override
	public int hashCode() {
		return index + property.hashCode() + userRecordId.hashCode();
	}

}
