class Vasu  
{ 
     public void m1() 
	{
        System.out.println(" parentclass ");
    }
}
class Two extends Vasu  
{ 
    public void m2() 
	{
        System.out.println("Child class one");
    }
}
class Three extends Two 
{
    public void m3() 
	{
        System.out.println("Child class two ");
    }
}

class Inherit
{
    public static void main(String[] args) 
	{       
        Three t = new Three();
        t.m1();
        t.m2();
        t.m3();
    }
}