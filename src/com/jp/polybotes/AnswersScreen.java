package com.jp.polybotes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class AnswersScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		   requestWindowFeature(Window.FEATURE_NO_TITLE);
		    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
		                           WindowManager.LayoutParams.FLAG_FULLSCREEN);
			setContentView(R.layout.activity_answers_screen);			
			
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		

		final TextView textAnswers3 = (TextView) findViewById(R.id.textAnswers3);
		
		textAnswers3.setText(MainActivity.totalSummary);
        textAnswers3.setMovementMethod(new ScrollingMovementMethod());
		
		
	
			

		Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/ffftusj.ttf");
	    TextView answersTitle = (TextView) findViewById(R.id.textAnswersTitle);
	    answersTitle.setTypeface(tf);
	        


	        
	        TextView buttonBack = (TextView) findViewById(R.id.buttonBackAnswers);	        
			Button pushBack = (Button) buttonBack;	//declares the first button
			
	        TextView buttonPlayAgain = (TextView) findViewById(R.id.buttonPlayAgain);      
			Button pushPlayAgain = (Button) buttonPlayAgain;	//declares the first button
			
			pushBack.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {

						finish();
					
				}
				
			});
			
			pushPlayAgain.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent goToPlay = new Intent(AnswersScreen.this, MainActivity.class);
					startActivity(goToPlay);	
						finish();
						
					
				}
				
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.answers_screen, menu);
		return true;
	}

}
