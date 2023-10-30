package Tester;

import data.Point2D;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0,n,m;
		boolean exit=false;
		System.out.println("Enter the number of points to plot:");
		Point2D[] points = new Point2D[sc.nextInt()];
		
		while(!exit)
		{
		System.out.println("Enter your choice: 1. Plot a point 2.Display points 3.Check 4.Exit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the index to plot a point:");
			int i=sc.nextInt();
			if(i>=0 && i<points.length)
			{
				if(points[i]==null)
				{
					System.out.println("Enter the co-ordinates for plotting a point:");
					int x=sc.nextInt();
					int y=sc.nextInt();
					points[i]=new Point2D(x,y); 
				}
				else
				{
					System.out.println("Point is already plotted at this index!!");
				}
			}
			else
			{
				System.out.println("Enter valid index!!");
			}
			break;
		case 2:
			for(Point2D p : points)
			{
				System.out.println(p.show());
			}
			break;
		case 3:
			System.out.println("Enter the indices of point for checking:");
			n=sc.nextInt();
			m=sc.nextInt();
			if(n<=points.length && m<=points.length)
			{
				if(points[n].isEqual(points[m]))
				{
					System.out.println("The points are same!");
				}
				else
				{
					System.out.println("The points are different!");
					System.out.println("Distance between 2 points is:" +points[n].getDistance(points[m]));
	
				}
			}
			else
			{
				System.out.println("Please enter valid indices!");
		    }
			break;
		case 4:	
			exit=true;
			System.out.println("Exit!!!");
			break;
			
		default:
			exit=true;
			System.out.println("Enter valid input!");
			break;
			
		}
		}
	}

}
