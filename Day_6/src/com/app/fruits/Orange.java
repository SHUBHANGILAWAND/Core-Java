package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String o_name,String o_color,double o_weight)
	{
		super(o_name,o_color,o_weight);
	}
	
	@Override
	public String toString() 
	{
		return "Name=" + super.getName() + ", Color=" + super.getColor() + ", Weight=" + super.getWeight();
	}
	
	@Override
	public String taste()
	{
		return "Sour";
	}
	
	public void juice()
	{
		System.out.println(" Name: " +super.getName() +" Weight: " +super.getWeight() +" Extracting Juice!");
	}
	
}
