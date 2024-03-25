import java.util.*;
import java.io.*;

class powerOfTwo {
    
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

        int n =	sc.nextInt();
        System.out.println(n+" th power of 2: "+(1<<n));

    }
}