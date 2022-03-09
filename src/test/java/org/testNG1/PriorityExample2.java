package org.testNG1;

import org.testng.annotations.Test;

public class PriorityExample2 {
	@Test(priority=1)
	public void login() {	
		System.out.println("login");
	}
	@Test(priority=2)
	public void CreateCustomer() {
		System.out.println("Capitl CreateCustomer");
	} 
	@Test(priority=5)
	public void createcustomer() {
		System.out.println("small createcustomer");
	} 
	@Test(priority=3)
	public void Updatecustomer() {
		System.out.println("Capital Updatecustomer");
	} 
	@Test(priority=6)
	public void updatecustomer() {
		System.out.println("small updatecustomer");
	} 

	@Test(priority=4)
	public void DeleteCustomer() {
		System.out.println("Capital DeleteCustomer");
	} 
	@Test(priority=7)
	public void deleteCustomer() {
		System.out.println("small deleteCustomer");
	} 
	@Test(priority=8)
	public void logout() {
		
		System.out.println("logout");
	}
}
