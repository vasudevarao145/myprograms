class Vasu 
{
 int v=10;
 static int y=20;
 static 
 {
    System.out.println("static biock 1");
 }
 
 {
    System.out.println("instacne  biock 1");
 }

int Member(int b){
    System.out.println("value of vasu : " +b);
    return b;
}
// starting inner class
	class Inner
	{
    int i=89;
	
	 
	{
    System.out.println("inner instnce biock 1");
	}
	
	int member1(int w){
    System.out.println("value of member1 : " +w);
    return w;
	}
	
	Inner(String s){
    System.out.println("value of string : " +s);
	}
		
	}
	//inner close
	
static int jessy(int c){
    System.out.println("value of jessy : " +c);
	return c;
}
Vasu(char ch){
    System.out.println("value of ch " +ch);
}
public static void main(String[] args)
{
  //  System.out.println("outer main method");
    //System.out.println("static biock 1");
    Vasu t=new Vasu('c');
  //  Inner.t=new Inner();
   Vasu.Inner t2=new Vasu('b').new Inner("Bunny");
   t.Member(90);
   t2.member1(7);
}
}