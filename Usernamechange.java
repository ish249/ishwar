package algorithms;
import java.util.*;
public class Usernamechange {
	
	    public static void main(String[] args)
	    {
	        Scanner s=new Scanner(System.in);
	        String strl="Hello <<UserName>>, How are you?";
	        String str=s.nextLine();
	        System.out.print(strl.replace("<<UserName>>",str));
	    }
	}

