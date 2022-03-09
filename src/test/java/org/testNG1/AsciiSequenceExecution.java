package org.testNG1;

import org.testng.annotations.Test;

public class AsciiSequenceExecution {
	@Test
	public void login() {	
		System.out.println("login");
	}
	@Test
	public void CreateCustomer() {
		System.out.println("Capitl CreateCustomer");
	} 
	@Test
	public void createcustomer() {
		System.out.println("small createcustomer");
	} 
	@Test
	public void Updatecustomer() {
		System.out.println("Capital Updatecustomer");
	} 
	@Test
	public void updatecustomer() {
		System.out.println("small updatecustomer");
	} 

	@Test
	public void DeleteCustomer() {
		System.out.println("Capital DeleteCustomer");
	} 
	@Test
	public void deleteCustomer() {
		System.out.println("small deleteCustomer");
	} 
	@Test
	public void logout() {
		
		System.out.println("logout");
	}
}
