/*
* Jarrett Andrulis Lab 12
* Version 11/15/16
* Concurrency Lab
* CS 18000 - B09
 */
public class Divider implements Runnable {
	Counter counter;
	int start;
	int end;
	
	public Divider(Counter counter, int start, int end)
	{
		this.counter = counter;
		this.start = start;
		this.end = end;
	}
	
	public void run()
	{
		for(int i = start; i <= end; i++)
		{
			if(i%7 == 0)
				counter.inc();
		}
	}

	public static void main(String[] args)
	{
		Counter counter = new Counter1();
		Thread t1 = new Thread(new Divider(counter,1,1000));
		Thread t2 = new Thread(new Divider(counter,1001,2000));
		Thread t3 = new Thread(new Divider(counter,2001,3000));
		t1.start();
		t2.start();
		t3.start();
		try{
			t1.join();
			t2.join();
			t3.join();
		} catch(InterruptedException e)
		{
			System.out.println("Big Problem");
		}

		System.out.println(counter.get());
	}

}
