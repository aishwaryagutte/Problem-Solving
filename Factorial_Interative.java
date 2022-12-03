import java.util.*;
import java.io.*;

class Factorial_Interative {
    
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

        int no=sc.nextInt();
        long ans=1;
        for(int i=2;i<=no;i++)
        {
        	ans=ans*i;
        }
        System.out.println(ans);

    }
}