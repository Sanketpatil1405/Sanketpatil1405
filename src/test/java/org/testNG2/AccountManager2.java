package org.testNG2;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountManager2 {
	@Test
	public void createAccount() {
		System.out.println("Create Account");
		//Reporter.log("Create Account");
		
	}
	@Test
	public void updateAccount() {
	System.out.println("Update Account");
		//Reporter.log("Update Account");
	}
	
}
