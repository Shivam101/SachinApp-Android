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

public class LevelAdapter extends ArrayAdapter<Level> {
	
	 static Context context;
	    static int layoutResourceId;   
	     Level data[] = null;
	   
	 public LevelAdapter(Context context, int layoutResourceId, Level[] data) {
	        super(context, layoutResourceId, data);
	        this.layoutResourceId = layoutResourceId;
	        this.context = context;
	        this.data = data;
	    }
	    
	   /* public LevelAdapter(ShowFrag1 showFrag1, int listItem,
				Level[] weather_data) {
	    	super(context, layoutResourceId, data);
	        this.layoutResourceId = layoutResourceId;
	        this.context = context;
	        this.data = data;

			// TODO Auto-generated constructor stub
		}*/

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
	          // holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
	            holder.txtTitle = (TextView)row.findViewById(R.id.txt);
	           // holder.imgIcon2=(ImageView)row.findViewById(R.id.imgIcon2);
	    		Typeface robotoLight = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Light.ttf");
	            holder.txtTitle.setTypeface(robotoLight);
	           
	            row.setTag(holder);
	        }
	        else
	        {
	            holder = (WeatherHolder)row.getTag();
	        }
	       
	        Level weather = data[position];
	        holder.txtTitle.setText(weather.title);
	    //    holder.imgIcon.setImageResource(weather.icon);
	       
	        return row;
	    }
	   
	    static class WeatherHolder
	    {
	     //   ImageView imgIcon;
	        TextView txtTitle;
	    //    ImageView imgIcon2;
	    }

}
