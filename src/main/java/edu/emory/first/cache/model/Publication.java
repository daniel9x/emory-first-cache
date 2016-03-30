package edu.emory.first.cache.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "[Profile Publications View]")
public class Publication implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "[ID]")
	private Long id;

	@Column(name = "[Title]")
	private String title;

	@Column(name = "[Type]")
	private String type;

	@Column(name = "[Journal]")
	private String journal;

	@Column(name = "[Book Title]")
	private String bookTitle;

	@Column(name = "[Chapter Number]")
	private String chapterNumber;

	@Column(name = "[Abstract]")
	private String abstractField;

	@Column(name = "[Article Number]")
	private String articleNumber;

	@Column(name = "[Publication date]")
	private String publicationDate;

	@Column(name = "[Volume]") 
	private String volume;

	@Column(name = "[Authors]")
	private String authors;

	@Column(name = "[Pagination Begin]")
	private String pageStart;

	@Column(name = "[Pagination End]")
	private String pageEnd;

	@Column(name = "[Author URL]")
	private String authorURL;
	
	@Column(name = "[Username]")
	private String userName;
	
	@Column(name = "[Relationship Type]")
	private String relationshipType;
	
	@Column(name = "[isFavorite]")
	private Boolean favorite;

	@Column(name = "[pubMedId]")
	private String pubMedId;

	@Column(name = "[pmcId]")
	private String pmcId;

	@Column(name = "[pubMedURL]")
	private String pubMedURL;

	@OneToMany(mappedBy="publication")
	private List<PublicationUserRelationship> publicationUserRelationships;

	@OneToMany(mappedBy="publication")
	private List<UserPublicationPreference> userPublicationPreferences;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public String getJournal() {
		return journal;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getChapterNumber() {
		return chapterNumber;
	}

	public String getAbstract() {
		return abstractField;
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public String getVolume() {
		return volume;
	}

	public String getAuthors() {
		return authors;
	}

	public String getAbstractField() {
		return abstractField;
	}

	public String getPageStart() {
		return pageStart;
	}

	public String getPageEnd() {
		return pageEnd;
	}

	public String getAuthorURL() {
		return authorURL;
	}

	public String getPubMedId() {
		return pubMedId;
	}

	public String getPmcId() {
		return extractPmcId(pmcId);
	}

	public String getPubMedURL() {
		return pubMedURL;
	}

	public String getRelationshipType() {
		return relationshipType;
	}

	public String extractPmcId(String pmcId) {
		if (pmcId != null) {
			if (pmcId.startsWith("pmc:")) {
				String parsedPmcId = null;
				parsedPmcId = pmcId.substring(pmcId.indexOf("pmc:") + 4);
				if (pmcId.contains(",")) {
					parsedPmcId = pmcId.substring(pmcId.indexOf("pmc:") + 4, pmcId.indexOf(","));
				}
				return parsedPmcId;
			} else {
				return null;
			}
		}
		return pmcId;	
	}

	public Boolean getFavorite() {
		return favorite;
	}

	@Override
	public String toString() {
		return "Publication [id=" + id 
				+ ",title=" + title 
				+ ",type=" + type 
				+ ",journal=" + journal 
				+ ",bookTitle=" + bookTitle 
				+ ",chapterNumber=" + chapterNumber 
				+ ",abstractField=" + abstractField 
				+ ",articleNumber=" + articleNumber 
				+ ",publicationDate=" + publicationDate 
				+ ",volume=" + volume 
				+ ",authors=" + authors 
				+ ",pageStart=" + pageStart 
				+ ",pageEnd=" + pageEnd 
				+ ",authorURL=" + authorURL + "]";
	}

}

