package edu.emory.first.cache.service;

import java.io.IOException;
import java.text.ParseException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.emory.first.cache.model.ProfessionalActivityType;
import edu.emory.first.cache.util.TestUtil;


public class RestServiceTest {
    
    RestService restService = new RestService();
	
	@BeforeClass
	public static void init() {
		TestUtil.isTestMode = true;
	}
	
	@AfterClass
	public static void destroy() {
		TestUtil.isTestMode = false;
	}
	
	@Test
	public void testIsTestModeCondition() {
		TestUtil.isTestMode = false;
		new RestService();
		TestUtil.isTestMode = true;
	}
    
    @Test
    public void testRegister() {
    	new RestService().getTest();
    }
    
    @Test
    public void testGetProfessionalActivityTypes() {
    	new RestService().getProfessionalActivityTypes();
    }
    
    @Test
    public void testProfessionalActivityTypeObject() {
    	ProfessionalActivityType pat = new ProfessionalActivityType();
    	pat.getId();
    	pat.getHeadingPlural();
    }
    
    @Test
    public void testGetPublicationTypes() {
    	restService.getPublicationTypes();
    }
    
    @Test
    public void testTest() {
    	restService.getTest();
    }
    
    @Test
    public void testGetUserPublications() {
    	restService.getUserPublications("","",true);
    }
    
    @Test
    public void testGetUserPublicationsWithNullValues() {
    	restService.getUserPublications("",null,null);
    }
    
    @Test
    public void testGetUserProfessionalActivities() {
    	restService.getUserProfessionalActivities("",0);
    }
    
    @Test
    public void testConvertBuildDateFormat() {
    	restService.convertBuildDateFormat("12345");
    }
    
    @Test
    public void testGetUserProfessionalActivitiesWithNullTypeId() {
    	restService.getUserProfessionalActivities("",null);
    }
    
    @Test
    public void testGetUser() {
    	restService.getUser("");
    }
    
    @Test
    public void testGetBuildNumber() throws IOException, ParseException {
    	restService.getBuildNumber();
    }
}
