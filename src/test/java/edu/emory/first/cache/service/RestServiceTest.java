package edu.emory.first.cache.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.emory.first.cache.util.TestUtil;


public class RestServiceTest {
	
	@BeforeClass
	public static void init() {
		TestUtil.isTestMode = true;
	}
	
	@AfterClass
	public static void destroy() {
		TestUtil.isTestMode = false;
	}
    
    @Test
    public void testRegister() {
    	new RestService().getTest();
    }
    
    @Test
    public void testGetProfessionalActivityTypes() {
    	new RestService().getProfessionalActivityTypes();
    }
    
}
