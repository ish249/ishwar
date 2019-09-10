package algorithms;

import java.util.Scanner;

public class Inserationsort extends util{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
   	 System.out.println("Enter array Size");
   	 int size=s.nextInt();
   	 int[] arr=new int[size];
   	 System.out.println("Please Enter "+size+" Array Integers");
   	 for(int i=0;i<size;i++)
   	 {
   		 arr[i]=s.nextInt();
   	 }
   	int[] result=insertionsort(arr);
   	printarray(result);
	}

}
