package com.shivamb7.sachinapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutFrag1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment

    	View v=inflater.inflate(R.layout.frag1, container,false);
    	ListView lv1=(ListView) v.findViewById(R.id.listView1);
		
    	Level weather_data[] = new Level[]
                {
                    new Level("Name" ,  "Sachin Ramesh Tendulkar"),
                    new Level("Nickname"  , "Master Blaster, Little Master"),
                    new Level("Date of Birth",  "April 24, 1973"),
                    new Level("Place of Birth",   "Mumbai"),
                    new Level("Height", "5 ft 5 in"),
                    new Level("Education", "Sharadashram Vidyamandir School"),
                    new Level("Major Teams",   "India, Mumbai, Yorkshire"),
                    new Level("Batting Style",   "Right -Hand Batsman"),
                    new Level("Bowling Style",   "Right Arm Medium, Leg Break, Right Arm off Break"),
                    new Level("ODI Debut",   "India v Pakistan at Gujranwala, 2nd ODI, 1989/90"),
                    new Level("Test Debut"   ,"India v Pakistan at Karachi, 1st Test, 1989/90")


                };
        LevelAdapter3 adapter = new LevelAdapter3(getActivity(),
                R.layout.list_item_new, weather_data);
     
        View header = inflater.inflate(R.layout.header, null);
        lv1.addHeaderView(header);

        lv1.setAdapter(adapter);
    	return v;
    }
}