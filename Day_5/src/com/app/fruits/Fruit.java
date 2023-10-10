package com.app.fruits;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean fresh;
	
	public Fruit(String f_name,String f_color,double f_weight)
	{
		name=f_name;
		color=f_color;
		weight=f_weight;
		fresh=true;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return "Color:" +color;
	}

	public String getWeight()
	{
		return "Weight:" +weight +"kgs";
	}
	
	public String toString() 
	{
		return "Name=" +name + ",Color=" +color + ",Weight=" +weight;
	}
		
	public String taste()		
	{
		return "No specific taste";
	}
	
	public boolean getFresh()
	{
		fresh=false;
		return fresh;
	}
}