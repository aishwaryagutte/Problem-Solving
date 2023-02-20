import java.io.*;
import java.util.*;

class isPowerOfTwo {
    
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

        int no = sc.nextInt();
        if((no & (no-1))==0)
        	System.out.println("Power of 2");
        else
        	System.out.println("Not Power of 2");
    }
}