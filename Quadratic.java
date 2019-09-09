package algorithms;

import java.util.*;
import java.lang.Math;
public class Quadratic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		double c=s.nextDouble();
		double delta=Math.pow(b, 2)-(4*a*c);
		if(delta>=0)
		{
		System.out.println((-b+Math.sqrt(delta)/(2*a)));
		System.out.println((-b-Math.sqrt(delta)/(2*a)));
		}
		else
		{
			System.out.println(((-b)/(2*a))+"+"+(Math.sqrt(-delta)/(2*a))+"i");
			System.out.println(((-b)/(2*a))+"-"+(Math.sqrt(-delta)/(2*a))+"i");
		}
	}

}
