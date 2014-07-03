package com.shivamb7.sachinapp;

public class LevelX {
	public int icon;
    public String title;
    public int icon2;
    public String title2;
    public String title3;
    
    public LevelX()
    {
        super();
    }
   
    public LevelX(int icon, String title,int icon2) {
        super();
        this.icon = icon;
        this.title = title;
        this.icon2=icon2;
    }
    public LevelX(String title,String title2)
    {
    	super();
    	this.title=title;
    	this.title2=title2;
    }
    public LevelX(String title,String title2,String title3,int icon) {
        super();
        this.icon = icon;
        this.title = title;
        this.title2=title2;
        this.title3=title3;
    }

}
