package com.app.fruits;
import java.util.Scanner;
public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		int count=0;
		System.out.println("Enter the size of Fruit Basket");
		Fruit[] f=new Fruit[sc.nextInt()];

		while(!exit)
		{
			System.out.println("Enter your choice:\n 1.Add Mango \n 2.Add Orange\n 3.Add Apple\n 4.Display name of all Fruits\n 5.Display name,color,weight & taste of all fruits\n 6.Mark fruit stale\n 7.Mark Sour fruits stale\n 8.Fruit Functionality\n 9. Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(count<f.length)
				{
					System.out.println("Enter the weight of mango to be added:");
					f[count++]=new Mango("Mango","Yellow",sc.nextDouble());
					System.out.println("Mango added to your basket!");
				}
				else
				{
					System.out.println("Basket is full!");
				}
				break;
			case 2:
				if(count<f.length)
				{
					System.out.println("Enter the weight of Orange to be added:");
					f[count++]=new Orange("Orange","orange",sc.nextDouble());
					System.out.println("Orange added to your basket!");
				}
				else
				{
					System.out.println("Basket is full!");
				}
				break;
				
			case 3:
				if(count<f.length)
				{
					System.out.println("Enter the weight of Apple to be added:");
					f[count++]=new Apple("Apple","Red",sc.nextDouble());
					System.out.println("Apple added to your basket!");
				}
				else
				{
					System.out.println("Basket is full!");
				}
				break;
			case 4:
				if(count<=f.length)
				{
					System.out.println("Name of fruit in basket:");
					for(Fruit f1:f)
					{
						System.out.println(f1.getName());
					}
				}
				break;
				
			case 5:
				if(count<=f.length)
				{
					for(Fruit f1:f)
					{
						System.out.println(f1.toString());
						System.out.println(f1.taste());
					}
				}
				break;
			case 6:
					System.out.println("Enter the index of fruit to mark it stale:");
					int index=sc.nextInt();
					if(index<f.length)
					{
						if(f[index].getFresh()==false)
							System.out.println(f[index].getName()+" at index " +index +" is marked stale");
					}
					else 
					{
						System.out.println("Enter valid index!!");
						
					}
				break;
			case 7:
				if(count<=f.length)
				{
					
					for(int i=0;i<f.length;i++)
					{
						if(f[i].taste().equals("Sour"))
						{
							f[i].getFresh();
							System.out.println(f[i].getName() +" at index " +i +" is stale");
						}
					}
					
				}
				break;
			case 8:
				System.out.println("Enter the index of fruit to mark it stale:");
				int index1=sc.nextInt();
				if(index1<f.length)
				{
					if(f[index1].getName()=="Mango")
					{
						((Mango) f[index1]).pulp();
					}
					else if(f[index1].getName()=="Orange")
					{
						((Orange) f[index1]).juice();
					}
					else if(f[index1].getName()=="Apple")
					{
						((Apple) f[index1]).jam();
					}
				}
				else 
				{
					System.out.println("Enter valid index!!");
					
				}
				break;
			case 9:
				exit=true;
				break;
			}
		}
	}

}
