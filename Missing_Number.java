import java.util.*;
import java.io.*;
// Importing Scanner class from java.util package
import java.util.Scanner;

class Missing_Number {
    
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
        ArrayList array = new ArrayList();
        for(int i=0;i<n-1;i++)
        {
            array.add(sc.nextInt());
        }
        Collections.sort(array);

        if((int)(array.get(0))!=1)
            System.out.println(1);
        else 
        {

            if((int)(array.get(n-2))!=n)
                System.out.println(n);
            else 
            {
                for(int i=0;i<n-1;i++)
                {
                    if((int)(array.get(i+1))-(int)(array.get(i))!=1)
                    {
                        System.out.println((int)(array.get(i))+1);
                        break;
                    }
                }
            }
        }
    }
}