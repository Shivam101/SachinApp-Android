package com.shivamb7.sachinapp;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

	Drawable back=null;
	GridView gv;
	AdView adv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		//rootLayout = (LinearLayout) findViewById(R.id.rootLayout);
		gv=(GridView)findViewById(R.id.gridview);
		adv=(AdView)findViewById(R.id.displayads);
		adv.loadAd(new AdRequest());
		gv.setAdapter(new ImageAdapter(this));
		
		gv.setOnItemClickListener(new OnItemClickListener() {
	        

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long id) {
				if(position==0)
				{
					Intent i0=new Intent(MainActivity.this,About2.class);
					startActivity(i0);
					//Toast.makeText(getBaseContext(), "first image",Toast.LENGTH_SHORT).show();
				}
				else if(position==1)
				{
					Intent i1=new Intent(MainActivity.this,Quotes.class);
					startActivity(i1);
				}
				else if(position==2)
				{
					Intent i2=new Intent(MainActivity.this,Quiz.class);
					startActivity(i2);
				}
				else if(position==3)
				{
					Intent i3=new Intent(MainActivity.this,Facts2.class);
					startActivity(i3);
				}
				else if(position==4)
				{
					Intent i4=new Intent(MainActivity.this,Century2.class);
					startActivity(i4);
				}
				else if(position==5)
				{
					Intent i5=new Intent(MainActivity.this,ImagesSwipe.class);
					startActivity(i5);
				}
				// TODO Auto-generated method stub
				
			}
	    });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater mi=getMenuInflater();
		mi.inflate(R.menu.main,menu);
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		switch(item.getItemId())
		{
		/*case R.id.email:
		{
			Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);  
			String aEmailList[] = { "android.shivam7@gmail.com"};
			emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "The Sachin App");  
			emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);  
			emailIntent.setType("plain/text");  
			startActivity(Intent.createChooser(emailIntent, "Select Application"));  
			break;
		}*/
		case R.id.settings:
		{
			Intent i=new Intent(MainActivity.this,Settings.class);
			startActivity(i);
		}
		
		}
		return false;
		
	}

}
