package algorithms;
import java.util.*;
public class Stringpermutation {
      public static void main(String[] args)
      {
    	  Scanner s=new Scanner(System.in);
    	  String str=s.next();
    	  permutation(str,"");
      }
      public static void permutation(String str,String result)
      {
    	  
    	  if(str.length()==0)
    	  {
    		  System.out.println(result);
    		  return;
    	  }
    	  for(int i=0;i<str.length();i++)
    	  {
    		  char ch=str.charAt(i);
    		  String strp=str.substring(0, i)+str.substring(i+1);
    		  permutation(strp,result+ch);
    	  }
    	
    	  
      }
}
