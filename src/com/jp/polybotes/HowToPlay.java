package com.jp.polybotes;

import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class HowToPlay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		   requestWindowFeature(Window.FEATURE_NO_TITLE);
		    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
		                           WindowManager.LayoutParams.FLAG_FULLSCREEN);
			setContentView(R.layout.activity_how_to_play);
			
			
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
			
			Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/ffftusj.ttf");
	        TextView howTo = (TextView) findViewById(R.id.textHowToTitle);
	 
	        howTo.setTypeface(tf);
	        
	        TextView howToPlay = (TextView) findViewById(R.id.textHowTo);
	        howToPlay.setMovementMethod(new ScrollingMovementMethod());
	        
	        TextView buttonBack = (TextView) findViewById(R.id.buttonBackHowTo);
	        
			Button pushBack = (Button) buttonBack;	//declares the first button
			pushBack.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {

						finish();
					
				}
				
			});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.how_to_play, menu);
		return true;
	}

}
