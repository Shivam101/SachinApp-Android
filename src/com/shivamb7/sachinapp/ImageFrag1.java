package com.shivamb7.sachinapp;

import java.io.IOException;

import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ImageFrag1 extends Fragment {
    
	 static ImageView iv1;
	    static Bitmap bmg1;
	@Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    	setHasOptionsMenu(true);

		View v=inflater.inflate(R.layout.imagefrag1, container, false);
		iv1=(ImageView)v.findViewById(R.id.imageView1);
		bmg1=((BitmapDrawable) iv1.getDrawable()).getBitmap();
    	return v;
    }
    public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu, inflater);
    	inflater.inflate(R.menu.image1, menu);
	}
   
    public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case R.id.action_wall:
		{
			/*WallpaperManager wm=WallpaperManager.getInstance(getActivity().getApplicationContext());
			  try{
				  wm.setBitmap(bmg1);
				  Toast.makeText(getActivity().getBaseContext(), "Wallpaper set successfully",Toast.LENGTH_SHORT).show();
			  }
			  catch(IOException e)
			  {
				  Toast.makeText(getActivity().getBaseContext(), "Wallpaper not set successfully",Toast.LENGTH_SHORT).show();
			  }*/
			ImageTask it1=new ImageTask(getActivity());
			it1.execute();
		}
		}
		
		return false;	
		
		
	}

}


