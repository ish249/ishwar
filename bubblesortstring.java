package algorithms;

import java.util.*;

public class bubblesortstring extends util {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	   	 System.out.println("Enter array Size");
	   	 int size=s.nextInt();
	   	 String[] arr=new String[size];
	   	 System.out.println("Please Enter "+size+" Array Strings");
	   	 s.nextLine();
	   	 for(int i=0;i<size;i++)
	   	 {
	   		 arr[i]=s.next();
	   	 }
	   	 String[] result=bubblesortString(arr);
	   	 printarraystring(result);
	}

}
