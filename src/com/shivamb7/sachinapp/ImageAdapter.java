package com.shivamb7.sachinapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private Context ctx;
	
	public ImageAdapter(Context c)
	{
		ctx=c;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return pics.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView iv;
		if (convertView == null) {  // if it's not recycled, initialize some attributes
            iv = new ImageView(ctx);
            iv.setLayoutParams(new GridView.LayoutParams(256,256));
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            iv.setPadding(8, 16, 8, 16);
        } else {
            iv = (ImageView) convertView;
        }

        iv.setImageResource(pics[position]);
        return iv;
		
	}
	
	private Integer[] pics={
			R.drawable.icon2,R.drawable.icon3,
			R.drawable.icon4,R.drawable.icon5,
			R.drawable.icon,R.drawable.icon6
	};
	}
