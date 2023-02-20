import java.io.*;
import java.util.*;

class upperToLowerByBit {
    
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

        for(char c='A';c<='D';++c){
        	printBinary((int)(c));
        	System.out.println(c);
        }

        for(char c='a';c<='d';++c){
        	printBinary((int)(c));
 			System.out.println(c);
        }

        //Converting upper to lower
        for(char c='A';c<='D';++c){
        	System.out.println("Converting "+c+ " to "+ "small letters: "+ (char)(c | (1<<5)));
        }

         //Converting lower to upper
        for(char c='a';c<='d';++c){
        	System.out.println("Converting "+c+ " to "+ "upper letters: "+ (char)(c & (~(1<<5))));
        }

        printBinary((int)(' '));
        System.out.println((char)('C' | ' '));
        printBinary((int)('_'));
        System.out.println((char)('c' & '_'));
     
    }

    public static void printBinary(int num){
        for(int i=10;i>=0;--i){
            int res = (num>>i) & 1;
            System.out.print(res);
        }
        System.out.println();
    }
}