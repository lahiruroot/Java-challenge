//Pull req by Sahansa Jayawardhana @seasonsixty instagram  
  
package com.example.myworld;
    
    //Importing Scanner library files
    import java.util.Scanner;
    
    public class main
    {
            public static void main(String[]args) {
    
                    Scanner input =new Scanner(System.in);
    
                    System.out.println("Enter radius value : ");
                    double rad =input.nextDouble();
    	
			  //EnCap class object Creation
                    EncapData objED =new EncapData();
    
                    objED.SetRad(rad);
    
                    System.out.println("Area is "+objED.getArea());
                    System.out.println("Circumference is "+objED.getCircum());
    
    
                    }
           }
    
     public class EncapData {
 
        private double radius;
         private double pi=3.14;
 

	     //non-return-type-with-parameter 
           public void SetRad(double x) {
                   radius =x;
 
           }

	     //return-type-noparameter 
           public double getArea(){
 
                 return pi*radius*radius;
 
                 }
 

            public double getCircum(){
 
                   return 2*pi*radius;
 
                 }
         }
