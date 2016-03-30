package edu.emory.first.cache.data;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.emory.first.cache.model.ProfessionalActivity;
import edu.emory.first.cache.model.ProfessionalActivityType;
import edu.emory.first.cache.model.Publication;
import edu.emory.first.cache.model.PublicationType;
import edu.emory.first.cache.model.PublicationUserRelationship;
import edu.emory.first.cache.model.User;
import edu.emory.first.cache.model.UserAcademicAppointment;
import edu.emory.first.cache.model.UserDegree;
import edu.emory.first.cache.model.UserNonAcademicEmployment;
import edu.emory.first.cache.model.UserPostgraduateTraining;
import edu.emory.first.cache.model.UserPublicationPreference;
import edu.emory.first.cache.model.UserRecord;
import edu.emory.first.cache.model.UserRecordChildPrimaryKey;
import edu.emory.first.cache.model.UserWebAddress;


public class EntityTest {
	
	@Test
	public void testPublicationObject() {
		Publication publication = new Publication();
		publication.getId();
		publication.getTitle();
		publication.getType();
		publication.getJournal();
		publication.getBookTitle();
		publication.getChapterNumber();
		publication.getAbstract();
		publication.getArticleNumber();
		publication.getPublicationDate();
		publication.getVolume();
		publication.getAuthors();
		publication.getAbstractField();
		publication.getPageStart();
		publication.getPageEnd();
		publication.getAuthorURL();
		publication.getPubMedId();
		publication.getPmcId();
		publication.getPubMedURL();
		publication.getRelationshipType();
		publication.getFavorite();
		publication.toString();
	}
	
	@Test
	public void testPmcIdExtractWithNull() {
		new Publication().extractPmcId(null);
	}
	
	@Test
	public void testPmcIdExtractWithOtherId() {
		assertEquals("12345",new Publication().extractPmcId("pmc:12345,other:6789"));
	}
	
	@Test
	public void testPmcIdExtractWithJustPmcId() {
		assertEquals("12345",new Publication().extractPmcId("pmc:12345"));
	}
	
	@Test
	public void testPmcIdExtractWithNoPmcId() {
		assertEquals(null,new Publication().extractPmcId("other:6789"));
	}

	@Test
	public void testPublicationType() {
		PublicationType publicationType = new PublicationType();
		publicationType.getId();
		publicationType.getHeadingPlural();
	}

	@Test
	public void testProfessionalActivityType() {
		ProfessionalActivityType pat = new ProfessionalActivityType();
		pat.getId();
		pat.getHeadingPlural();
	}

	@Test
	public void testPublicationUserRelationship() {
		PublicationUserRelationship pur = new PublicationUserRelationship();
		pur.getId();
		pur.getPublication();
		pur.getUser();
		pur.getType();
		pur.toString();
	}

	@Test
	public void testUserPublicationPreference() {
		UserPublicationPreference upp = new UserPublicationPreference();
		upp.getId();
		upp.getPublication();
		upp.getUser();
		upp.getFavorite();
	}

	@Test
	public void testUser() {
		User user = new User();
		user.getId();
		user.getUserName();
		user.getLastName();
		user.getFirstName();
		user.geteMail();
		user.getSuffix();
		user.getPrimaryGroupDescriptor();
		user.getPosition();
		user.getDerpartment();
		user.getEmployeeId();
		user.getPrimaryDepartmentCode();
		user.getAllDepartmentCodes();
		user.getAllDepartmentCodeDescriptions();
		user.getPrimaryAdministrativeDepartmentCode();
		user.getPrimaryAdministrativeDepartmentDescription();
		user.getPrimaryAcademicDepartmentDescription();
		user.getPrimaryDepartmentDescription();
		user.getPrimaryGroupDescriptorCode();
		user.getPrimaryAcademicDepartment();
		user.getPrimaryAcademicDepartmentDescription();
		user.getEmployeeType();
		user.getWorkTelephone();
		user.getUserRecord();
	}
	
