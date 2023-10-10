package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String m_name,String m_color,double m_weight)
	{
		super(m_name,m_color,m_weight);
	}
	
	@Override
	public String toString() 
	{
		return "Name=" + super.getName() + ", Color=" + super.getColor() + ", Weight=" + super.getWeight();
	}
	
	@Override
	public String taste()
	{
		return "Sweet";
	}
	
	public void pulp()
	{
		System.out.println("Name: " +super.getName() +" Color: " +super.getColor() +" Creating pulp!");
	}
}
