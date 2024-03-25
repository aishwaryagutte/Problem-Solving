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
		    int m = sc.nextInt();
		    
		    System.out.println(GCD(m,n));
		    t--;
		}
	}
	public static int GCD(int a, int b){
	 
	   if(a%b==0)
	        return b;
	   return GCD(b, a%b);
	   
	}
}
