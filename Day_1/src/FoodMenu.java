import java.util.Scanner;
class FoodMenu{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	boolean exit=false;
	int choice;
    float price=0,quantity;
	System.out.println("Welcome to our restaurant");
	while(!exit)
	{
		System.out.println("Select item from menu: 1.Dosa 2.Idli 3.Samosa 4.Dhokla 5.Uttapa 6.Generate Bill 7.Exit:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1: 
			System.out.println("Price of Dosa is Rs.100");
			System.out.println("Enter the quantity of Dosa:");
			quantity=sc.nextInt();
			price=price+quantity*100;
			break;
			
			case 2: 
			System.out.println("Price of Idli is Rs.60");
			System.out.println("Enter the quantity of Idli:");
			quantity=sc.nextInt();
			price=price+quantity*60;
			break;
			
			case 3: 
			System.out.println("Price of Samosa is Rs.40");
			System.out.println("Enter the quantity of Samosa:");
			quantity=sc.nextInt();
			price=price+quantity*40;
			break;
			
			case 4: 
			System.out.println("Price of Dhokla is Rs.50");
			System.out.println("Enter the quantity of Dhokla:");
			quantity=sc.nextInt();
			price=price+quantity*50;
			break;
			
			case 5: 
			System.out.println("Price of Uttapa is Rs.80");
			System.out.println("Enter the quantity of Uttapa:");
			quantity=sc.nextInt();
			price=price+quantity*80;
			break;
			
			case 6:
			System.out.println("Your bill amount is:" +price);
			break;
			
			case 7:
			exit=true;
			System.out.println("Thank you for visiting!!!");
			break;
			
			default:
			exit=true;
			System.out.println("Please enter valid choice");
			break;
			
		}
	}
	sc.close();
}
}