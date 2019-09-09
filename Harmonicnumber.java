package algorithms;
import java.util.*;
public class Harmonicnumber {
	
	    public static void main(String[] args)
	    {
	        Scanner s=new Scanner(System.in);
	        int N=s.nextInt();
	        float i=2;
	        float sum=1;
	        System.out.println("1");
	        while(i<=N)
	        {   
	            float c=((sum*i)+1)/(i);
	            System.out.println(c);
	            sum=c;
	            i++;
	        }

	        
	    
	}
}
