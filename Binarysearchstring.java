package algorithms;

import java.util.Arrays;
public class Binarysearchstring extends util {

	public static void main(String[] args) {
	
   	 System.out.println("Enter array Size");
   	 int size=scanInt();
   	 String[] arr=new String[size];
   	 System.out.println("Please Enter "+size+" Array String");
   	 scanStringLine();
   	 for(int i=0;i<size;i++)
   	 {
   		 arr[i]=scanString();
   	 }
   	 Arrays.sort(arr);
   	 System.out.println("Enter Search String");
   	 String search=scanString();
   	 binarysearchstring(arr,search,0,size-1,size/2);
	}

}
