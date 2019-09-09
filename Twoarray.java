package algorithms;
import java.util.*;
import java.io.*;
public class Twoarray {
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
    	int M=s.nextInt();
    	int N=s.nextInt();
    	int [][]arr=new int[M][N];
    	for(int i=0;i<M;i++)
    	{
    		for(int j=0;j<N;j++)
        	{
        		arr[i][j]=s.nextInt();
        	}
    	}
    	
    	
    			PrintWriter pw=new PrintWriter(System.out);
    			for(int i=0;i<M;i++)
    	    	{
    				for(int j=0;j<N;j++)
    	        	{
        		        pw.println(arr[i][j]); 
        		    	        	}
    	    	     }
            			pw.flush();

                 }
}
