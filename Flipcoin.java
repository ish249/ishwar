package algorithms;
import java.util.*;
public class Flipcoin {
	
	    public static void main(String[] args)
	    {
	        Scanner s=new Scanner(System.in);
	        int num=s.nextInt();
	        int i=1;
	        int head=0;
	        int tail=0;
	        while(i<num)
	        {
	          if(Math.random()<0.5)
	          {
	                tail++;
	          }
	          else
	          {
	               head++;
	          }
	          i++;
	        }
	        System.out.println((head/(head+tail))*100);
	        System.out.println((tail/(head+tail))*100);
	    }
	
}
