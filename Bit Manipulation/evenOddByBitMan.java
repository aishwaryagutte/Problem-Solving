import java.io.*;
import java.util.*;

class evenOddByBitMan {
    
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

        //Apan even ahe ki odd he module operator n check krto generally but te jara slow ahe as compared to bit manupilation so we can do like below
        for(int i=0;i<9;i++){
        	printBinary(i);
        	if((i & i) == 1)
        		System.out.println("Odd");
        	else
        		System.out.println("Even");
        }

    }

     public static void printBinary(int num){
        for(int i=10;i>=0;--i){
            int res = (num>>i) & 1;
            System.out.print(res);
        }
        System.out.println();
    }
}