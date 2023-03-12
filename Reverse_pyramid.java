/*sample output:
Enter the number: 
5

*********
 *******
  *****
   ***
    *
*/
//Programming:
import java.util.*;

public class Reverse_pyramid
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
	}
}
