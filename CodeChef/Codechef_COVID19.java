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
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j] =  sc.nextInt();
		    }
		    int max=1,min=100,cnt=1;
		    for(int j=0;j<n-1;j++){
		        if(arr[j+1]-arr[j] <=2){
		            cnt++;
		        }
		        if(arr[j+1]-arr[j] > 2){
		            if(cnt>max)
		                max = cnt;
		            if(cnt<min)
		                min=cnt;
		            cnt = 1;
		        }
		    }
		    if(cnt>max)
		          max = cnt;
		    if(cnt<min)
		          min=cnt;
		    System.out.print(min+" "+max);
		    System.out.println();
		}
		
	}
}
