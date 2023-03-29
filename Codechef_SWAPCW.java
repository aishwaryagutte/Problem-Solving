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
		    String s = sc.next();
		    char ch[] = s.toCharArray();
		    int k=n-1;
		    for(int j=0;j<n;j++){
		        if((int)(ch[j]) < (int)(ch[k])){
		            char tmp=ch[k];
		            ch[k]=ch[j];
		            ch[j]=tmp;
		        }
		        k--;
		    }
		    int flag=0;
		    for(int j=0;j<n-1;j++){
		        if ((int)ch[j] > (int)ch[j+1]) {
                       flag=1;
                }
		    }
		    
		    if(flag==1)
                System.out.println("NO");
            else
                System.out.println("YES");
		}
	}
}
