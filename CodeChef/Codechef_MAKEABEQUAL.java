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
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    long arr1[] = new long[n];
		    long arr2[] = new long[n];
		    
		    for(int j=0;j<n;j++){
		        arr1[j] = sc.nextLong();
		    }
		    for(int j=0;j<n;j++){
		        arr2[j] = sc.nextLong();
		    }
		 
		    long cnt=0,sum=0;
		    for(int j=0;j<n;j++){
		        cnt+=(arr1[j]-arr2[j]);
		        sum+=Math.abs(arr1[j]-arr2[j]);
		    }
		    
		    if(cnt==0)
		        System.out.println(sum/2);
		    else
		        System.out.println(-1);
		}
	}
}
