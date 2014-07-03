package com.shivamb7.sachinapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter2 extends BaseAdapter {

	private Context ctx;
	
	public ImageAdapter2(Context c)
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
            iv.setLayoutParams(new GridView.LayoutParams(350,350));
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            iv.setPadding(8, 8, 8, 8);
        } else {
            iv = (ImageView) convertView;
        }

        iv.setImageResource(pics[position]);
        return iv;
		
	}
	
	private Integer[] pics={
			R.drawable.sachin1,R.drawable.sachin2,
			R.drawable.sachin3,R.drawable.sachin4,
			R.drawable.sachin6,R.drawable.sachin7,
			R.drawable.sachin8,R.drawable.sachin9,
			R.drawable.sachin10,R.drawable.sachin11,
			R.drawable.sachin12,R.drawable.sachin13,
			R.drawable.sachin14,R.drawable.sachin15,
			R.drawable.sachin16,R.drawable.sachin17,
			R.drawable.sachin18,R.drawable.sachin19,
	};
	}
