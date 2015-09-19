package com.jp.polybotes;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;

public class myMenu extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_menu);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		//Declares the buttons
        TextView buttonPlay = (TextView) findViewById(R.id.buttonPlay);
        TextView buttonPractice = (TextView) findViewById(R.id.ButtonPractice);        
        TextView buttonPreferences = (TextView) findViewById(R.id.ButtonPerferences);
        TextView buttonHowToPlay = (TextView) findViewById(R.id.ButtonHowToPlay);
        TextView buttonCredits = (TextView) findViewById(R.id.ButtonCredits);
		
        //Set the font for the title
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/ffftusj.ttf");
        TextView tv = (TextView) findViewById(R.id.textMenu);
        tv.setTypeface(tf);

		
        //sets the buttons
		Button pushPlay = (Button) buttonPlay;	//declares the first button
		Button pushPractice = (Button) buttonPractice; //declares the practice button
		Button pushPreferences= (Button) buttonPreferences; //declares the preferences button
		Button pushHowToPlay = (Button) buttonHowToPlay;	//declares the  how to button
		Button pushCredits = (Button) buttonCredits;	//declares the first button
		
		
		/*
		 * On Click Listeners 
		 */
		
		//On Click for Play
		pushPlay.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				Intent goToPlay = new Intent(myMenu.this, MainActivity.class);
				startActivity(goToPlay);				
			}
		});
		
		//On Click for Practice
		pushPractice.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				Intent goToPlay = new Intent(myMenu.this, Practice.class);
				startActivity(goToPlay);				
			}
		});
		
		//On Click for Preferences
		pushPreferences.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				Intent goToPreferences = new Intent(myMenu.this, Preferences.class);
				startActivity(goToPreferences);				
			}
		});
		
		
		//On Click for How to play
		pushHowToPlay.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				Intent goToPlay = new Intent(myMenu.this, HowToPlay.class);
				startActivity(goToPlay);				
			}
		});
		
		
		//Credits is the the about page now
		pushCredits.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent goToCredits = new Intent(myMenu.this, Credits.class);
				startActivity(goToCredits);
				}
			
		});


		
	}




}
