package com.shivamb7.sachinapp;
import java.io.IOException;

import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

class ImageTask extends AsyncTask<Void, Void, Void>
{

	Context c;
	ProgressDialog pd;
	
	public ImageTask(Context ctx)
	{
		this.c=ctx;
	}
	@Override
	protected void onPreExecute() 
	{
		pd=ProgressDialog.show(c, "Please Wait", "Setting Wallpaper...");
	}
	protected void onPostExecute(Void result)
	{
		pd.dismiss();
		Toast.makeText(c, "Wallpaper set successfully", Toast.LENGTH_SHORT).show();
	}
	protected Void doInBackground(Void... params) {
		WallpaperManager wm1=WallpaperManager.getInstance(c);
		try {
			wm1.setBitmap(ImageFrag1.bmg1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
	
}