	@Test
	public void testUserAcademicAppointment() {
		UserAcademicAppointment uaa = new UserAcademicAppointment();
		uaa.getInstitutionAddressCity();
		uaa.getInstitutionAddressCountry();
		uaa.getInstitutionAddressFullAddress();
		uaa.getInstitutionAddressISOCountryCode();
		uaa.getInstitutionAddressName();
		uaa.getInstitutionAddressOrganization();
		uaa.getInstitutionAddressPostcode();
		uaa.getInstitutionAddressPrivacyLevel();
		uaa.getInstitutionAddressRegion();
		uaa.getInstitutionAddressStreet();
		uaa.getInstitutionAddressSuborganization();
		uaa.getInstitutionAddressType();
		uaa.getPosition();
		uaa.getPrivacyLevel();
		uaa.getStartDate();
		uaa.getEndDate();
	}
	
	@Test
	public void testUserDegree() {
		UserDegree userDegree = new UserDegree();
		userDegree.getFieldOfStudy();
		userDegree.getInstitutionAddressCity();
		userDegree.getInstitutionAddressCountry();
		userDegree.getInstitutionAddressFullAddress();
		userDegree.getInstitutionAddressISOCountryCode();
		userDegree.getInstitutionAddressName();
		userDegree.getInstitutionAddressOrganization();
		userDegree.getInstitutionAddressPostcode();
		userDegree.getInstitutionAddressPrivacyLevel();
		userDegree.getInstitutionAddressRegion();
		userDegree.getInstitutionAddressStreet();
		userDegree.getInstitutionAddressSuborganization();
		userDegree.getInstitutionAddressType();
		userDegree.getName();
		userDegree.getPrivacyLevel();
		userDegree.getStartDate();
		userDegree.getEndDate();
		userDegree.getSupervisorEmail();
		userDegree.getSupervisorFirstInitial();
		userDegree.getSupervisorFirstName();
		userDegree.getSupervisorLastName();
		userDegree.getSupervisorMiddleInitials();
		userDegree.getSupervisorMiddleNames();
		userDegree.getThesis();
	}
	
	@Test
	public void testUserNonAcademicEmployment() {
		UserNonAcademicEmployment uNae = new UserNonAcademicEmployment();
		uNae.getEmployerAddressCity();
		uNae.getEmployerAddressCountry();
		uNae.getEmployerAddressFullAddress();
		uNae.getEmployerAddressISOCountryCode();
		uNae.getEmployerAddressName();
		uNae.getEmployerAddressOrganization();
		uNae.getEmployerAddressPostcode();
		uNae.getEmployerAddressPrivacyLevel();
		uNae.getEmployerAddressRegion();
		uNae.getEmployerAddressStreet();
		uNae.getEmployerAddressSuborganization();
		uNae.getEmployerAddressType();
		uNae.getStartDate();
		uNae.getEndDate();
		uNae.getPosition();
		uNae.getPrivacyLevel();
	}
	
	@Test
	public void testUserPostgraduateTraining() {
		UserPostgraduateTraining upt = new UserPostgraduateTraining();
		upt.getInstitutionAddressCity();
		upt.getInstitutionAddressCountry();
		upt.getInstitutionAddressFullAddress();
		upt.getInstitutionAddressISOCountryCode();
		upt.getInstitutionAddressName();
		upt.getInstitutionAddressOrganization();
		upt.getInstitutionAddressPostcode();
		upt.getInstitutionAddressPrivacyLevel();
		upt.getInstitutionAddressRegion();
		upt.getInstitutionAddressStreet();
		upt.getInstitutionAddressSuborganization();
		upt.getInstitutionAddressType();
		upt.getPrivacyLevel();
		upt.getStartDate();
		upt.getEndDate();
		upt.getSupervisorEmail();
		upt.getSupervisorFirstInitial();
		upt.getSupervisorFirstName();
		upt.getSupervisorLastName();
		upt.getSupervisorMiddleInitials();
		upt.getSupervisorMiddleNames();
		upt.getSpecialization();
		upt.getTitle();
		upt.getTypeId();
	}
	
	@Test
	public void testUserRecord() {
		UserRecord ur = new UserRecord();
		ur.getAcademicAppointments();
		ur.getNonAcademicEmployments();
		ur.getDegrees();
		ur.getPostgraduateTrainings();
		ur.getWebAddress();
	}
	
