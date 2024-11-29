class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("vasu");
		}
	}
}
class Demos
	{
		public static void main(String[] args)
		{
			for(int g=0;g<= 10;g++)
			{
				System.out.println("dheva");
				
			}
			Mythread t=new Mythread();
			Thread t1=new Thread();
			t.start();
			
		}
	}

			