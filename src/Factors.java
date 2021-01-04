/**
 * sets the info in Fraction tester in a fraction format
 * @author Javier
 *
 */
public class Factors {
	private int numerator = 4;
	private int denominator = 24;
	/**
	 * finds if it is a valid fraction
	 * @param numerator
	 * @param denominator
	 */
	public Factors(int numerator, int denominator) {
		this.numerator = numerator;
		if(denominator != 0) {
			this.denominator = denominator;
		}else {
			throw new RuntimeException("Cannot create a fraction with denominator 0");//if invalid
		}
	}
	/**
	 * returns numerator
	 * @return
	 */
	public int getNumerator() {
		return numerator;
	}
	/**
	 * returns denominator
	 * @return
	 */
	public int getDenominator() {
		return denominator;
	}
	/**
	 * sets number to a new numerator
	 * @param numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	/**
	 * method will return a boolean variable called success that will indicate whether or
	 * not this method was successful.
	 * @param denominator
	 * @return
	 */
	public boolean setDenominator(int denominator) {
		if(denominator != 0) {
			this.denominator = denominator;
			return true;
		}
		return false;
	}
	/**
	 * method returns reduced Fraction Object
	 * @param a
	 * @param b
	 * @return
	 */
	public static Factors getReducedFraction(int a, int b) {
		int gcdVal = gcd(a, b);
		Factors reducedVersion = new Factors(a / gcdVal, b / gcdVal);
		
		return reducedVersion;
		
	}
	/**
	 * method returns the fraction(numerator/denominator) value as a double
	 * @param numerator
	 * @param denominator
	 * @return
	 */
	public static double getDoubleFraction(double numerator, double denominator) {
		double jeff = numerator / denominator;
		
		return jeff;
	}
	/**
	 * return a String that is in the standard format for a fraction
	 */
	public String toString() {
		String result = String.format("%d/%d",numerator, denominator);
		return result;
	}
	/**
	 * compares this Fraction object with the parameter
	 * @param otherFraction
	 * @return
	 */
	public  boolean equals(Factors otherFraction) {
		Factors f1Reduced = getReducedFraction2();
		Factors f2Reduced = otherFraction.getReducedFraction2();
		
		return f1Reduced.numerator == f2Reduced.numerator && f1Reduced.denominator == f2Reduced.denominator;
	}
	/**
	 * finds the greatest common denominator
	 * @param a
	 * @param b
	 * @return
	 */
	public static  int gcd(int a, int b) {
		
		
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	/**
	 * method returns reduced Fraction Object reduced
	 * @return
	 */
	public Factors getReducedFraction2() {
		int gcdVal = gcd2();
		Factors reducedVersion = new Factors(numerator/gcdVal, denominator/gcdVal);
		return reducedVersion;
	}
	/**
	 * finds greatest common denominator
	 * @return
	 */
	private int gcd2() {
		int y = numerator;
		int z = denominator;
		
		while(z != 0) {
			int lol = z;
			z = y%z;
			y = lol;
		}
		return y;
	}
}
