package com.shivamb7.sachinapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TestFrag1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment

    	View v=inflater.inflate(R.layout.odifrag, container,false);
    	ListView lv1=(ListView) v.findViewById(R.id.listView1);
		
    	Level2 weather_data[] = new Level2[]
                {
                    new Level2("110 against Australia","9 September 1994","R. Premadasa Stadium, Colombo",R.drawable.aus),
                    new Level2("115 against New Zealand","28 October 1994","IPCL Sports Complex Ground, Vadodara",R.drawable.nz),
                    new Level2("105 against West Indies","11 November 1994","Sawai Mansingh Stadium, Jaipur",R.drawable.wi),
                    new Level2("112* against Sri Lanka","9 April 1995","Sharjah Cricket Association Stadium, Sharjah",R.drawable.sl),
                    new Level2("127* against Kenya","18 February 1996","Barabati Stadium, Cuttack",R.drawable.ken),
                    new Level2("137 against Sri Lanka","2 March 1996","Feroz Shah Kotla, New Delhi",R.drawable.sl),
                    new Level2("100 against Pakistan","5 April 1996","Padang, Singapore",R.drawable.pak),
                    new Level2("118 against Pakistan","15 April 1996","Sharjah Cricket Association Stadium, Sharjah",R.drawable.pak),
                    new Level2("110 against Sri Lanka","28 August 1996","R. Premadasa Stadium, Colombo",R.drawable.sl),
                    new Level2("114 against South Africa","14 December 1996","Wankhede Stadium, Mumbai",R.drawable.sa),
                    new Level2("104 against Zimbabwe","9 February 1997","Willowmoore Park, Benoni",R.drawable.zim),
                    new Level2("117 against New Zealand","14 May 1997","M. Chinnaswamy Stadium, Bangalore",R.drawable.nz),
                    new Level2("100 against Australia","7 April 1998","Green Park Stadium, Kanpur",R.drawable.aus),
                    new Level2("143 against Australia","22 April 1998","Sharjah Cricket Association Stadium, Sharjah",R.drawable.aus),
                    new Level2("134 against Australia","24 April 1998","Sharjah Cricket Association Stadium, Sharjah",R.drawable.aus),
                    new Level2("100* against Kenya","31 May 1998","Eden Gardens, Kolkata",R.drawable.ken),
                    new Level2("128 against Sri Lanka","7 July 1998","R. Premadasa Stadium, Colombo",R.drawable.sl),
                    new Level2("127* against Zimbabwe","26 September 1998","Queens Sports Club, Bulawayo",R.drawable.zim),
                    new Level2("141 against Australia","28 October 1998","Bangabandhu Stadium, Dhaka",R.drawable.aus),
                    new Level2("118* against Zimbabwe","8 November 1998","Sharjah Cricket Association Stadium, Sharjah",R.drawable.zim),
                    new Level2("124* against Zimbabwe","13 November 1998","Sharjah Cricket Association Stadium, Sharjah",R.drawable.zim),
                    new Level2("140* against Kenya","23 May 1999","County Ground, Bristol",R.drawable.ken),
                    new Level2("120 against Sri Lanka","29 August 1999","Sinhalese Sports Club Ground, Colombo",R.drawable.sl),
                    new Level2("186* against New Zealand","8 November 1999","Lal Bahadur Shastri Stadium, Hyderabad",R.drawable.nz),
                    new Level2("122 against South Africa","17 March 2000","IPCL Sports Complex Ground, Vadodara",R.drawable.sa),
                    new Level2("101 against Sri Lanka","20 October 2000","Sharjah Cricket Association Stadium, Sharjah",R.drawable.sl),
                    new Level2("146 against Zimbabwe","8 December 2000","Barkatullah Khan Stadium, Jodhpur",R.drawable.zim),
                    new Level2("139 against Australia","31 March 2001","Nehru Stadium, Indore",R.drawable.aus),
                    new Level2("122* against West Indies","4 July 2001","Harare Sports Club, Harare",R.drawable.wi),
                    new Level2("101 against South Africa","5 October 2001","New Wanderers Stadium, Johannesburg",R.drawable.sa),
                    new Level2("146 against Kenya","24 October 2001","Boland Park, Paarl",R.drawable.ken),
                    new Level2("105* against England","4 July 2002","Riverside Ground, Chester-le-Street",R.drawable.eng),
                    new Level2("113 against Sri Lanka","11 July 2002","County Ground, Bristol",R.drawable.sl),
                    new Level2("152 against Namibia","23 February 2003","City Oval, Pietermaritzburg",R.drawable.nam),
                    new Level2("100 against Australia","26 October 2003","Roop Singh Stadium, Gwalior",R.drawable.aus),
                    new Level2("102 against New Zealand","15 November 2003","Lal Bahadur Shastri Stadium, Hyderabad",R.drawable.nz),
                    new Level2("141 against Pakistan","16 March 2004","Rawalpindi Cricket Stadium, Rawalpindi",R.drawable.pak),
                    new Level2("123 against Pakistan","12 April 2004","Sardar Patel Stadium, Motera, Ahmedabad",R.drawable.pak),
                    new Level2("100 against Pakistan","6 February 2006","Arbab Niaz Stadium, Peshawar",R.drawable.pak),
                    new Level2("141* against West Indies","14 September 2006","Kinrara Academy Oval, Kuala Lumpur",R.drawable.wi),
                    new Level2("100* against West Indies","31 January 2007","IPCL Sports Complex Ground, Vadodara",R.drawable.wi),
                    new Level2("117* against Australia","2 March 2008","Sydney Cricket Ground, Sydney",R.drawable.aus),
                    new Level2("163* against New Zealand","8 March 2009","AMI Stadium, Christchurch",R.drawable.nz),
                    new Level2("138 against Sri Lanka","14 September 2009","R. Premadasa Stadium, Colombo",R.drawable.sl),
                    new Level2("175 against Australia","5 November 2009","Rajiv Gandhi International Stadium, Hyderabad",R.drawable.aus),
                    new Level2("200* against South Africa","24 Febraury 2010","Roop Singh Stadium, Gwalior",R.drawable.sa),
                    new Level2("120 against England","27 February 2011","M. Chinnaswamy Stadium, Bangalore",R.drawable.eng),
                    new Level2("111 against South Africa","12 March 2011","VCA Stadium, Nagpur",R.drawable.sa),
                    new Level2("114 against Bangladesh","16 March 2012","Sher-e-Bangla National Stadium, Mirpur",R.drawable.bangla)
                };
        LevelAdapter2 adapter = new LevelAdapter2(getActivity(),
                R.layout.list_item4, weather_data);
     
        View header = inflater.inflate(R.layout.header6, null);
        lv1.addHeaderView(header);

        lv1.setAdapter(adapter);
    	return v;
    }
}