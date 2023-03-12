/*Sample output:
Enter the number: 
5

*********
 *******
  *****
   ***
    *
    *
   ***
  *****
 *******
*********
*/
//programming:
import java.util.*;

public class Example_2
{
	public static void main(String[] args) 
	{  
	   Scanner sc=new Scanner (System.in);
	    
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
        
        for(int i=n;i>0;i--)
		{
		    System.out.println();
		    for(int k=0;k<n-i;k++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<2*i-1;j++)
		    {
		        System.out.print("*");
		    }   
		}
		for (int i=1;i<=n;i++ )
	    {
	        System.out.println();
	        for(int k=n-i;k>0;k--)
	        {
	          System.out.print(" ");
	        }
	        for(int j=1;j<=i*2-1;j++)
	        {
	           System.out.print("*");
	        }     
	     }
	}
}

