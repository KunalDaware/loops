//print n natural number using do while loops

import java.lang.*;
import java.util.Scanner;

class Natural
{
  public static void main(String [ ] args)
  {
     System.out.println("Enter your starting number");
     Scanner sc = new Scanner(System.in);
      
     int a = sc.nextInt();
     
    do{
           System.out.println(a);
           a++;
        }
        while(a<=45);
    
     System.out.println("This is your natural number");
  
   
   
  }


}