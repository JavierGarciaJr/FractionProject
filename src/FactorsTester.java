/**
 * main driver of the program
 * converts doubles into a fraction format
 * @author Javier
 *
 */
public class FactorsTester {
	/**
	 * main method
	 * prints fractions and compares to see if the others are equal
	 * @param args
	 */
	public static void main(String[] args) {
		//test constructor
		int a = 4;
		int b = 24;
		System.out.println("Testing constructor for f1...");
		Factors f1 = new Factors(a, b);//numerator is a and denominator is b
		
		System.out.println("f1 = " +f1);
		System.out.println();
		System.out.printf("Testing mutators and accessors, setting numerator to %d and denominator to %d\n", a , b);//puts the numerator and the denominator in the sentence
		System.out.println("Numerator = " + a + ", Denominator = " + b);//labels which variable is the numerator and denominator
		System.out.println();
		double doubfrac = Factors.getDoubleFraction(a, b);
		Factors Frac = f1.getReducedFraction2();
		System.out.println("Testing fraction reduction and conversion to double.");
		System.out.println("f1 reduced is " + Frac);//displays the reduced fraction
		System.out.printf("f1 as a decimal is %.2f\n", doubfrac);//displays the decimal of the fraction
		System.out.println();
		
		//test equals
		System.out.println("Testing Equals Method");
		Factors f2 = new Factors(1,6);//displays each fraction
		Factors f3 = new Factors(3,1);
		Factors f4 = new Factors(6,7);
		System.out.println("f1 = " + f1);
		
		Factors nope = f1;
		
		System.out.println("f2 = " + f2);
		System.out.println("f3 = " + f3);
		System.out.println("f4 = " + f4);
		
		if(f1.equals(f2)) {
			System.out.println("f1 is equal to f2");//determines if the fractions are equal to each other
		}else {
			System.out.println("f1 is NOT equal to f2");
		}
		if(f1.equals(f3)) {
			System.out.println("f1 is equal to f3");
		}else {
			System.out.println("f1 is NOT equal to f3");
		}
		if(f2.equals(f4)) {
			System.out.println("f2 is equal to f4");
		}else {
			System.out.println("f2 is NOT equal to f4");
		}
		if(f3.equals(f4)) {
			System.out.println("f3 is equal to f4");
		}else {
			System.out.println("f3 is NOT equal to f4");
		}
		}
}
