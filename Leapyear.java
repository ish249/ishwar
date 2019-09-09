package algorithms;
import java.util.*;
public class Leapyear {
	
	    public static void main(String[] args)
	    {
	        Scanner s=new Scanner(System.in);
	        int year=s.nextInt();
	        if(year%400==0)
	        {
	               System.out.print("Leap Year");
	        }
	        else if(year%100==0)
	        {
	            System.out.print("Leap Year Not");
	        }
	        else if(year%4==0)
	        {
	          System.out.print("Leap Year");
	        }
	        else
	        System.out.print("Leap Year Not");
	        
	    
	}
}
