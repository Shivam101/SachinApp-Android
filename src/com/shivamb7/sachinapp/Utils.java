package com.shivamb7.sachinapp;

import android.app.Activity;
import android.content.Intent;

public class Utils {
	private static int theme;
	public final static int THEME_LIGHT = 0;
    public final static int THEME_DARK = 1;
    //public final static int THEME_BLUE = 2;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
         theme = theme;
         activity.finish();

activity.startActivity(new Intent(activity, activity.getClass()));

    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
         switch (theme)
         {
         default:
         case THEME_LIGHT:
             activity.setTheme(R.style.AppBaseTheme);
             break;
         case THEME_DARK:
             activity.setTheme(R.style.AppTheme2);
             break;
         /*case THEME_BLUE:
             activity.setTheme(R.style.Thirdheme);
             break;*/
         }
    }
}


	


