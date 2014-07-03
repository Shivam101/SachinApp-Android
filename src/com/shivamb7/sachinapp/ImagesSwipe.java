package com.shivamb7.sachinapp;

import java.util.Locale;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.app.ActionBar;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ImagesSwipe extends FragmentActivity {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	AdView adv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_images_swipe);
		adv=(AdView)findViewById(R.id.displayads);
		adv.loadAd(new AdRequest());
		ActionBar ab=getActionBar();
		Resources r=getResources();
		Drawable d=r.getDrawable(R.color.playblue);
		ab.setBackgroundDrawable(d);
		
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the app.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.images_swipe, menu);
		return true;
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			if(position==0)
			{
				Fragment frag1=new ImageFrag1();
				return frag1;
			}
			else if(position==1)
			{
				Fragment frag2=new ImageFrag2();
				return frag2;
			}
			else if(position==2)
			{
				Fragment frag3=new ImageFrag3();
				return frag3;
			}
			else if(position==3)
			{
				Fragment frag4=new ImageFrag4();
				return frag4;
			}
			else if(position==4)
			{
				Fragment frag5=new ImageFrag5();
				return frag5;
			}
			else if(position==5)
			{
				Fragment frag6=new ImageFrag6();
				return frag6;
			}
			else if(position==6)
			{
				Fragment frag7=new ImageFrag7();
				return frag7;
			}
			else if(position==7)
			{
				Fragment frag8=new ImageFrag8();
				return frag8;
			}
			else if(position==8)
			{
				Fragment frag9=new ImageFrag9();
				return frag9;
			}
			else if(position==9)
			{
				Fragment frag10=new ImageFrag10();
				return frag10;
			}
			else if(position==10)
			{
				Fragment frag11=new ImageFrag11();
				return frag11;
			}
			else if(position==11)
			{
				Fragment frag12=new ImageFrag12();
				return frag12;
			}
			else if(position==12)
			{
				Fragment frag13=new ImageFrag13();
				return frag13;
			}
			else if(position==13)
			{
				Fragment frag14=new ImageFrag14();
				return frag14;
			}
			else if(position==14)
			{
				Fragment frag15=new ImageFrag15();
				return frag15;
			}
			else if(position==15)
			{
				Fragment frag16=new ImageFrag16();
				return frag16;
			}
			else if(position==16)
			{
				Fragment frag17=new ImageFrag17();
				return frag17;
			}
			else if(position==17)
			{
				Fragment frag18=new ImageFrag18();
				return frag18;
			}
			else if(position==18)
			{
				Fragment frag19=new ImageFrag19();
				return frag19;
			}
			else
			{
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args);
			return fragment;
			}
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 19;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.title_section1).toUpperCase(l);
			case 1:
				return getString(R.string.title_section2).toUpperCase(l);
			case 2:
				return getString(R.string.title_section3).toUpperCase(l);
			}
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_images_swipe_dummy, container, false);
			TextView dummyTextView = (TextView) rootView
					.findViewById(R.id.section_label);
			dummyTextView.setText(Integer.toString(getArguments().getInt(
					ARG_SECTION_NUMBER)));
			return rootView;
		}
	}

}
