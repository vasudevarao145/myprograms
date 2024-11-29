class Display
{
	String name;
	public static synchronized void wish(String name)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("vasu deva rao");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e.toString());	
			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class Sync
{
	public static void main(String[] args)
	{
		Display d1=new Display();
		Display d2=new Display();
	    MyThread t1= new MyThread(d1,"deva");
		MyThread t2=new MyThread(d2,"kumar");
		t1.start();
		t2.start();
	}
}
		
			