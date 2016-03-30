package edu.emory.first.cache.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[Publication User Relationship]")
public class PublicationUserRelationship implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "[ID]")
    private Long id;
	
	@Column(name = "[Type]")
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "[User ID]")
    private User user;
	
	@ManyToOne
	@JoinColumn(name = "[Publication ID]")
	private Publication publication;

	public Long getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public User getUser() {
		return user;
	}

	public Publication getPublication() {
		return publication;
	}
	
	@Override
	public String toString() {
		return "Authorship [id = " + id + ", type = " + type + "]";
	}
	
}


