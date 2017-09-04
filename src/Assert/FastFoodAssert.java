package Assert;

import junit.framework.Assert;
import Util.MySolo;

public class FastFoodAssert {
	public MySolo solo;
	public FastFoodAssert(MySolo solo){
		this.solo=solo;
	}
	public void  assertLoginInfo(){
		Assert.assertEquals("显示商户编号有误","810016166", solo.getTextStr("shop_id"));
	}

}
