//using for loop print any Multiplication table by taking input from user


import java.lang.*;
import java.util.Scanner;

class Multi
{
  public static void main(String [ ] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    
    int i = 1;
  
     for( i=1; i<=10; i++)
         {
         System.out.printf(" %d  X  %d = %d\n", n , i, n*i);
        }
          System.out.println("This is a table : " + n); 
  }




}