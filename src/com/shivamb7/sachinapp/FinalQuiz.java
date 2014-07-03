package com.shivamb7.sachinapp;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class FinalQuiz extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_final_quiz);
		ActionBar ab=getActionBar();
		ab.hide();
		TextView tv1=(TextView)findViewById(R.id.textView1);
		Typeface robotoLight = Typeface.createFromAsset(getApplicationContext().getAssets(), "Roboto-Light.ttf");
		tv1.setTypeface(robotoLight);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.final_quiz, menu);
		return true;
	}

}
