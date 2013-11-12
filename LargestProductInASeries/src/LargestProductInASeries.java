import java.math.*;
public class LargestProductInASeries {


	public static void main(String[] args) {
		
		BigInteger n = Math.BigInteger("435345324525245");
		divideAndRemainder(BigInteger val)
		int product, prod;
		for (int i=5; i<1000; i++){
			prod=n[i-1]*n[i-2]*n[i-3]*n[i-4]*n[i-5];
			if (prod>product) product=prod;
		}
			
	}

}
