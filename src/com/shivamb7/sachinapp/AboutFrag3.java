package com.shivamb7.sachinapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutFrag3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.aboutfrag3, container,false);
    	ListView lv1=(ListView) v.findViewById(R.id.listView1);
		ListView lv2=(ListView)v.findViewById(R.id.listView2);
    	Level weather_data[] = new Level[]
                {
                   // new Level(R.drawable.sachin1,"                          Batting Statistics    ",R.drawable.play_button),
    				new Level("ODI Matches:",   "463"),
                    new Level("ODI Runs",   "18426"),
                    new Level("ODI High Score",   "200"),
                    new Level("ODI Average",   "44.83"),
                    new Level("ODI Strike Rate",   "86.23"),
                    new Level("ODI 100s",   "49"),
                    new Level("ODI 50s",   "96"),
                    new Level("Test Matches",   "198"),
                    new Level("Test Runs",   "15837"),
                    new Level("Test High Score",   "248"),
                    new Level("Test Average",   "53.87"),
                    new Level("Test Strike Rate",   "54.06"),
                    new Level("Test 100s" ,  "51"),
                    new Level("Test 50s",   "67")


                };
    	Level weather_data2[] = new Level[]
    			{
    			new Level("ODI Matches",   "463"),
    			new Level("ODI Wickets",   "154"),
    			new Level("ODI Best"   ,"5-32"),
    			new Level("ODI Economy"   ,"5.11"),
                new Level("Test Matches"   ,"198"),
                new Level("Test Wickets"   ,"45"),
                new Level("Test Best"   ,"3-10"),
                new Level("Test Economy",   "3.52")
    			};
        LevelAdapter3 adapter = new LevelAdapter3(getActivity(),
                R.layout.list_item_new, weather_data);
        LevelAdapter3 adapter2 = new LevelAdapter3(getActivity(), R.layout.list_item_new, weather_data2);
     
        View header = inflater.inflate(R.layout.header2, null);
        //View header2 = inflater.inflate(R.layout.header, null);
        View header3 = inflater.inflate(R.layout.header3, null);
       lv1.addHeaderView(header);
       lv2.addHeaderView(header3);
        lv1.setAdapter(adapter);
        lv2.setAdapter(adapter2);
        Utility.setListViewHeightBasedOnChildren(lv1);
        Utility.setListViewHeightBasedOnChildren(lv2);
    	return v;
    }
}