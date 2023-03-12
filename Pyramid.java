/*sample Output:
Enter the Number :
5
    *
   ***
  *****
 *******
*********
*/

import java.util.*;

public class Pyramid
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number :");
	    int num=sc.nextInt();
	    for (int i=1;i<=num;i++ )
	    {
	        for(int k=num-i;k>0;k--)
	        {
	          System.out.print(" ");
	        }
	        for(int j=1;j<=i*2-1;j++)
	        {
	           System.out.print("*");
	        }  
	        System.out.println();
	     }
	}
}
