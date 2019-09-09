package algorithms;
import java.util.*;
public class Addtozero {
     public static void main(String[] args)
     {
    	 Scanner s=new Scanner(System.in);
    	 int size=s.nextInt();
    	 int []arr=new int[size];
    	 for(int i=0;i<size;i++)
         {
    		 arr[i]=s.nextInt();
    	 }
    	 int pair=0;
    	 for(int i=0;i<size;i++)
    	 {
    		 for(int j=i+1;j<size;j++)
        	 {
    			 for(int k=j+1;k<size;k++)
    	    	 {
    	    		if(arr[i]+arr[j]+arr[k]==0)
    	    		{	pair++;
    	    		}
    	    	 } 
        	 }
    	 }
    	 System.out.println(pair);
    }
}
