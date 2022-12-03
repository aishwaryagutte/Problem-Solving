import java.util.*;
import java.io.*;

class NumberSpiral {
    
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

        int t = sc.nextInt();
        int sum=0;
        for(int i=0;i<t;i++)
        {	
        	int x=sc.nextInt();
        	int y=sc.nextInt();

        	if(x<y)
        	{
        		int ans=0;
        		if(y%2!=0)
        			ans = (y*y)-x+1;
        		else 
        			ans=((y-1)*(y-1))+x;
        		System.out.println(ans);
        	}
        	else{
        		int ans=0;
        		if(x%2!=0)
        			ans = ((x-1)*(x-1))+y;
        		else 
        			ans=(x*x)-y+1;
        		System.out.println(ans);
        	}
        }
    }
}