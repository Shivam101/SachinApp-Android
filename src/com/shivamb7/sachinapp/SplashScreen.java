package com.shivamb7.sachinapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends Activity {

	
	//how long until we go to the next activity
    protected int _splashTime = 1500; 

    private Thread splashTread;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
        setContentView(R.layout.sach1);

        final SplashScreen sPlashScreen = this; 

        Handler HANDLER = new Handler();

        // thread for displaying the SplashScreen
        HANDLER.postDelayed(new Runnable() {
            @Override
            public void run() {
             finish();
             startActivity (new Intent(getApplicationContext(),Start.class));
            }
          }, _splashTime);

        
    }

    

}