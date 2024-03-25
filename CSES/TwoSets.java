import java.util.*;
import java.io.*;

class TwoSets {
    
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

        long n =  sc.nextLong();
        long sum=(n*(n+1))/2;
        if(sum %2 ==1 || n<3)
        {
        	System.out.println("NO");
        	return;
        }
        System.out.println("YES");
        long ans = (n*(n+1))/4;
        ArrayList l1= new ArrayList();
        ArrayList l2= new ArrayList();       
        for(long i=n;i>0;i--)
        {
        	if(i<=ans){
        		l1.add(i);
        		ans-=i;
        	}
        	else 
        			l2.add(i);
        }
      		System.out.println(l1.size());
        	for(long i=0;i<l1.size();i++)
        		System.out.print(l1.get(i)+" ");
        	System.out.println();
        	System.out.println(n-l1.size());
        	for(long i=0;i<l2.size();i++)
        		System.out.print(l2.get(i)+" ");
	}
}