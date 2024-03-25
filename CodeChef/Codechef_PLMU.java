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
		Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    for (int t=0;t<T;t++)
	    {
	        int n = s.nextInt();
	        List<Integer> a = new ArrayList<Integer>();
	        for (int i = 0;i<n;i++)
	        {
	            a.add(s.nextInt());
	        }
	        int b = Collections.frequency(a,2);
	        int b1 = Collections.frequency(a,0);
	        int a1 = (b-1)*b/2;
	        int a2 = (b1-1)*b1/2;
	        System.out.println(a1+a2);
	    }
    }
}
