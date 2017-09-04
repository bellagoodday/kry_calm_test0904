package Test;
import BeforeTest.CaseTmpl;




public class TestOne  extends CaseTmpl{

	public void test(){
		solo.waitForText("取消");
		solo.clickOnView("negative_button");
		solo.clickOnView("eight");
	fastFoodAction.testEnterPassword();
	solo.clickOnView("imageview");
	fastFoodAssert.assertLoginInfo();
	
		solo.sleep(5000);
	}
}
