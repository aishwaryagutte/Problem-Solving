import java.util.*;
import java.io.*;

class DistinctNumbers {
    
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
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        	arr[i] = sc.nextInt();

        Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        	s.add(arr[i]);
        System.out.println(s.size());
    }
}