package com.jp.polybotes;

import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Credits extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	   requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                           WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_credits);
		
		
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		

		Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/ffftusj.ttf");
        TextView credits = (TextView) findViewById(R.id.textCredits);
 
        credits.setTypeface(tf);
        
        TextView aboutthis = (TextView) findViewById(R.id.textAboutThis);
        aboutthis.setMovementMethod(new ScrollingMovementMethod());
        
        TextView buttonBack = (TextView) findViewById(R.id.buttonBackCredits);
        
		Button pushBack = (Button) buttonBack;	//declares the first button
		pushBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

					finish();
				
			}
			
		});
	}



}
