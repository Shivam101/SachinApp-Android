package com.shivamb7.sachinapp;

import android.R.color;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LevelAdapter2 extends ArrayAdapter<Level2> {
	
	 static Context context;
	    static int layoutResourceId;   
	     Level2 data[] = null;
	   
	 public LevelAdapter2(Context context, int layoutResourceId, Level2[] data) {
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
	           //row.setMinimumHeight(200);
	            holder = new WeatherHolder();
	           holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
	    		Typeface robotoLight = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Light.ttf");
	            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
	            holder.txtTitle2 = (TextView)row.findViewById(R.id.txtTitle2);
	            holder.txtTitle3 = (TextView)row.findViewById(R.id.txtTitle3);
	            holder.txtTitle.setTypeface(robotoLight);
	            holder.txtTitle2.setTypeface(robotoLight);
	            holder.txtTitle3.setTypeface(robotoLight);
	            //holder.txtTitle2.setTextColor(Color.parseColor("#ff0099cc"));
	            //holder.txtTitle3.setTextColor(Color.parseColor("#FF4444"));
	            
	            
	            row.setTag(holder);
	        }
	        else
	        {
	            holder = (WeatherHolder)row.getTag();
	        }
	       
	        Level2 weather = data[position];
	        holder.txtTitle.setText(weather.title);
	        holder.imgIcon.setImageResource(weather.icon);
	        holder.txtTitle2.setText(weather.title2);
	        holder.txtTitle3.setText(weather.title3);
	        return row;
	    }
	   
	    static class WeatherHolder
	    {
	       ImageView imgIcon;
	        TextView txtTitle;
	        TextView txtTitle2;
	        TextView txtTitle3;
	    //    ImageView imgIcon2;
	    }

}
