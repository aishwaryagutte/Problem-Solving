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
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		      if(A %2 == 0) {
		        if(B-A >= 2) {
		            System.out.println( A+ " " + (A+2));
		        } else{
		            System.out.println(-1);
		        }
		    }
		    else{
		        if(B-A>=3) {
		            if(A%3 == 0) {
		                System.out.println( A+ " " + (A+3));
		            }else{
		                System.out.println( A+1+ " " + (A+3));
		            }
		        }else{
		            System.out.println(-1);
		        }
		    }
		    t--;
		    
		}
		
	}
}
