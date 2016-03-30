package edu.emory.first.cache.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"User Publication Preferences\"")
public class UserPublicationPreference implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID")
    private Long id;
	
	@Column(name = "Favourite")
	private Boolean favorite;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="[User ID]")
    private User user;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="[Publication ID]")
	private Publication publication;
	

	public Long getId() {
		return id;
	}

	public Boolean getFavorite() {
		return favorite;
	}

	public User getUser() {
		return user;
	}

	public Publication getPublication() {
		return publication;
	}
	
}


