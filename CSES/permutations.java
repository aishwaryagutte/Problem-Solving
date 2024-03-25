import java.util.*;
import java.io.*;

class permutations {
    
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

        long n = sc.nextLong();
        long res = 1;

        if(n==1)
        {
            System.out.print("1");
            return;
        }
        if(n<4 )
        {
        	System.out.println("NO SOLUTION");
            return;
        }
        for(int i=2;i<=n;i+=2)
                System.out.print(i+" ");
        for(int i=1;i<=n;i+=2)
                System.out.print(i+" ");
    }
}