	@Test
	public void testPKConditionAllTrue() {
		UserRecordChildPrimaryKey pk = new UserRecordChildPrimaryKey();
		UserRecordChildPrimaryKey pk2 = new UserRecordChildPrimaryKey();
		pk.setProperty("123");
		pk2.setProperty("123");
		pk.setUserRecordId(1L);
		pk2.setUserRecordId(1L);
		pk.equals(pk2);
	}
	
	@Test
	public void testPKConditionFailUserRecord() {
		UserRecordChildPrimaryKey pk = new UserRecordChildPrimaryKey();
		UserRecordChildPrimaryKey pk2 = new UserRecordChildPrimaryKey();
		pk.setProperty("123");
		pk2.setProperty("123");
		pk.setUserRecordId(2L);
		pk2.setUserRecordId(1L);
		pk.hashCode();
		pk.equals(pk2);
	}
	
	@Test
	public void testPKConditionFailProperty() {
		UserRecordChildPrimaryKey pk = new UserRecordChildPrimaryKey();
		UserRecordChildPrimaryKey pk2 = new UserRecordChildPrimaryKey();
		pk.setProperty("123");
		pk2.setProperty("1234");
		pk.setUserRecordId(1L);
		pk2.setUserRecordId(1L);
		pk.equals(pk2);
	}
	
	@Test
	public void testPKConditionFailIndex() {
		UserRecordChildPrimaryKey pk = new UserRecordChildPrimaryKey();
		UserRecordChildPrimaryKey pk2 = new UserRecordChildPrimaryKey();
		pk.setIndex(1);
		pk2.setIndex(0);
		pk.setProperty("123");
		pk2.setProperty("123");
		pk.setUserRecordId(1L);
		pk2.setUserRecordId(1L);
		pk.equals(pk2);
	}
	
	@Test
	public void testPKNull() {
		UserRecordChildPrimaryKey pk = new UserRecordChildPrimaryKey();
		pk.equals(null);
	}
	
	@Test
	public void testPKNotInstanceOf() {
		UserRecordChildPrimaryKey pk = new UserRecordChildPrimaryKey();
		pk.equals(new User());
	}
	
	@Test
	public void testUserWebAddress() {
		UserWebAddress uwa = new UserWebAddress();
		uwa.getLabel();
		uwa.getPrivacyLevel();
		uwa.getTypeId();
		uwa.getURL();
	}

	@Test
	public void testProfessionalActivity() {
		ProfessionalActivity professionalActivity = new ProfessionalActivity();
		professionalActivity.getName();
		professionalActivity.getId();
		professionalActivity.getType();
		professionalActivity.getStartDate();
		professionalActivity.getEndDate();
		professionalActivity.getTypeId();
		professionalActivity.getComputedTitle();
		professionalActivity.getDegree();
		professionalActivity.getDepartment();
		professionalActivity.getMajorOrFocus();
		professionalActivity.getNameOfInstitution();
		professionalActivity.getNameOfDepartmentOrFacility();
		professionalActivity.getPostGraduateSpecialization();
		professionalActivity.getPostGraduateTrainingCategory();
		professionalActivity.getExpirdationDate();
		professionalActivity.getIssueOrAppointmentDate();
		professionalActivity.getIssuingAuthority();
		professionalActivity.getAppointmentStatus();
		professionalActivity.getNameOfBoard();
		professionalActivity.getAwardedBy();
		professionalActivity.getNameOfHonorOrAward();
		professionalActivity.getRecognitionDate();
		professionalActivity.getMembershipEndDate();
		professionalActivity.getMembershipStartDate();
		professionalActivity.getNameOfSociety();
		professionalActivity.getNameOfJournalOrPublication();
		professionalActivity.getRoleOrPosition();
		professionalActivity.getCommitteeName();
		professionalActivity.getCommitteeType();
		professionalActivity.getNameOfOrganizationAgencyOrInstitution();
		professionalActivity.getReportingDate1();
		professionalActivity.getReportingDate2();
		professionalActivity.getAppointmentStartDate();
		professionalActivity.getAppointmentEndDate();
	}

	@Test
	public void testProfessionalActivityTypeObject() {
		ProfessionalActivityType pat = new ProfessionalActivityType();
		pat.getId();
		pat.getHeadingPlural();
	}

}
