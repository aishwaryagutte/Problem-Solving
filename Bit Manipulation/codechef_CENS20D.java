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
		    if(n<2)
		        System.out.println(0);
		    else{
		        int cnt=0;
		        for(int k=0;k<n-1;k++){
		            for(int j=k+1;j<n;j++){
		                if((arr[k] & arr[j] ) == arr[k])
		                    cnt++;
		            }
		        }
		        System.out.println(cnt);
		    }
		}
	}
}
