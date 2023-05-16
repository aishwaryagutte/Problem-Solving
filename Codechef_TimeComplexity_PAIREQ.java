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
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j] = sc.nextInt();
		    }
		    
		    HashMap<Integer, Integer> numbers = new HashMap<>();
		    for(int tmp:arr){
		        if(numbers.containsKey(tmp))
		            numbers.put(tmp,(numbers.get(tmp))+1);
		        else  
		            numbers.put(tmp,1);

		    }
		    int maxFreq=0,number=-1;
		    Set<Integer> keySet = numbers.keySet();
            for(Integer k:keySet)
            {
                if(numbers.get(k) > maxFreq){
                    number = k;
                    maxFreq = numbers.get(k);
                }
            }
		    System.out.println(n-maxFreq);
		}
	}
}

