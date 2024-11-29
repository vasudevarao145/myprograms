class Except
{
	public static void main(String[] args)
	{
		int a[]=new int[10];
		try
		{
			System.out.println("deny access");
			System.out.println(a[10]);
		}
		catch(Exception e){
			System.out.println("index out of bondary");
		}
		
		{
			System.out.println("exceptiin occur"+e);
		}
	}
}
			
			
			