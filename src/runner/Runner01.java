package runner;

import test.TestOne;
import testSuite.TestOneTestSuite;
import junit.framework.TestSuite;

public class Runner01  extends CommonRunner{
	public TestSuite getAllTests(){
		TestSuite suite=new TestSuite();
		/**
		 * 将所有用例添加进来
		 */
		suite.addTest(TestOneTestSuite.getTestSuite());
		return suite;
		
	}

}
