package testSuite;

import test.TestOne;
import junit.framework.TestSuite;

public class TestOneTestSuite {
	public static TestSuite getTestSuite(){
		TestSuite suite=new TestSuite();
		suite.addTestSuite(TestOne.class);
		return suite;
		
	}

}
