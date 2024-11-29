interface Vasu{
  int isro(int a);
  int nasa(int ch);
  String spaceX(String s);
  float chandrayan(float f);
  }
  interface Suresh{
  String analog(String g);
  char astro(char c);
  }
class Pawan implements Vasu,Suresh{
 String t1= "thala for a reason";
 public int isro(int a){
 System.out.println("No of missions implemented by isro :"+a);
 return a;
 }
 public int nasa(int ch){
 System.out.println("No of missions implemented by Nasa :"+ch);
 return ch;
 }
 public String spaceX(String s){
 System.out.println("latest electric car name :"+s);
 return s;
 }
 public float chandrayan(float f){
 System.out.println("Avg speed of vikram Roller :"+f);
 return f;
 }
 public String analog(String g){
 System.out.println("mention place of analog mission :"+g);
 return g;
 }
 public char astro(char c){
 System.out.println("name start from astro : "+c);
 return c;
 }
 }
 abstract class Thiru extends Pawan {
 public static void main(String[] args){
 Thiru t=new Thiru();
 t.isro(77);
 t.nasa(103);
 t.spaceX("telidu");
 t.chandrayan(55558.12f);
 t.astro('a');
 t.analog("ladakh");
 System.out.println(" : "+t.t1);
 }
 }
 