import java.io.*;
import java.util.*;
import java.lang.Integer;

class unsetBit {
    
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
        System.out.println("Printing binary of no:");
        printBinary(no);
        System.out.println("Setting up "+ n +"th bit:");
        printBinary(no | (1<<n));
        System.out.println("Unsetting up "+ n +"th bit: ");
        printBinary(no & (~(1<<n)));
        //Toggling means doing 0 -> 1 and 1>0
        System.out.println("Toggling " + n + "th bit: ");
        printBinary(no ^ (1<<n));
        //Find the total set bits in no.
        int cnt=0;
        for(int i=31;i>=0;--i){
            if((no & (1<<i) ) !=0 )
                cnt++;
        }
        System.out.println(cnt);
        //Or by using directly fun also we can count total set bits
        System.out.println(Integer.bitCount(no));
    }   

    public static void printBinary(int num){
        for(int i=10;i>=0;--i){
            int res = (num>>i) & 1;
            System.out.print(res);
        }
        System.out.println();
    }

}