package org.testNG1;

import org.testng.annotations.Test;

public class Ex2 {
	@Test
	public void test1() {
     //  int div=10/0;
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
		test3();
	} 
	
	public void test3() {
		System.out.println("Test 3");
		int div=20/0;
		//test4();
	} 
	@Test
	public void test4() {
		System.out.println("Test 4");
	} 
}
