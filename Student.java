class Student{   
   int rollno;    
   String name;   
   static String college ="REC"; 
   
   static void change(){   
      college = "RIT";   
   }   
    
   Student(int r, String n){   
   rollno = r;   
   name = n;   
   }   
    
   void display (){ 
    System.out.println(rollno+" "+name+" "+college); 
    }  
}
