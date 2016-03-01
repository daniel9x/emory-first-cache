package edu.emory.first.cache.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*The Model uses JPA Entity as well as Hibernate Validators
 * 
 */

@Entity
@Table(name = "\"Professional Activity Type\"")
public class ProfessionalActivityType implements Serializable {
	
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "\"Heading Plural\"")
    private String headingPlural;
    
}

