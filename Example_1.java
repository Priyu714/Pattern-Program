/*
Enter the number: 
5

*****
****
***
**
*
*
**
***
****
*****

*/
//programming:
import java.util.*;
public class Example_1
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner (System.in);
	    
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
	    for(int i=n;i>0;i--)
		{
		    System.out.println();
		    for(int j=i;j>0;j--)
		    {
		        System.out.print("*");
		    }
		    
        }	
        for(int i=1;i<=n;i++)
	    {
	       System.out.println();
	       for(int j=1;j<=i;j++)
	       {
	           System.out.print("*");
	       }
	    }    
		}
	}
