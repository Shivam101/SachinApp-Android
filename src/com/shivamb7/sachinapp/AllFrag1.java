package com.shivamb7.sachinapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AllFrag1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.frag1, container,false);
    	ListView lv1=(ListView) v.findViewById(R.id.listView1);
		//String[]songs=getResources().getStringArray(R.array.song_names);
		//lv1.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.list_item,R.id.label,songs));
		//return v;
    	Level weather_data[] = new Level[]
                {
                    new Level(R.drawable.sachin1, "Level 1", R.drawable.play_button),
                    new Level(R.drawable.sachin2, "Level 2",R.drawable.play_button),
                    new Level(R.drawable.sachin3, "Level 3",R.drawable.play_button),
                    new Level(R.drawable.sachin4, "Level 4",R.drawable.play_button),
                    new Level(R.drawable.sachin6, "Level 5",R.drawable.play_button)
                };
        LevelAdapter adapter = new LevelAdapter(getActivity(),
                R.layout.list_item, weather_data);
     //   LayoutInflater li=(LayoutInflater)v.
    //    View header = (View)getLayoutInflater().inflate(R.layout.header, null);
       // lv1.addHeaderView(header);

        lv1.setAdapter(adapter);
    	return v;
    }
}