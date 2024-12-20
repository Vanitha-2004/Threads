import java.util.InputMismatchException;
import java.util.Scanner;
class operations extends Thread {
	public void run()
	{
		if(Thread.currentThread().getName().equals("Add")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("print")) {
			print();
		}
		else {
			Bank();
		}
			
	}
	Scanner sc=new Scanner(System.in);
public void add() {
	try {
		System.out.println("Task 1:Addition operation Started");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result is:"+res);
		System.out.println("Task 1:Addition Operation completed");
	}
	catch(ArithmeticException e1)
	{
		e1.printStackTrace();
	}
}
public void print()
{
	try {
		System.out.println("Task 2:printing operation started");
		for(int i=0;i<5;i++)
		{
			System.out.println("GTEC JAINx BAnGALORE");
			Thread.sleep(2000);
		}
		System.out.println("Task 2:printing operation completed");
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}
public void Bank() {
	try {
		System.out.println("Task 3:Banking operation started");
		System.out.println("Enter the account number:");
		int acc=sc.nextInt();
		System.out.println("Enter the pin code:");
		int pin=sc.nextInt();
		System.out.println("Account details recorded");
		System.out.println("task 3:Banking operation completed");
	}
	catch(ArithmeticException e1)
	{
		e1.printStackTrace();
	}
	catch(InputMismatchException e)
	{
		e.printStackTrace();
	}

}
public class MultiThreadedProgram {
	public static void main(String[] args) throws InterruptedException {
		 operations op1=new operations();
		 operations op2=new operations();
         operations op3=new operations();
		 
		 op1.setName("Add");
		 op2.setName("Print");
		 op3.setName("Bank");
		 
		 op1.start();
		 op2.start();
		 op3.start();
	}
}
}


