class Strchar 
{
  public static void main(String[] args) 
  {
    String myStr = "Hello";
    char r = myStr.charAt(0);
    System.out.println(r);
	
	String sobj = new String("Hello");
	System.out.println(sobj.charAt(0));
	
	char[] ch={'H','e','l','l','0'}; 		
	String sobja = new String(ch);
	System.out.println(sobja.charAt(4));
	
	StringBuffer sbf = new StringBuffer("hello");
	System.out.println(sbf.charAt(3));
	
	StringBuilder sbi = new StringBuilder("hello");
    System.out.println(sbi.charAt(3));		
  }
}