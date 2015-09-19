	package com.jp.polybotes;



import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
	import android.view.View;
	import android.view.Window;
	import android.view.WindowManager;
	import android.widget.Button;
import android.widget.TextView;




public class Practice extends Activity {

	static String totalSummary = "";
	String strSummary = "";
	
			MediaPlayer backgroundMusic;
			int correctAnswer = 0;
			int varScore = 0;
			static int numberOfCountries = 4; //initials the variable for the number of Countries
			int randoNewCorrectButton = 0;


			
			public void printButtons()
			{
				//declares the first text
				final TextView buttonOne = (TextView) findViewById(R.id.buttonPracticeBackCredits);
				final TextView buttonTwo = (TextView) findViewById(R.id.buttonPractice2);
				final TextView buttonThree = (TextView) findViewById(R.id.buttonPractice3);
				final TextView buttonFour = (TextView) findViewById(R.id.buttonPractice4);
				final TextView textOne = (TextView) findViewById(R.id.textPracticeQuestion);
				final TextView textThree = (TextView) findViewById(R.id.textPracticeAnswers);	
				
				countryValues myObject = new countryValues();
				String valueOne = myObject.countryValue1;
				String valueTwo = myObject.countryValue2;
				String valueThree = myObject.countryValue3;
				String valueFour = myObject.countryValue4;				
				String valueCorrect = myObject.countryValueCorrect;		
				String textQuestion = myObject.textMain;
				String textclr = myObject.textColour;
				
				//Adds the Answer
				strSummary = ("Question: " + textQuestion + "\n" + "Answer: " + valueCorrect + "\n\n");				
				totalSummary = new StringBuilder(strSummary).append(totalSummary).toString();
				
				textOne.setText(textQuestion);
				textThree.setText(strSummary);
				
				
				buttonOne.setText(valueOne);
				buttonTwo.setText(valueTwo);
				buttonThree.setText(valueThree);
				buttonFour.setText(valueFour);
				
				
				//Changes the Text Colour Based on the Question. Pop = Red, GDP = Green
				  if (textclr == "0"){
					  textOne.setTextColor(Color.rgb(255, 196, 96));
					  				  }
				
				  if (textclr == "1"){
					  textOne.setTextColor(Color.rgb(255, 255, 255));
					  				  }
				

				randoNewCorrectButton = (int) (Math.random() * 4) + 1; //chooses the button


				
				if (randoNewCorrectButton == 1)
				{
					buttonOne.setText(valueCorrect);
				}
				
				if (randoNewCorrectButton == 2)
				{
					buttonTwo.setText(valueCorrect);
				}
				
				if (randoNewCorrectButton == 3)
				{
					buttonThree.setText(valueCorrect);
				}
				
				if (randoNewCorrectButton == 4)
				{
					buttonFour.setText(valueCorrect);
				}
				
			
			}
			

			
			public void flashGreen()
			{
			   
				final TextView buttonOne = (TextView) findViewById(R.id.buttonPracticeBackCredits);
				final TextView buttonTwo = (TextView) findViewById(R.id.buttonPractice2);
				final TextView buttonThree = (TextView) findViewById(R.id.buttonPractice3);
				final TextView buttonFour = (TextView) findViewById(R.id.buttonPractice4);

				
				if (randoNewCorrectButton == 1){
				// SLEEP 250 milliSECONDS HERE ... back to transparent
						buttonOne.postDelayed(new Runnable() {

					    @Override
					    public void run() {
							buttonOne.setBackgroundColor(Color.TRANSPARENT);
					    }
					}, 250);
				  	buttonOne.setBackgroundColor(Color.GREEN);
				}
				
				if (randoNewCorrectButton == 2){
				// SLEEP 250 milliSECONDS HERE ... back to transparent
						buttonTwo.postDelayed(new Runnable() {

					    @Override
					    public void run() {
							buttonTwo.setBackgroundColor(Color.TRANSPARENT);
					    }
					}, 250);
					  	buttonTwo.setBackgroundColor(Color.GREEN);
				}
				
				if (randoNewCorrectButton == 3){
				// SLEEP 250 milliSECONDS HERE ... back to transparent
						buttonThree.postDelayed(new Runnable() {

					    @Override
					    public void run() {
							buttonThree.setBackgroundColor(Color.TRANSPARENT);
					    }
					}, 250);
					  	buttonThree.setBackgroundColor(Color.GREEN);
				}
				
				if (randoNewCorrectButton == 4){
				// SLEEP 250 milliSECONDS HERE ... back to transparent
						buttonFour.postDelayed(new Runnable() {

					    @Override
					    public void run() {
							buttonFour.setBackgroundColor(Color.TRANSPARENT);
					    }
					}, 250);
					  	buttonFour.setBackgroundColor(Color.GREEN);
				}
				

			}
			
			
			@Override
			protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				
				
