import java.util.Scanner;
class Calculator{
	public static void main(String[] ss){
Scanner sc= new Scanner(System.in);
boolean exit=false;
 int choice;
  System.out.println("Enter two no");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
 while(!exit)
 {
   
	System.out.println("Enter operation to perform 1:add 2:substraction 3:multiplication 4:division 5:exit");
	choice=sc.nextInt();
	switch(choice)
		{
		case 1:System.out.println("Addition of two no :"+ (num1+num2));
		break;
		case 2:System.out.println("Substraction of two no :"+ (num1-num2));
		break;
		case 3:System.out.println("Multiplication of two no :"+ (num1*num2));
		break;
		case 4:System.out.println("Division of two no :"+ (num1/num2));
		break;
		case 5:exit=true;
		break;
		}
	}
	sc.close();
 
 
 }
}






