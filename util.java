/*Create a Util Class and write the Anagram, Palindrome, Prime Numbers, Search Algos, Sort Algos, etc  as a static function
*/
package algorithms;

import java.util.*;


public class util {
	static Scanner st=new Scanner(System.in);
// Scannner for scan Integer start	
	public static int scanInt()
	{
		return st.nextInt();
	}
// Scan Integer end	
	
// Scanner for Scan String next start	
	public static String scanString()
	{
		return st.next();
	}
// Scan String next end
	
// Scan String nextLine start	
	public static String scanStringLine()
	{
		return st.nextLine();
	}
// Scan String nextLine end
	
// Anagram program method and return value true/false
       public static boolean Anagram(String first,String second) {
    	   char[] arr1=first.toLowerCase().toCharArray();
    	   char[] arr2=second.toLowerCase().toCharArray();
    	   Arrays.sort(arr1);
    	   Arrays.sort(arr2);
    	   return Arrays.equals(arr1, arr2);
       }
//Anagram method complete
       
//PrimeNumberrange method and return list of prime number       
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
//PrimeNumberrange method complete0
           
// Palindrome method and return boolean value       
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
// palindrome method complete
       
// Vending Machine Method to calculate Minimum notes change of amount       
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
// Vending Machine complete
       
// BinarySearch Integer Method start       
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
// Binarysearch Integer Method end
       
// Binarysearch String Method start       
       public static void binarysearchstring(String[] arr,String search,int start,int end,int mid) 
       {      
           if(arr[mid].compareTo(search)==0)
           {
        	 System.out.println("Result found");
          	 
           }
           else if(end>=0 && start<arr.length)
           {
          	 if(search.compareTo(arr[mid])<0)
          	 {    end=mid-1;
          		 mid=(start+end)/2;
          		 binarysearchstring(arr,search,start,end,mid) ;
          	 }
          	 else if(search.compareTo(arr[mid])>0)
          	 {    start=mid+1;
          		 mid=(start+end)/2;
          		 binarysearchstring(arr,search,start,end,mid) ;
          	 }
           }
           else
           {
          	 System.out.println("Result Not found");
           }
    	
       }
// Binarysearch String Method end
       
// Inserationsort Integer Method start       
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
// Inserationsort Integer Method end
       
// Inserationsort String Method start       
       public static String[] insertionsortString(String[] arr)
       {
    	   int n=arr.length;
    	   for(int i=1;i<n;++i)
    	   {   String key=arr[i];
    		   int j=i-1;
    		   while(j>=0 && arr[j].compareTo(key)>0)
    		   {
    			   arr[j+1]=arr[j];
    			   j=j-1;
    		   }
    		   arr[j+1]=key;
    	   }
    	   return arr;
       }
 //Inserationsort string Method end
       
 // Print Arrray Integer start      
       public static void printarray(int[] arr)
       {
    	   int n=arr.length;
    	   for(int i=0;i<n;i++)
    	   {  
    		   System.out.print(arr[i]+" ");
    	   }
    	  
       }
 // print array Integer end
       
 // Print array String start      
       public static void printarraystring(String[] arr)
       {
    	   int n=arr.length;
    	   for(int i=0;i<n;i++)
    	   {  
    		   System.out.print(arr[i]+" ");
    	   }
    	  
       }
 // Print array string end
       
//  Bubblesort Integer start       
       public static int[] bubblesortInteger(int[] arr)
       {
    	   int n=arr.length;
    	   for(int i=0;i<n-1;i++)
    	   {   
    		 
    		   for(int j=0;j<n-1-i;j++)
    		   {
    			   if(arr[j]>arr[j+1])
    	    	   {
    			   int temp=arr[j];
    			   arr[j]=arr[j+1];
    			   arr[j+1]=temp;
    		       }
    	       }
    	   }
    	   return arr;
       }
// Bubblesort Integer end
       
// Bubblesort String start       
       public static String[] bubblesortString(String[] arr)
       {
    	   int n=arr.length;
    	   for(int i=0;i<n-1;i++)
    	   {   
    		 
    		   for(int j=0;j<n-1-i;j++)
    		   {
    			   if(((arr[j+1]).compareTo(arr[j]))<0)
    	    	   {
    			   String temp=arr[j];
    			   arr[j]=arr[j+1];
    			   arr[j+1]=temp;
    		       }
    	       }
    	   }
    	   return arr;
       }
// Bubblesort String end
       
// Find your number Method start
       public static void findyournumber(int N,int low,int high,int mid)
       {
    	   System.out.println(mid+" is your Assume Number (yes/no)");
    	   if((("yes").compareTo(st.next()))==0)
    	   {
    		   System.out.println("Your Assume Number is "+mid);
    	   }
    	   else 
    	   {
    		   System.out.println("Assume is Smaller Than "+mid+" Number (yes/no)");
    		   String result= st.next();
    		if((("yes").compareTo(result))==0)
    		{
    			 high=mid-1;
    			 mid=(low+high)/2;
    			 findyournumber(N,low,high,mid) ;
    		}
    		else
    		{
    			 low=mid+1;
    			 mid=(low+high)/2;
    			 findyournumber(N,low,high,mid) ;
    		}
    	   }
    	   
       }
// Find your number Method end
}
