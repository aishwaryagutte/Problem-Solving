import java.util.*;
import java.io.*;
class IncreasingArray {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
  
        if (System.getProperty("ONLINE_JUDGE") == null) {
            
            try {
                System.setOut(new PrintStream(
                    new FileOutputStream("output.txt")));
                sc = new Scanner(new File("input.txt"));
            }
  
            catch (Exception e) {
            }
        }

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        	arr[i] = sc.nextInt();
        int res = 0;
        int tmp = 0;
        for(int i=0;i<n-1;i++)
        {
        	if(arr[i] - arr[i+1] >=0)
        	{
        		res = arr[i] - arr[i+1] + 1;
        		if(res>tmp)
        			tmp = res ;
        	}
        	res=0;

        }
        System.out.println(tmp);
    }
}