package com.shivamb7.sachinapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Settings extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		final AlertDialog.Builder ad1=new AlertDialog.Builder(this);
		LevelS weather_data[] = new LevelS[]
		        {
		            new LevelS("About"),
					new LevelS("Contact Us"),
					new LevelS("Report a Bug"),
					new LevelS("Disclaimer"),
		            new LevelS("Terms of Service"),
		            new LevelS("Privacy Policy"),
		        };
		ListView lv1=(ListView)findViewById(R.id.listView1);
		SettingsAdapter adapter = new SettingsAdapter(this,
                R.layout.settingsitem, weather_data);
		lv1.setAdapter(adapter);
		
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			if(arg2==0)
			{
				Intent i=new Intent(Settings.this,Info.class);
				startActivity(i);
			}
			else if(arg2==1)
			{
				 	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);  
					String aEmailList[] = { "android.shivam7@gmail.com"};
					emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "SachinApp FeedBack");  
					emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);  
					emailIntent.setType("plain/text");  
					startActivity(Intent.createChooser(emailIntent, "Select Application"));
			}
			else if(arg2==2)
			{
				Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);  
				String aEmailList[] = { "android.shivam7@gmail.com"};
				emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "SachinApp BugReport");  
				emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);  
				emailIntent.setType("plain/text");  
				startActivity(Intent.createChooser(emailIntent, "Select Application"));
		
			}
			 else if(arg2==3)
				{
					ad1.setTitle("Disclaimer");
					ad1.setIcon(R.drawable.logo4);
					
					ad1.setMessage("All images,logos and names depicted and implemented in SachinApp are properties of their respective owners and I do not claim ownership of any of them except the SachinApp title and design.I am not responsible for, and expressly disclaim all liability for damages of any kind arising out of use,reference to or reliance on any information contained in the app. While the information given here is periodically updated, no guarantee is given regarding that the information is correct,complete or up to date. Links from SachinApp to third party websites do not constitute an endorsement by the developer of the products and/or services.");
					ad1.setNeutralButton("Dismiss", new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					});
					ad1.show();
				}
				else if(arg2==4)
				{
					ad1.setIcon(R.drawable.logo4);
					ad1.setTitle("Terms of Service");
					ad1.setMessage("By using SachinApp, you are agreeing to comply with and be bound by the following terms and conditions, which together with the disclaimer and privacy policy govern the developer's relation with you in relation to this app. The content of this app is strictly for general information only and cannot be relied upon or guaranteed in any way. This app contains materials which is owned by us and includes, but is not limited to graphics,layout and appearance. Reproduction is prohibited without prior permission. All trademarks and copyrights, excluding the app title and design are properties of their respective owners." );
					ad1.setNeutralButton("Dismiss", new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					});
					ad1.show();
				}
				else if(arg2==5)
				{
					ad1.setIcon(R.drawable.logo4);
					ad1.setTitle("Privacy Policy");
					ad1.setMessage("Your privacy is important to us. This policy is intended to give you confidence in the privacy and security of your information . All information is kept strictly anonymous and is not shared with any third party individuals. However, please note that we are not responsible for any of your personal information that you give out to third party applications and/or websites while using SachinApp, and in the aforementioned event, the developer of SachinApp cannot be held responsible." );
					ad1.setNeutralButton("Dismiss", new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					});
					ad1.show();
				}
			 
				
				
			}
		
		
		});
       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}

}
