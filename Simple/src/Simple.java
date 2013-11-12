
public class Simple {
	public static void main (String args[])
{
	long n=600851475143l  , m, a=0;
	  m=Math.round(Math.sqrt(n));
		//if (n%2==0) m=n/2;
		//else m = Math.round(n/3)+1;
	for (long i=m; i>1; i--)
	{
		System.out.println(i);
		if (n%i==0){
			a=0;
			for (long k=2;k<i;k++)
			{
				if (i%k==0) {a=1; System.out.println("i "+i+" k "+k);}
			}
		if (a==0) 
		{System.out.println("i="+i); break;}}
	}
	System.out.println("end");
}
}

