package algorithms;
import java.util.*;
public class Findyournumber extends util {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int N=(int)Math.pow(2, n);
		System.out.println("Let Assume your Number between 0 and "+(N-1));
		findyournumber(N,0,N-1,N/2);
	}

}
