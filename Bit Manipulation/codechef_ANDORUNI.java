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
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j] = sc.nextInt();
		    }
		    long ans = 0; 
		    int cnt = 0;
		    for(int j=0;j<32;j++){
		      for(int k=0;k<n;k++){
		           if((arr[k] & (1<<j)) != 0)
		              cnt++;
		           if(cnt==2)
		              break;
		      }
		      if(cnt==2)
		        ans = ans | (1<<j);
		      cnt=0;
		    }
		        System.out.println(ans);
		}
	}
}
