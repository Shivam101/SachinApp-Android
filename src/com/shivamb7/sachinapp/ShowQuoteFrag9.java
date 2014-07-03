package com.shivamb7.sachinapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowQuoteFrag9 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    	View v=inflater.inflate(R.layout.quote9, container, false);
    	TextView tv1=(TextView)v.findViewById(R.id.textView1);
		Typeface robotoCondensedItalic = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-CondensedItalic.ttf");
		tv1.setTypeface(robotoCondensedItalic);
        return v;
    }
}