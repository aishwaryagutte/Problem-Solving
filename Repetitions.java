import java.util.*;
import java.io.*;

class Repetitions {
    
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

        String str = sc.next();

        int cnt1=1,cnt2=0;
        for(int i=0;i<str.length()-1;i++)
        {

        	if(str.charAt(i)==str.charAt(i+1))
        		cnt1++;
        	else 
        	{
        		if(cnt1>cnt2)
        			cnt2=cnt1;
        	
        		cnt1=1;
        	}
        }

        if(cnt1>cnt2)
         System.out.println(cnt1);
     	else
     	 System.out.println(cnt2);
    }
}