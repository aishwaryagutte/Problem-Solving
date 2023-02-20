import java.util.*;
import java.io.*;

class oddCountArray {
    
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

        int arr[] = new int[9];
        int res = 0;
        for(int i=0;i<9;i++)
        {
        	arr[i] = sc.nextInt();
        	res = res ^ arr[i];
        }
        System.out.println(res);
    }
}