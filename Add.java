
package pack1;
public class Test 
{
static int a=10,b=20;
public static void add()
{
System.out.println(a+b);
}
}
package pack2;
import Pack1.Test;
public class Add{
public static void main(String[] args) {
Test ob = new Test();
ob.add();
}
}