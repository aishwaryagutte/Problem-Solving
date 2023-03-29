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
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    long n=sc.nextLong();
		    long res=3;
		    
		    if(n%4==2 || n%4==3)
		        System.out.println(3);
		    if(n%4==0){
		        res=res^n;
		        System.out.println(res);
		    }
		    if(n%4==1){
		        res=res^(n-1);
		        res=res&n;
		        System.out.println(res);
		    }
		}
	}
}
