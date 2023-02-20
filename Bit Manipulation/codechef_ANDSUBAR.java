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
		    if(n==1 || n==2)
		        System.out.println(1);
		    else{
		        if(n==3|| n==4)
		            System.out.println(2);
		        else{
		                for(int j=2;j<n;j++)
		                {
		                    int res = 0;
		                    if(n<(1<<j)){
		                        res = n-(1<<(j-1))+1;
		                        if(res > ((1<<j-1)-(1<<j-2))){
		                            System.out.println(res);
		                            break;
		                        }
		                        else{
		                            System.out.println((1<<j-1)-(1<<j-2));
		                            break;
		                        }
		                    }
		                }
		            }
		        }
		   }
	}
}
