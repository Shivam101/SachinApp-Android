package com.shivamb7.sachinapp;

public class Level2 {
	public int icon;
    public String title;
    public String title2;
    public String title3;
    
    public Level2()
    {
        super();
    }
   
    public Level2(String title,String title2,String title3,int icon) {
        super();
        this.icon = icon;
        this.title = title;
        this.title2=title2;
        this.title3=title3;
    }
    public Level2(String title,String title2)
    {
    	super();
    	this.title=title;
    	this.title2=title2;
    }

}
