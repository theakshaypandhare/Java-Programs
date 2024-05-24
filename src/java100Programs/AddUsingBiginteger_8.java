package java100Programs;

import java.math.BigInteger;

public class AddUsingBiginteger_8 {
public static void main(String[] args) {
	BigInteger bigInteger= new BigInteger("45");
	BigInteger bigInteger2=new BigInteger("20");
	BigInteger bigInteger3=bigInteger.add(bigInteger2);
	System.out.println(bigInteger3);
}
}
