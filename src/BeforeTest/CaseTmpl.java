package BeforeTest;


	import Action.FastFoodAction;
import Assert.FastFoodAssert;
import Util.MySolo;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

	@SuppressWarnings("rawtypes")
	public class CaseTmpl extends ActivityInstrumentationTestCase2{

		
		private static String packageName="com.shishike.calm";
		private static String mainActivity="com.shishike.calm.splash.autoset.StartActivity_";
		public MySolo solo;
		public Activity activity;
		public FastFoodAction fastFoodAction;
		public FastFoodAssert fastFoodAssert;
		
		
		private  static Class<?> launchActivityClass;
		

		static{ 
			try{ 
				launchActivityClass = Class.forName(mainActivity); 
		}
		catch(ClassNotFoundException e){ 
			throw new RuntimeException(e);
			}
		} 

		@SuppressWarnings({ "unchecked", "deprecation" })
		public CaseTmpl(){
			super(packageName, launchActivityClass);//和测试类连接起来
		}
		
		
		@Override
		public  void setUp() throws Exception {
			// TODO Auto-generated method stub
			super.setUp();
			this.activity=this.getActivity();
			this.solo=new MySolo(getInstrumentation(),getActivity());//启动被测应用
			this.fastFoodAction=new FastFoodAction(solo);
			this.fastFoodAssert=new FastFoodAssert(solo);
		}
		@Override
		protected void tearDown() throws Exception {
			// TODO Auto-generated method stub
			super.tearDown();
		}
		
		

	}


