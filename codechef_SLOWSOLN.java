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
		    int maxT = sc.nextInt();
		    int maxN = sc.nextInt();
		    int sumN = sc.nextInt();
		    
		    int ans=0, j=0, sum=0;
		    
		    while(j<maxT){
		        sum = sum + maxN;
		        if(sum<=sumN)
		            ans = ans + (maxN*maxN);
		        else
		            break;
		        j++;
		    }
		    if(sum-sumN==0)
		        System.out.println(ans);
		    else{
		        if(j<maxT)
		        {
		        sum = sum - maxN;
		        ans = ans +(sumN-sum) * (sumN-sum) ;
		        System.out.println(ans);
		        }
		        else
		              System.out.println(ans);
		    }
		    
		    
		}
	}
}
