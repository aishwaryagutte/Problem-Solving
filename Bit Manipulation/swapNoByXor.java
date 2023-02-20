import java.io.*;
import java.util.*;

class swapNoByXor {
    
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
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        no1 = no1 ^ no2;
        no2 = no2 ^ no1;
        no1 = no1 ^ no2;
        System.out.println("Number1: "+no1+"  Number2: "+no2);

    }
}