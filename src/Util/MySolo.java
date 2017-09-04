package Util;


import android.app.Activity;
import android.app.Instrumentation;
import android.view.View;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class MySolo extends Solo{

	public MySolo(Instrumentation instrumentation, Activity activity) {
		super(instrumentation, activity);
		// TODO Auto-generated constructor stub
	}
	public MySolo(Instrumentation instrumentation){
		super(instrumentation);
	}

	public void clickOnView(String id){
		View view=super.getView(id);
		super.clickOnView(view);
	}
	public <T extends TextView,ImageView> String getTextStr(String id){
		T tv=(T) super.getView(id);
		String s=tv.getText().toString();
		return s;
	}
	
/*	public  <T extends TextView, ImageView> String getTextStr(String id) {
		T view = (T) super.getView(id);
		return view.getText().toString();
	}*/
	
	

}
