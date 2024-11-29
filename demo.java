class Demo
{
	Demo()
	{
		System.out,println("0 arguments");
	}
	Demo(int x)
	{
		this()
		System.out.println("1 argument");
	}
	Demo(int x,int y)
	{
		this(10)
		System.out.println("2 arguments");
	}
	Demo(int x,int y,int z)
	{
		this(1,2)
		System.out.println("3 arguments");
	}
	public static void main(String[] args)
	{
		System.out.println("main");
	}
	new Demo(10,20,30)
}

		
		