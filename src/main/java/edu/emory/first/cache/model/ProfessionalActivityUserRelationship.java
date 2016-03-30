package edu.emory.first.cache.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[Professional Activity User Relationship]")
public class ProfessionalActivityUserRelationship {
	
	@Id
    @Column(name = "ID")
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "[User ID]")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "[Professional Activity ID]")
	private ProfessionalActivity professionalActivity;

}
