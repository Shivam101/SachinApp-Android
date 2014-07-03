package com.shivamb7.sachinapp;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

public class Start extends Activity {
	AdView adv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		adv=(AdView)findViewById(R.id.displayads);
		adv.loadAd(new AdRequest());
		ActionBar ab=getActionBar();
		Resources r=getResources();
		Drawable d=r.getDrawable(R.color.royalblue);
		ab.setBackgroundDrawable(d);
		
		GridView gv1=(GridView)findViewById(R.id.gridview);
		LevelX data[]=new LevelX[]
				{
				 new LevelX("Biography","","",R.drawable.icon_2),
				 new LevelX("Quotes","","",R.drawable.icon_3),
				 new LevelX("Trivia","","",R.drawable.icon_4),
				 new LevelX("Facts","","",R.drawable.icon_5),
				 new LevelX("100 Centuries","","",R.drawable.icon_1),
				 new LevelX("Gallery","","",R.drawable.icon_6),

				};
		GridAdapter ga = new GridAdapter(this,
                R.layout.grid_item, data);
		gv1.setAdapter(ga);
		
		gv1.setOnItemClickListener(new OnItemClickListener() {
	        

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long id) {
				if(position==0)
				{
					Intent i0=new Intent(Start.this,About2.class);
					startActivity(i0);
					//Toast.makeText(getBaseContext(), "first image",Toast.LENGTH_SHORT).show();
				}
				else if(position==1)
				{
					Intent i1=new Intent(Start.this,Quotes.class);
					startActivity(i1);
				}
				else if(position==2)
				{
					Intent i2=new Intent(Start.this,Quiz.class);
					startActivity(i2);
				}
				else if(position==3)
				{
					Intent i3=new Intent(Start.this,Facts2.class);
					startActivity(i3);
				}
				else if(position==4)
				{
					Intent i4=new Intent(Start.this,Century2.class);
					startActivity(i4);
				}
				else if(position==5)
				{
					Intent i5=new Intent(Start.this,ImagesSwipe.class);
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
		
		case R.id.settings:
		{
			Intent i=new Intent(Start.this,Settings.class);
			startActivity(i);
		}
		
		}
		return false;
		
	}


}
