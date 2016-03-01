package edu.emory.first.cache.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "\"Professional Activity Type\"")
public class ProfessionalActivityType implements Serializable {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "\"Heading Plural\"")
    private String headingPlural;

	public Long getId() {
		return id;
	}

	public String getHeadingPlural() {
		return headingPlural;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHeadingPlural(String headingPlural) {
		this.headingPlural = headingPlural;
	}
}

