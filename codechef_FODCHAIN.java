/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int e = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int ans = 1;
		    int div = e/k;
		   
		    while(div != 0)
		    {
		        ans++;
		        div = div / k;
		    }
		     System.out.println(ans);
		}
	}
}
