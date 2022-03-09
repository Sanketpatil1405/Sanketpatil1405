package org.testNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationEx {
  @Test
  public void testmethod1() {
	  System.out.println("****TestMethod 1*****");  
  }
  @Test
  public void testmethod2() {
	  System.out.println("****TestMethod 2*****");
  }
  @BeforeMethod
  public void beforeMethod1() {
	  System.out.println("BeforeMethod 1");
  }

  @AfterMethod
  public void afterMethod1() {
	  System.out.println("AfterMethod 1");
  }

  @BeforeClass
  public void beforeClass1() {
	  System.out.println("BeforeClass 1");
  }

  @AfterClass
  public void afterClass1() {
	  System.out.println("AfterClass 1");
  }

  @BeforeTest
  public void beforeTest1() {
	  System.out.println("BeforeTest 1");
  }

  @AfterTest
  public void afterTest1() {
	  System.out.println("AfterTest 1");
  }

  @BeforeSuite
  public void beforeSuite1() {
	  System.out.println("BeforeSuite 1");
  }

  @AfterSuite
  public void afterSuite1() {
	  System.out.println("AfterSuite 1");
  }

}
