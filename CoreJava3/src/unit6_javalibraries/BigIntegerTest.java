package unit6_javalibraries;

import java.math.BigInteger;

public class BigIntegerTest {
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("12345678923456789");
		BigInteger bi2 = new BigInteger("1234567892347868687687747475675765765675675678945678923456789");
		System.out.println(bi1.abs());
		System.out.println(bi1.add(bi2));
		System.out.println(Integer.MIN_VALUE+", "+Integer.MAX_VALUE);
	}
}