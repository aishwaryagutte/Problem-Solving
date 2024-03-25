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
		for (int i=0;i<t ;i++ ){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int sum = a+b;
		    int ans = 0;
		    while(sum>0){
		        int tmp = sum%10;
		        if(tmp==0)
		            ans+=6;
		        if(tmp==1)
		            ans+=2;
		        if(tmp==2)
		            ans+=5;
		        if(tmp==3)
		            ans+=5;
		        if(tmp==4)
		            ans+=4;
		        if(tmp==5)
		            ans+=5;
		        if(tmp==6)
		            ans+=6;
		        if(tmp==7)
		            ans+=3;
                if(tmp==8)
		            ans+=7;
		        if(tmp==9)
		            ans+=6;
		        sum = sum/10;
		    }
		    System.out.println(ans);
		} 
	}
}
