/*Create a Util Class and write the Anagram, Palindrome, Prime Numbers, Search Algos, Sort Algos, etc  as a static function
*/
package algorithms;

import java.util.Arrays;
import java.util.*;

public class util {
       public static boolean Anagram(String first,String second) {
    	   char[] arr1=first.toLowerCase().toCharArray();
    	   char[] arr2=second.toLowerCase().toCharArray();
    	   Arrays.sort(arr1);
    	   Arrays.sort(arr2);
    	   return Arrays.equals(arr1, arr2);
       }
       public static List<Integer> PrimeNumberRange(int start,int last) {
    	   List<Integer> list=new ArrayList<Integer>();
    	  
    	  
    	   for(int i=start;i<=last;i++)
    	   { String status="true";
    		   for(int j=2;j<i;j++)
    		   {
    			   if(i%j==0)
    			   {
    				   
    				   status="false";
    			   }
    		   }
    		   
    		   if(status=="true")
    		   {
    			   list.add(i);
    		   }
    	   }
    	   return list;
       }
       
       public static boolean Palindrome(String first,String second) {
    	   String rev="";
    	   for(int i=first.length()-1;i>=0;i--)
    	   {
    		   rev+=first.charAt(i);
    	   }
    	  if(rev.equals(second))
    	   return true;
    	  else
    		  return false;
       }
       public static void VendingMachine(int amount,int count,int i) 
       {      
       
    	      int[] arr= {1000,500,100,50,10,5,2,1};
    	      if(amount==0)
	    	  {
    	    	 System.out.println(count);
    	      }
    	      else
	    	  {
    	    		  count=count+(amount/arr[i]);
    	    		  
    	    		  
        	    	  amount=amount%arr[i];
        	    	 
    	    		  VendingMachine(amount,count,i+1);
    	      }
    	 
       }
}
