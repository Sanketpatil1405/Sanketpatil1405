package org.testNG2;

import org.basicExamples.BaseUtilities;
import org.testng.annotations.Test;

public class ParallelEx1 {
@Test
public void testCH() {
	String url="http://www.google.com";
	BaseUtilities.bu.startUp(url,"ch");
	
}
@Test
public void testFF() {
	String url="http://www.google.com";
	BaseUtilities.bu.startUp(url,"FF");
	
}

}
