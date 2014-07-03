package com.shivamb7.sachinapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingsAdapter extends ArrayAdapter<LevelS> {
	
	 Context context;
	    int layoutResourceId;   
	    LevelS data[] = null;
	   
	    public SettingsAdapter(Context context, int layoutResourceId, LevelS[] data) {
	        super(context, layoutResourceId, data);
	        this.layoutResourceId = layoutResourceId;
	        this.context = context;
	        this.data = data;
	    }
	    
	    public long getItemId(int position) {
            return position;
	    }

	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	        View row = convertView;
	        WeatherHolder holder = null;
	       
	        if(row == null)
	        {
	            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
	            row = inflater.inflate(layoutResourceId, parent, false);
	           
	            holder = new WeatherHolder();
	            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
	            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
	           // holder.imgIcon2=(ImageView)row.findViewById(R.id.imgIcon2);
	    		Typeface robotoLight = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Light.ttf");

//	            holder.txtTitle.setTypeface(robotoLight); 
	           
	            row.setTag(holder);
	        }
	        else
	        {
	            holder = (WeatherHolder)row.getTag();
	        }
	       
	        LevelS weather = data[position];
	        holder.txtTitle.setText(weather.title);
	        holder.imgIcon.setImageResource(weather.icon);
	       
	        return row;
	    }
	   
	    static class WeatherHolder
	    {
	        ImageView imgIcon;
	        TextView txtTitle;
	    //    ImageView imgIcon2;
	    }

}
