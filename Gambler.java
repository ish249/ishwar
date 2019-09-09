package algorithms;
import java.util.*;
public class Gambler {
   public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int stake=s.nextInt();
	   int goal=s.nextInt();
	   int times=s.nextInt();
	   int bet=0;
	   int win=0;
	   for(int i=0;i<times;i++)
	   {   
		  
		   int c=stake;
		   while(c>0 && c<goal)
		   {
			   bet++;
			   if(Math.random()<0.5)
				   c++;
			   else
				   c--;
		   }
		 if(c==goal)
			 win++;
			  
	   }
	   System.out.println("Number of win  "+win);
	   System.out.println("Percentage of win  "+100.0*win/times);
	   System.out.println("Percentage of loss  "+100.0*(times-win)/times);
   }
}
