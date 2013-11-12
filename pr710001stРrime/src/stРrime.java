
public class st–rime {

	public static void main(String[] args) {
		int m=7, a;
		int k=2;
		int i=3;
		while (k<m)
		{
			for (int c=2 ; c<i ; c++)
			{
				a=0;
				for (long n=2 ; n<c ; n++)
				{
					if (c%n==0) { a=1; break;}
				}
				if (a==0) {k++;System.out.println("!!k "+k+" i "+i);}
		}	
		System.out.println("k "+k+" i "+i);
		i++;
		}
	}

}
