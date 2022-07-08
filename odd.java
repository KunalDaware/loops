//print n odd number using for loop
/*
Alogrithm
to find odd number
 2i = Even number= 0,2,4,6,8
 2i+1 = Odd number = 1,3,5,7
*/

import java.lang.*;
import java.util.Scanner;

public class Odd
{
  public static void main(String [ ] args )
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number");
    int n = sc.nextInt();

    int iCnt = 0;
   for( iCnt = 0; iCnt<n; iCnt++)
        {
      	System.out.println(2*iCnt+1);
        }

     System.out.println("Your odd number till  " + n);



  }













}