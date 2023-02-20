import java.io.*;
import java.util.*;

class msbLSB {
    
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
        int n = sc.nextInt();
        printBinary(no);
        //Clear all after LSB
        printBinary(no & (~((1<<n+1)-1)));
        //Clear all before MSB
        printBinary(no & (((1<<n+1)-1)));

    }

    public static void printBinary(int num){
        for(int i=10;i>=0;--i){
            int res = (num>>i) & 1;
            System.out.print(res);
        }
        System.out.println();
    }
}