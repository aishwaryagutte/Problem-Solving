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
		    String s = sc.next();
		    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		    char[] arr = s.toCharArray();
		    int len = s.length();
		    if(s.length()%2 != 0){
		        System.out.println("NO");
		    }
		    else{
		        for(char c: arr){
		            if(map.containsKey(c)){
		                map.put(c,map.get(c)+1);
		            }
		            else{
		                map.put(c,1);
		            }
		        }
		        int flag=0;
		        for(Map.Entry entry : map.entrySet())
		        {
		            if((int)(entry.getValue()) == s.length() / 2)
		            {
		                flag=1;
		                break;
		            }
		        }
		        if(flag==1)
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		    }
		}
	}
}
