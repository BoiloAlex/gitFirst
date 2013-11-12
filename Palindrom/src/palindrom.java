
public class palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	int a, n;
	int b=99999;
	for (int i=999;i>1;i--){
		for (int j=999; j>1;j--){
			a=i*j;
			n=a;
			if  (Math.round(n/100000)==(n%10)&
				(Math.round(n/10000)%10)==Math.round(n/10)%10 &
				(Math.round(n/1000)%10)==Math.round(n/100)%10) 
			{ 
				System.out.println("i="+i+" j="+j+" i*j="+a); 
				if (b<a) b=a;
			}
		}
	}
		System.out.println("i*j="+b);
	}

}
