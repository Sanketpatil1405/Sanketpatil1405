package org.testNG2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserManager {
	
	@BeforeClass
	  public void beforeClass1() {
		  System.out.println("Before Class User Manager");
	  }
	@Test
	public void createUser() {
		System.out.println("Create User");
		
	}
	@Test
	public void updateUser() {
		System.out.println("Update User");
	}
	
}
