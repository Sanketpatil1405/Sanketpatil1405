package org.testNG2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {
	@Test
	@Parameters({"username","password","browsername"})
	public void testmethod(String un,String pwd,String bname) {
		System.out.println("username :"+un);
		System.out.println("password :"+pwd);
        System.out.println("browsername :"+bname);	
	}

}
