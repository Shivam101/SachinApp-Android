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

public class Quotes extends FragmentActivity {

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
		setContentView(R.layout.activity_quotes);
		adv=(AdView)findViewById(R.id.displayads);
		adv.loadAd(new AdRequest());
		ActionBar ab=getActionBar();
		Resources r=getResources();
		Drawable d=r.getDrawable(R.color.playorange);
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
		getMenuInflater().inflate(R.menu.quotes, menu);
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
				Fragment frag1=new ShowQuoteFrag1();
				return frag1;
			}
			else if(position==1)
			{
				Fragment frag2=new ShowQuoteFrag2();
				return frag2;
			}
			else if(position==2)
			{
				Fragment frag3=new ShowQuoteFrag3();
				return frag3;
			}
			else if(position==3)
			{
				Fragment frag4=new ShowQuoteFrag4();
				return frag4;
			}
			else if(position==4)
			{
				Fragment frag5=new ShowQuoteFrag5();
				return frag5;
			}
			else if(position==5)
			{
				Fragment frag6=new ShowQuoteFrag6();
				return frag6;
			}
			else if(position==6)
			{
				Fragment frag7=new ShowQuoteFrag7();
				return frag7;
			}
			else if(position==7)
			{
				Fragment frag8=new ShowQuoteFrag8();
				return frag8;
			}
			else if(position==8)
			{
				Fragment frag9=new ShowQuoteFrag9();
				return frag9;
			}
			else if(position==9)
			{
				Fragment frag10=new ShowQuoteFrag10();
				return frag10;
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
			return 10;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.author1).toUpperCase(l);
			case 1:
				return getString(R.string.author2).toUpperCase(l);
			case 2:
				return getString(R.string.author3).toUpperCase(l);
			case 3:
				return getString(R.string.author4).toUpperCase(l);
			case 4:
				return getString(R.string.author5).toUpperCase(l);
			case 5:
				return getString(R.string.author6).toUpperCase(l);
			case 6:
				return getString(R.string.author7).toUpperCase(l);
			case 7:
				return getString(R.string.author8).toUpperCase(l);
			case 8:
				return getString(R.string.author9).toUpperCase(l);
			case 9:
				return getString(R.string.author10).toUpperCase(l);

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
			View rootView = inflater.inflate(R.layout.fragment_quotes_dummy,
					container, false);
			TextView dummyTextView = (TextView) rootView
					.findViewById(R.id.section_label);
			dummyTextView.setText(Integer.toString(getArguments().getInt(
					ARG_SECTION_NUMBER)));
			return rootView;
		}
	}

}
