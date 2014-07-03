package com.shivamb7.sachinapp;

public class Level {
	public int icon;
    public String title;
    public int icon2;
    public String title2;
    
    public Level()
    {
        super();
    }
   
    public Level(int icon, String title,int icon2) {
        super();
        this.icon = icon;
        this.title = title;
        this.icon2=icon2;
    }
    public Level(String title,String title2)
    {
    	super();
    	this.title=title;
    	this.title2=title2;
    }

}
