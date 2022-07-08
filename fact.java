//to find factorial using for loop

import java.io.*;
import java.util.Scanner;

class Fact
{
  public static void main(String arg [ ])
  {
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
 
   int factorial = 1;
   for(int i =1; i<=a;i++)
      {
           factorial *= i; 
     } 
      System.out.println(factorial);
  
  }




}