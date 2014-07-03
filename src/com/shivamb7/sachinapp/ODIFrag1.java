package com.shivamb7.sachinapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ODIFrag1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment

    	View v=inflater.inflate(R.layout.odifrag, container,false);
    	ListView lv1=(ListView) v.findViewById(R.id.listView1);
		
    	Level2 weather_data[] = new Level2[]
                {
                    new Level2("119* against England", "14 August 1990","Old Trafford, Manchester",R.drawable.eng),
                    new Level2("148* against Australia", "6 January 1992","SCG, Sydney",R.drawable.aus),
                    new Level2("114 against Australia", "3 February 1992","WACA, Perth",R.drawable.aus),
                    new Level2("111 against South Africa","28 November 1992","Wanderers Stadium, Johannesberg",R.drawable.sa),
                    new Level2("165 against England","12 February 1993","M.A. Chidambaram Stadium, Chennai",R.drawable.eng),
                    new Level2("104* against Sri Lanka","31 July 1993","Sinhalese Sports Club Ground, Colombo",R.drawable.sl),
                    new Level2("142 against Sri Lanka","19 January 1994","K. D. Singh Babu Stadium, Lucknow",R.drawable.sl),
                    new Level2("179 against West Indies","2 December 1994","VCA Ground, Nagpur",R.drawable.wi),
                    new Level2("122 against England","8 June 1996","Edgbaston, Birmingham",R.drawable.eng),
                    new Level2("177 against England","5 July 1996","Trent Bridge, Nottingham",R.drawable.eng),
                    new Level2("169 against South Africa","4 January 1997","Newlands Cricket Ground, Cape Town",R.drawable.sa),
                    new Level2("143 against Sri Lanka","3 August 1997","R. Premadasa Stadium, Colombo",R.drawable.sl),
                    new Level2("139 against Sri Lanka","11 August 1997","Sinhalese Sports Club Ground, Colombo",R.drawable.sl),
                    new Level2("148 against Sri Lanka","4 December 1997","Wankhede Stadium, Mumbai",R.drawable.sl),
                    new Level2("155* against Australia","9 March 1998","M. A. Chidambaram Stadium, Chennai",R.drawable.aus),
                    new Level2("177 against Australia","26 March 1998","M. Chinnaswamy Stadium, Bangalore",R.drawable.aus),
                    new Level2("113 against New Zealand","29 December 1998","Basin Reserve, Wellington",R.drawable.nz),
                    new Level2("136 against Pakistan","31 January 1999"," 	M. A. Chidambaram Stadium, Chennai",R.drawable.pak),
                    new Level2("124* against Sri Lanka","28 February 1999"," 	Sinhalese Sports Club Ground, Colombo",R.drawable.sl),
                    new Level2("126* against New Zealand","13 October 1999","Punjab Cricket Association Stadium, Mohali",R.drawable.nz),
                    new Level2("217 against New Zealand","30 October 1999","Sardar Patel Stadium, Motera, Ahmedabad",R.drawable.nz),
                    new Level2("116 against Australia","28 December 1999","Melbourne Cricket Ground, Melbourne",R.drawable.aus),
                    new Level2("122 against Zimbabwe","21 November 2000","Feroz Shah Kotla, New Delhi",R.drawable.zim),
                    new Level2("201* against Zimbabwe","26 November 2000","VCA Ground, Nagpur",R.drawable.zim),
                    new Level2("126 against Australia","20 March 2001","M. A. Chidambaram Stadium, Chennai",R.drawable.aus),
                    new Level2("155 against South Africa","3 November 2001","Goodyear Park, Bloemfontein",R.drawable.sa),
                    new Level2("103 against England","13 December 2001","Sardar Patel Stadium, Motera, Ahmedabad",R.drawable.eng),
                    new Level2("176 against Zimbabwe","24 February 2002","Vidarbha Cricket Association Ground, Nagpur",R.drawable.zim),
                    new Level2("117 against West Indies","20 April 2002","Queen's Park Oval, Port of Spain",R.drawable.wi),
                    new Level2("193 against England","23 August 2002","Headingley, Leeds",R.drawable.eng),
                    new Level2("176 against West Indies","3 November 2002","Eden Gardens, Kolkata",R.drawable.wi),
                    new Level2("241* against Australia","4 January 2004","Sydney Cricket Ground, Sydney",R.drawable.aus),
                    new Level2("194* against Pakistan","29 March 2004","Multan Cricket Stadium, Multan",R.drawable.pak),
                    new Level2("248* against Bangladesh","12 December 2004","Bangabandhu National Stadium, Dhaka",R.drawable.bangla),
                    new Level2("109 against Sri Lanka","22 December 2005","Feroz Shah Kotla, New Delhi",R.drawable.sl),
                    new Level2("101 against Bangladesh","19 May 2007","Bir Shrestha Shahid Ruhul Amin Stadium, Chittagong",R.drawable.bangla),
                    new Level2("122* against Bangladesh","26 May 2007","Sher-e-Bangla National Stadium, Mirpur",R.drawable.bangla),
                    new Level2("154* against Australia","4 January 2008"," 	Sydney Cricket Ground, Sydney",R.drawable.aus),
                    new Level2("153 against Australia","25 January 2008","Adelaide Oval, Adelaide",R.drawable.aus),
                    new Level2("109 against Australia","6 November 2008","VCA Stadium, Nagpur",R.drawable.aus),
                    new Level2("103* against England","15 December 2008","M. A. Chidambaram Stadium, Chennai",R.drawable.eng),
                    new Level2("160 against New Zealand","20 March 2009","Seddon Park, Hamilton",R.drawable.nz),
                    new Level2("100* against Sri Lanka","20 November 2009","Sardar Patel Stadium, Motera, Ahmedabad",R.drawable.sl),
                    new Level2("105* against Bangladesh","18 January 2010","Zohur Ahmed Chowdhury Stadium, Chittagong",R.drawable.bangla),
                    new Level2("143 against Bangladesh","25 January 2010","Sher-e-Bangla National Stadium, Mirpur",R.drawable.bangla),
                    new Level2("100 against South Africa","9 February 2010","Cricket Association Stadium, Nagpur",R.drawable.sa),
                    new Level2("106 against South Africa","15 February 2010","Eden Gardens, Kolkata",R.drawable.sa),
                    new Level2("203 against Sri Lanka","28 July 2010","Sinhalese Sports Club Ground, Colombo",R.drawable.sl),
                    new Level2("214 against Australia","11 October 2010","M. Chinnaswamy Stadium, Bangalore",R.drawable.aus),
                    new Level2("111* against South Africa","19 December 2010","SuperSport Park, Centurion",R.drawable.sa),
                    new Level2("146 against South Africa","4 January 2011","Newlands Cricket Ground, Cape Town",R.drawable.sa)
                };
        LevelAdapter2 adapter = new LevelAdapter2(getActivity(),
                R.layout.list_item4, weather_data);
     
        View header = inflater.inflate(R.layout.header2, null);
        lv1.addHeaderView(header);

        lv1.setAdapter(adapter);
    	return v;
    }
}