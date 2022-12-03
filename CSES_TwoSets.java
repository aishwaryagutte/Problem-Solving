import java.util.*;
import java.io.*;

class TwoSets {
    
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

        int n =  sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
        	sum = sum + i;
        }

        if(sum % 2 ==0)
        	System.out.println("YES");
        else
        	System.out.println("NO");
    }
}