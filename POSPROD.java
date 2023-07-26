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
		while(t>0){
		    int n = sc.nextInt();
		    long count1 = 0;
		    long count2 = 0;
		    long []arr = new long[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextLong();
		        if(arr[i]<0)
		            count1++;
		        if(arr[i]>0)
		            count2++;
		    }
		 
		    long ans = ((count1*(count1-1))/2) + ((count2*(count2-1))/2);
		    System.out.println(ans);
		    t--;
		}
	}
}
