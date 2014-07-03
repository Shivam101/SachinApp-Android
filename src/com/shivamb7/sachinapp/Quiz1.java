package com.shivamb7.sachinapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz1);
		ActionBar ab=getActionBar();
		Resources r=getResources();
		Drawable d=r.getDrawable(R.color.quizcolor);
		ab.setBackgroundDrawable(d);
		
		ab.hide();
		TextView tv1=(TextView)findViewById(R.id.textView1);
		Typeface robotoLight = Typeface.createFromAsset(getApplicationContext().getAssets(), "Roboto-Light.ttf");
		tv1.setTypeface(robotoLight);
		Button b1=(Button)findViewById(R.id.button1);
		Button b2=(Button)findViewById(R.id.button2);
		Button b4=(Button)findViewById(R.id.button4);
		Button b3=(Button)findViewById(R.id.button3);
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast t=Toast.makeText(getBaseContext(), "Correct!!", Toast.LENGTH_SHORT);
				t.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
				t.show();
				Quiz.score++;
				Intent i=new Intent(Quiz1.this,Quiz2.class);
				startActivity(i);
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast t=Toast.makeText(getBaseContext(), "Incorrect! Try Again", Toast.LENGTH_SHORT);
				t.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
				t.show();
				Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(500);

			}
		});
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast t=Toast.makeText(getBaseContext(), "Incorrect! Try Again", Toast.LENGTH_SHORT);
				t.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
				t.show();
				Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(500);
			}
		});
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast t=Toast.makeText(getBaseContext(), "Incorrect! Try Again", Toast.LENGTH_SHORT);
				t.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
				t.show();
				Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(500);
			}
		});
		}
	public void onPause()
	{
		super.onPause();
		finish();
	}
	
	public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Quiz1.this,Quiz.class);
        startActivity(intent);
        //finish();
   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz1, menu);
		return true;
	}
	
}
