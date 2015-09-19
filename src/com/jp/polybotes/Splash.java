package com.jp.polybotes;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;



public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		
		//makes it full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
		setContentView(R.layout.activity_splash);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        
		Thread timer = new Thread()
		{
			public void run(){
				try{
					sleep(3000);
				} catch (InterruptedException e){
					e.printStackTrace(); //for debugging 
				} finally {
					Intent MainAct = new Intent(Splash.this, myMenu.class);
							startActivity(MainAct);
							finish();
				}
			}
		};
		
		timer.start();
	}



}
