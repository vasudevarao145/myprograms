class Strdec
{
	public static void main(String[] args)
	{
		String s = "Hello"; 
		String sobj1 = new String("Hello");
		char[] ch={'v','a','s','u','d','e','v','a','r','a','o'}; 		
		String sobj2 = new String(ch);
		StringBuffer sbf = new StringBuffer("barath");
		StringBuilder sbi = new StringBuilder("bunny");	 
		 
		System.out.println(s+" "+sobj1);
		System.out.println(sobj1);
		System.out.println(sobj2);
		System.out.println(sbf+sobj1);
		System.out.println(sbi);
		
	}
}
)