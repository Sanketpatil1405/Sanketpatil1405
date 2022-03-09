package org.testNG1;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority=-55)
	public void test1() {
		System.out.println("test 1");
	}
	@Test(priority=0)
	public void test2() {
		System.out.println("test 2");
	}
	@Test(priority=1)
	public void test3() {
		System.out.println("test 3");
	}	
	@Test
	public void test4() {
		System.out.println("test 4");
	}
	@Test
	public void login() {
		System.out.println("login");
	}	
}
