import java.util.InputMismatchException;
import java.util.Scanner;
class operation1 implements Runnable {
	public void run()
	{
		if(Thread.currentThread().getName().equals("add")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("print")) {
			print();
		}
		else 
		{
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
		System.out.println("Task 1:Addition operation completed");
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
}

public class RunnableInterface {

	public static void main(String[] args) throws InterruptedException {
		 operation1 op1=new operation1();
		 operation1 op2=new operation1();
         operation1 op3=new operation1();
         
         Thread t1=new Thread(op1);
         Thread t2=new Thread(op2);
         Thread t3=new Thread(op3);
         		 
		 t1.setName("add");
		 t2.setName("print");
		 t3.setName("Bank");
		 
		 t1.start();
		 t2.start();
		 t3.start();
	}
}

