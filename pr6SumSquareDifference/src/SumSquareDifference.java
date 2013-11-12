
public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a=0, b=0, c;
		
		for (int i=1;i<=100;i++)
		{
			a+=i*i;
			b+=i;
			System.out.println("a="+a+" b="+b);
		}
		c=b*b-a;
		System.out.println("c="+c);
	}

}
