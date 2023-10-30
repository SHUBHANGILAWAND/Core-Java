import java.util.Scanner;

class TestPoint{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		int x1,y1;
		boolean flag;
		System.out.println("Enter two co-ordinates for point 1:");
		x=sc.nextInt();
		y=sc.nextInt();
		Point2D p1=new Point2D(x,y);
		System.out.println("Enter two co-ordinates for point 2:");
		x1=sc.nextInt();
		y1=sc.nextInt();
		Point2D p2=new Point2D(x1,y1);
		
		System.out.println(p1.show());
		System.out.println(p2.show());
		flag=p1.isEqual(p2);
		if(flag)
		{
			System.out.println("Both points are same");
		}
		else
		{
			System.out.println("Both points are Diffrent ");
			System.out.println("Distance between 2 points is:" +p1.getDistance(p2));
		}
	}
}