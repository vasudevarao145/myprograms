class Quadratic { 
    public static  void main(String[] args)  
    { 
        int a=1,b=2,c=1,d; 
        double r1,r2; 
        d=(b*b)-(4*a*c); 
        if(d==0){ 
            System.out.println("roots are real and equal"); 
            r1=-b/(2*a); 
            System.out.println("root="+r1);} 
        else if(d>0){ 
            System.out.println("roots are real"); 
            r1=(-b+Math.sqrt(d))/ (2*a); 
            r2=(-b-Math.sqrt(d))/ (2*a); 
            System.out.println("root1="+r1+"root2="+r2);} 
        else 
            System.out.println("roots are imaginary");       
         
    } 
} 
        