				//clears the Answers Summary.
				totalSummary = "";
				
			//makes it full screen
		        requestWindowFeature(Window.FEATURE_NO_TITLE);
		        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
		                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
				setContentView(R.layout.activity_practice);
				setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
				
				//STARTS MUSIC
				backgroundMusic = MediaPlayer.create(this, R.raw.coriolan);
				backgroundMusic.start();
				printButtons();
			
				
				//declares the first text


				final TextView buttonOne = (TextView) findViewById(R.id.buttonPracticeBackCredits);
				final TextView buttonTwo = (TextView) findViewById(R.id.buttonPractice2);
				final TextView buttonThree = (TextView) findViewById(R.id.buttonPractice3);
				final TextView buttonFour = (TextView) findViewById(R.id.buttonPractice4);
				final TextView buttonAnswers = (TextView) findViewById(R.id.buttonPracticeAnswers);
				final TextView score = (TextView) findViewById(R.id.scorePracticeText);

				Button pushMe = (Button) buttonOne;	//declares the first button
				Button pushMe2 = (Button) buttonTwo;	//declares the second button
				Button pushMe3 = (Button) buttonThree;	//declares the third button
				Button pushMe4 = (Button) buttonFour;	//declares the fourth button
				Button pushAnswers = (Button) buttonAnswers; //declares answer button
				
				score.setText("0");
				
				pushMe.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {

						//increases the score
						if (randoNewCorrectButton == 1){
						varScore = varScore + 5;
						score.setText(Integer.toString(varScore));

						//flash Green
						flashGreen();
						  	
						  	
						}
						else
						{
							varScore = varScore - 1;
							score.setText(Integer.toString(varScore));
						    // SLEEP 250 milliSECONDS HERE ... back to transparent
									buttonOne.postDelayed(new Runnable() {

								    @Override
								    public void run() {
										buttonOne.setBackgroundColor(Color.TRANSPARENT);
								    }
								}, 250);
							  	buttonOne.setBackgroundColor(Color.RED);
								flashGreen();
								

						}
						

						
						//Print Buttons
						printButtons();

						
					}});

				pushMe2.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						//increases the score
						if (randoNewCorrectButton == 2){
						varScore = varScore + 5;
						score.setText(Integer.toString(varScore));
						
						//flash Green
						flashGreen();
						  	
						  	
						}
						else
						{
							varScore = varScore - 1;
							score.setText(Integer.toString(varScore));
						    // SLEEP 250 milliSECONDS HERE ... back to transparent
									buttonTwo.postDelayed(new Runnable() {

								    @Override
								    public void run() {
										buttonTwo.setBackgroundColor(Color.TRANSPARENT);
								    }
								}, 250);
							  	buttonTwo.setBackgroundColor(Color.RED);
								flashGreen();
						}
						
						//Print Buttons
						printButtons();

						
					}
				});
				
				pushMe3.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						//increases the score
						if (randoNewCorrectButton == 3){
						varScore = varScore + 5;
						score.setText(Integer.toString(varScore));
						//flash Green
						flashGreen();
						  	
						  	
						}
						else
						{
							varScore = varScore - 1;
							score.setText(Integer.toString(varScore));
						    // SLEEP 250 milliSECONDS HERE ... back to transparent
									buttonThree.postDelayed(new Runnable() {

								    @Override
								    public void run() {
										buttonThree.setBackgroundColor(Color.TRANSPARENT);
								    }
								}, 250);
							  	buttonThree.setBackgroundColor(Color.RED);
								flashGreen();
						}
						//Print Buttons
						printButtons();
						
					}
				});
				
				pushMe4.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						//increases the score
						if (randoNewCorrectButton == 4){
						varScore = varScore + 5;
						score.setText(Integer.toString(varScore));
						//flash Green
						flashGreen();
						  	
						  	
						}
						else
						{
							varScore = varScore - 1;
							score.setText(Integer.toString(varScore));
						    // SLEEP 250 milliSECONDS HERE ... back to transparent
									buttonFour.postDelayed(new Runnable() {

								    @Override
								    public void run() {
										buttonFour.setBackgroundColor(Color.TRANSPARENT);
								    }
								}, 250);
							  	buttonFour.setBackgroundColor(Color.RED);
								flashGreen();
						}
						
						//Print Buttons
						printButtons();
						
					}
				});
				
				pushAnswers.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						Intent goToPracticeAnswers = new Intent(Practice.this, AnswersScreen.class);
						startActivity(goToPracticeAnswers);
						
					}
				});

				
			}


			@Override
			protected void onPause()
			{
				super.onPause();
				backgroundMusic.release();

				
			}




			


	}


