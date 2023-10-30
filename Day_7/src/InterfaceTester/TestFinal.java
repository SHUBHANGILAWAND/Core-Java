package InterfaceTester;

import java.util.Scanner;

import CustomerInfo.*;

public class TestFinal {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			StackInterface iStack = null;
			boolean chosenStack=false;
			boolean exit=false;
			int choice=0;
			int menu=0;
						//Customer c1[] = new Customer[StackInterface.stacksize*2];
			
			while(!exit)
			{
				if(chosenStack)
				{
					System.out.println("Menu");
					System.out.println("3.Push");
					System.out.println("4.Pop");
					System.out.println("5.Exit");
					menu=sc.nextInt();
					switch(menu)
					{
					case 3: 
						System.out.println("Pushing the elements into stack");
						//Customer c[] = new Customer[StackInterface.stacksize];
						System.out.println("Enter Customer details");
						if(iStack instanceof FixedStack)
						{
							Customer c[] = new Customer[StackInterface.stacksize];
							for(int i=0;i<c.length;i++)
							{
								c[i]=new Customer(sc.nextInt(),sc.next(),sc.next());
								iStack.push(c[i]);
							}
						}
						else if(iStack instanceof GrowableStack)
						{
							Customer c[] = new Customer[StackInterface.stacksize*2];

							for(int i=0;i<=c.length-1;i++)
							{
								c[i]=new Customer(sc.nextInt(),sc.next(),sc.next());
								iStack.push(c[i]);
							}
						}
						break;
						
					case 4:
						System.out.println("Popping from the stack!!");
						if(iStack instanceof FixedStack)
						{
							Customer c[] = new Customer[StackInterface.stacksize];
							for(int i=0;i<c.length;i++)
							{
								c[i]=iStack.pop();
								System.out.println(c[i]);
							}
						}
						else if(iStack instanceof GrowableStack)
						{
							Customer c[] = new Customer[StackInterface.stacksize*2];
							for(int i=0;i<c.length;i++)
							{
								c[i]=iStack.pop();
								System.out.println(c[i]);
							}
						}
						break;
						
					case 5:
						exit=true;
						System.out.println("Exiting!!!");
						break;
						
					default:
						exit=true;
						break;
					}
				}
				else
				{
					System.out.println("Choose the Stack");
					System.out.println("1. Fixed Stack");
					System.out.println("2.Growable Stack");
					choice=sc.nextInt();
					chosenStack=true;

					if(choice==1)
					{
						iStack=new FixedStack();
					}
					else if(choice==2)
					{
						iStack=new GrowableStack();
					}
				}
				
			}
		}
	}

}
