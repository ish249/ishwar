package algorithms;
import java.util.*;
import java.lang.*;
public class Algorithmprogram extends util {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("PrimeNumberRange     press 1"); 
        System.out.println("Anagram              press 2");
        System.out.println("Palindrome           press 3");
        System.out.println("Vending Machine      press 4");
        int num=s.nextInt();
        switch(num)
        {
        case 1:
        	int start=s.nextInt();
        	int last=s.nextInt();
        	List<Integer> result=PrimeNumberRange(start,last);
        	
            for(int i=0;i<result.size();i++)
            {
            	System.out.println(result.get(i));
            }
            break
        	;
        case 2:
        	String first=s.next();
        	String second=s.next();
        	if(Anagram(first,second))
        	{
        		System.out.println("Anagram");
        	}
        	else
        	{
        		System.out.println("Not Anagram");
        	}
        	break
        	;
        case 3:
        	String first1=s.next();
        	String second1=s.next();
        	if(Palindrome(first1,second1))
        	{
        		System.out.println("Palindrome");
        	}
        	else
        	{
        		System.out.println("Not Palindrome");
        	}
        	break
        	;	
        case 4:
        	int amount=s.nextInt();
        	VendingMachine(amount,0,0);
        	break
        	;	
        default :System.out.println("Please Enter Correct Number");
        	
        }
		
	}

}
