package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String a_name,String a_color,double a_weight)
	{
		super(a_name,a_color,a_weight);
	}
	
	@Override
	public String toString() 
	{
		return "Name=" + super.getName() + ", Color=" + super.getColor() + ", Weight=" + super.getWeight();
	}
	
	@Override
	public String taste()
	{
		return "Sweet and Sour";
	}
	

	public void jam()
	{
		System.out.println(" Name: " +super.getName() +" Making Jam!");
	}
	
}
