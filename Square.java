/*
Enter the number: 
5

*****
*****
*****
*****
*****
*/

import java.util.*;

public class Square
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner (System.in);
	    
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		for(int i=0; i<num;i++)
		{
		    System.out.println();
		    for(int j=0;j<num;j++)
		    {
		        System.out.print("*");
		    }
		}
	}
}