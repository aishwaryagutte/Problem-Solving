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
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    String s = sc.next();
		    String res = "";
		    
		    int flag=0,z=n-1;
		    for(int j=0;j<n/2;j++){
		       
		      if(s.charAt(j)=='0')
		          res=s.charAt(j)+res;
		      else
		          res+=s.charAt(j);
		          
		      if(s.charAt(z)=='1'){
		          res=s.charAt(z)+res;
		          z--;
		      }
		      else{
		          res+=s.charAt(z);
		          z--;
		      }
		    }
		    if(n%2!=0){
		          
		      if(s.charAt(n/2)=='0')
		          res=s.charAt(n/2)+res;
		      else
		          res+=s.charAt(n/2);
		          
		    }
		    System.out.println(res);
		}
	}
}
