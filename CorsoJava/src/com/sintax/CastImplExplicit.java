package com.sintax;

public class CastImplExplicit {
	
	public static void main(String[] args) {


        //CAST IMPLICITO


        int a = 5;
        float b = a;
        System.out.println(b);
        
        int ese1 = 10;
        double ese2 = ese1;
        System.out.println(ese2);


        //CAST EXPLICIT

        double d1 = 100;
        float f2 = (float) d1;
        
      
       
        System.out.println(f2);

       float ese3 = 5;
       int ese4 = (int) ese3;
       System.out.println(ese4);  
       
       int e = 2;
       int f = 4;
       int c = 6;
       int d = 8;
       if(e>f) {
    	   System.out.println("vero");
    	 }   	   
       else {
    		   System.out.println("falso");
    	   }
      if (e != f && c != d) {
    	  System.out.println("vero");
      }
      else  {
    	  System.out.println("falso");
      }
      if (e >= f || c >= d) {
    	  System.out.println("vero");
      }
      else  {
    	  System.out.println("falso");
      }
    }

}
