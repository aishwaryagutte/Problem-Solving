import java.io.*;
import java.util.*;

class Factorial_Recursive {
    
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
        System.out.println(fac(no));

    }

    static long fac(int no)
    {
    	if(no==1)
    		return 1;
    	return no*fac(no-1);
    }
}