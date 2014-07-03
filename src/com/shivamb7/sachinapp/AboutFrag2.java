package com.shivamb7.sachinapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class AboutFrag2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment

    	View v=inflater.inflate(R.layout.aboutfrag2, container,false);
    	ListView lv1=(ListView) v.findViewById(R.id.listView1);
		
    	Level weather_data[] = new Level[]
                {
                    new Level("Father's Name",  "Ramesh Tendulkar"),
                    new Level("Mother's Name",   "Rajni"),
                    new Level("First Residence"   ,"Sahitya Sahawas Cooperative Housing Society, Bandra (East)"),
                    new Level("First Coach",   "Ramakant Achrekar"),
                    new Level("Spouse's Name",   "Anjali Tendulkar"),
                    new Level("Son's Name:",   "Arjun Tendulkar"),
                    new Level("Daughter's Name",   "Sara Tendulkar"),
                   // new Level(R.drawable.sachin1, "Tendulkar owns 2 restaurants named ' Sachin's ' and ' Tendulkar's '",R.drawable.play_button),
                    //new Level(R.drawable.sachin1, "A series of comic books by Virgin Comics have Tendulkar as the hero of the book",R.drawable.play_button),
                    //new Level(R.drawable.sachin1, "Tendulkar has a joint venture with Future Group and Manipal Group to promote healthcare and sports under the name ' S Drive and Sach '",R.drawable.play_button),
                    //new Level(R.drawable.sachin1, "Tendulkar sponsors 200 underpriveleged children every year via Apnalaya, a Mumbai based NGO ",R.drawable.play_button)
                    

                };
    	LevelAdapter3 adapter = new LevelAdapter3(getActivity(),
                R.layout.list_item_new, weather_data);
     
        View header = inflater.inflate(R.layout.header4, null);
        lv1.addHeaderView(header);

        lv1.setAdapter(adapter);
    	return v;
    }
}