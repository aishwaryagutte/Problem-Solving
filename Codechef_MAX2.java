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
		int t,i,j,k,l,n;
		Scanner sc = new Scanner(System.in);

		    n = sc.nextInt();
		    char []ar = sc.next().toCharArray();
		    j = 0;
		    for(i = n-1; i>-1; i--){
		        if(ar[i] == '1')
		            break;
		        j++;
		    }
		    System.out.println(j);
	}
}
