package Fibonachi;

public class Fibonachi {
	public static void main (String args[])
	{
		long a=0, b=1,c=a+b, sum=0, m=4000000;
		while (c<m)
		{
		c=a+b;
		a=b;
		b=c;
		
		if (c%2==0) {sum+=c;}
		}
		System.out.println("Sum="+sum);
	}
}
