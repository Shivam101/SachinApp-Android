package com.shivamb7.sachinapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends ArrayAdapter<LevelX> {
	
	 static Context context;
	    static int layoutResourceId;   
	     LevelX data[] = null;
	   
	 public GridAdapter(Context context, int layoutResourceId, LevelX[] data) {
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
	           holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
	            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
	            holder.txtTitle2 = (TextView)row.findViewById(R.id.txtTitle2);
	         //   holder.txtTitle3 = (TextView)row.findViewById(R.id.txtTitle3);
	    		Typeface robotoSlab = Typeface.createFromAsset(getContext().getAssets(), "RobotoSlab-Light.ttf");
	          //   holder.imgIcon2=(ImageView)row.findViewById(R.id.imgIcon2);
	    		Typeface robotoLight = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Light.ttf");
	            holder.txtTitle.setTypeface(robotoSlab);
	           
	            row.setTag(holder);
	        }
	        else
	        {
	            holder = (WeatherHolder)row.getTag();
	        }
	       
	        LevelX weather = data[position];
	        holder.txtTitle.setText(weather.title);
	        holder.imgIcon.setImageResource(weather.icon);
	        holder.txtTitle2.setText(weather.title2);
	        //holder.txtTitle3.setText(weather.title3);
	       
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
