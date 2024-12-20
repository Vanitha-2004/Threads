
public class EvenOdd extends Thread{
	public void run()
	{
		if(Thread.currentThread().getName().equals("even")) {
			even();
		}
		else 
		{
			odd();
		}

}
	public void even()
	{
	try {
		for(int i=1;i<=10;i++) {
			if(i%2==0)
			System.out.println(i+" is even");
			
		}
		Thread.sleep(2000);
	
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();

	}
		
			
	}
public void odd()
{
try {
	for(int i=1;i<=10;i++) {
		if(i%2==0)
		System.out.println(i+" is odd");
		
	}
	Thread.sleep(2000);

}
catch(InterruptedException e1)
{
	e1.printStackTrace();
}
}
}

	
