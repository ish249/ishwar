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
    	    		  if(amount/arr[i]>0)
    	    		  System.out.println(arr[i]+" Rs : "+amount/arr[i]);
        	    	  amount=amount%arr[i];
        	    	 
    	    		  VendingMachine(amount,count,i+1);
    	      }
    	 
       }
       public static void binarysearch(int[] arr,int search,int start,int end,int mid) 
       {      
           if(arr[mid]==search)
           {
          	 System.out.println("Index of "+search+" is : "+mid);
           }
           else if(end>=0 && start<arr.length)
           {
          	 if(search<arr[mid])
          	 {    end=mid-1;
          		 mid=(start+end)/2;
          		 binarysearch(arr,search,start,end,mid) ;
          	 }
          	 else if(search>arr[mid])
          	 {    start=mid+1;
          		 mid=(start+end)/2;
          		 binarysearch(arr,search,start,end,mid) ;
          	 }
           }
           else
           {
          	 System.out.println("Result Not found");
           }
    	
       }
       public static int[] insertionsort(int[] arr)
       {
    	   int n=arr.length;
    	   for(int i=1;i<n;++i)
    	   {   int key=arr[i];
    		   int j=i-1;
    		   while(j>=0 && arr[j]>key)
    		   {
    			   arr[j+1]=arr[j];
    			   j=j-1;
    		   }
    		   arr[j+1]=key;
    	   }
    	   return arr;
       }
       public static void printarray(int[] arr)
       {
    	   int n=arr.length;
    	   for(int i=0;i<n;i++)
    	   {  
    		   System.out.print(arr[i]+" ");
    	   }
    	  
       }

}
