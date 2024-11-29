interface One 
{
    public void m1();
}
interface Two 
{
    public void m2();
}
interface Three extends One, Two 
{
    public void m3();
}
class Child implements Three 
{
	public void m1()
    {
        System.out.println("interface one method");
    }
    public void m2()
    {
        System.out.println("interface Two  method");
    }
	public void m3()
    {
        System.out.println("interface Three method");
    }
}
class Multiple {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.m1();
        c.m2();
        c.m3();
    }
}
