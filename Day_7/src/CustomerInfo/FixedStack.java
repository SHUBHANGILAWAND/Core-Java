package CustomerInfo;

public class FixedStack implements StackInterface{

	private int top;
	private Customer[] customers;
	
	public FixedStack()
	{
		top=-1;
		customers = new Customer[stacksize];
	}
	
	public void push(Customer c)
	{		
		if(top==stacksize-1)
		{
			System.out.println("Stack full!!");
		}
		else
		{
			customers[++top]=c;
		}
	}
	
	public Customer pop()
	{
		if(top<0)
		{
			return null;
		}
		else
		{
			return customers[top--];
		}
	}
}
