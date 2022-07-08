// write a program to print multiplication table of 10 in reverse order

import java.io.*;
import java.util.Scanner;

public class Table
{
  public static void main( String arg[ ])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER UR TABLE");   
  
     int n = sc.nextInt();
     
      for(int i=10; i>=1; i--)
        {
           System.out.printf("%d X %d = %d\n",n , i, n*i );
    
        }
  
  }





}

