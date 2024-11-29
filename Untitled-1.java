import java.util.*;
class Binary { 
    public static  void main(String[] args)  
    { 
        Scanner s = new Scanner(System.in); 
        int a[]; 
        a=new int[20]; 
        System.out.println("enter array size"); 
        int n=s.nextInt(); 
        System.out.println("enter elements into array"); 
        for(int i=0;i<n;i++) 
          a[i]=s.nextInt(); 
        System.out.println("enter value to be search"); 
        int key=s.nextInt(); 
        int low=0,high=n-1; 
        while(low<=high) 
        { 
            int mid=(low+high)/2; 
            if(key==a[mid]) 
            { 
                System.out.println(key+"found at positon"+(mid+1)); 
                break; 
            } 
            else if(key>a[mid]) 
                  low=mid+1; 
            else 
                high=mid-1; 
        } 
   if (low > high)
       System.out.println("not found"+key); 
    } 
} 
