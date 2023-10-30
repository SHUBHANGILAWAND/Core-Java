package CustomerInfo;

public class GrowableStack implements StackInterface {
	public static int size;
	private int top=-1;
	Customer[] fs=new Customer[stacksize];;
	Customer[] gs;
	
	public void push(Customer c){
		
		if(top<stacksize-1)
		{
			fs[++top]=c;
			
		}
		else
		{
			size=StackInterface.stacksize*2;
			gs=new Customer[size];
			for(int i=0;i<fs.length;i++)
			{
				gs[i]=fs[i];
				
			}
			fs=gs;
			gs[++top]=c;
		}
	}
	
	public Customer pop() {
		if(top==-1)
		{
			return null;
		}
		else
		{
			return gs[top--];
		}
	}

}
