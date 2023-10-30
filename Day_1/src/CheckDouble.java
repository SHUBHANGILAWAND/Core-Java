import java.util.Scanner;
class CheckDouble{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	double sum=0;
	int count=1;
	System.out.println("Enter two numbers:");
	while(count<=2)
	{
		if(sc.hasNextDouble())
		{
			sum=sum+sc.nextDouble();
		}
		else
		{
			System.out.println("Entered numbers are not double");
			break;
		}
		count++;
	}
	if(count>2)
	{
		System.out.println("The Average is:" +(sum/2));
	}
	sc.close();
}
}