/*
Enter the number: 
5
*****
****
***
**
*


*/
import java.util.*;
public class Triangle_left2
{
    public static void main(String[] args) 
	{  
	    Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
		    for(int j=i;j>0;j--)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
        }	
	}
}