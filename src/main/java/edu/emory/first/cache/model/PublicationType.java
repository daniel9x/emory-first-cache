package edu.emory.first.cache.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Publication Type\"")
public class PublicationType implements Serializable {

	private static final long serialVersionUID = 1L;

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
}

