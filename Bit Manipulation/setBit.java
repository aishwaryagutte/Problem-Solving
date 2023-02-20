import java.io.*;
import java.util.*;


class isetBit {
    
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
        int no = sc.nextInt();
        printBinary(no);
        if((no & (1<<n)) == 0)
            System.out.print("Not set");
        else 
            System.out.println("Set"); 
       
    }

    public static void printBinary(int num){
        for(int i=10;i>=0;--i){
            int res = (num>>i) & 1;
            System.out.print(res);
        }
        System.out.println();
    }
}