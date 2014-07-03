package com.shivamb7.sachinapp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class Quiz extends Activity {

	static int score=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		ActionBar ab=getActionBar();
		Resources r=getResources();
		Drawable d=r.getDrawable(R.color.playpurple);
		ab.setBackgroundDrawable(d);
		//ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#330000ff")));
		//ab.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#550000ff")));
		
		
		Typeface robotoThin = Typeface.createFromAsset(getApplicationContext().getAssets(), "Roboto-Light.ttf");
		TextView tv1=(TextView)findViewById(R.id.tv1);
		tv1.setTypeface(robotoThin);
		
		Button b1=(Button)findViewById(R.id.button1);
		b1.setTypeface(robotoThin);
		//b1.setTextColor(Color.RED);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Quiz.this,Quiz1.class);
				startActivity(i);
			}
		});
	
	}
	public void onPause()
	{
		super.onPause();
		finish();
	}
	//@Override 
	/*public void onBackPressed() { super.onBackPressed();
    Intent intent = new Intent(Quiz.this,MainActivity.class);
    startActivity(intent);
    finish(); }*/


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz, menu);
		return true;
	}

}
