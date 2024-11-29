class Constructor
{
	
  Constructor() 
  {	  
	  System.out.println("0 arg constructor");
  }
  Constructor(int x)
  {	 
	  System.out.println("1 arg constructor"+x);
  }
  Constructor(int s,int y)
  { 
	  System.out.println("2 arg constructor"+(s+y));
  }
 Constructor(int a,int b,int c)
  { 
	  System.out.println("3 arg constructor"+(a*c));
  }
  public static void main (String[] args)
  {     new constructor();
		new Constructor(25);
		new Constructor(111,333);
		new Constructor(11,22,222);

				
   }
}

