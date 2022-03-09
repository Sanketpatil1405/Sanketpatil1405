package org.testNG2;

import org.basicExamples.BaseUtilities;
import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount=3,threadPoolSize=2)
public void test1() {
	String url="http://www.google.com";
	BaseUtilities.bu.startUp(url,"ch");
	
}
}
