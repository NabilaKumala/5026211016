import java.util.Random;


public class ComputeMethods5026211016 {

	public double fToC(double degreesF) {
		double degreesC = 5.0 / 9 * (degreesF - 32);
		return degreesC;
	}

	public double hypotenuse(int a, int b) {
		double total = Math.pow(a, 2) + Math.pow(b, 2);
		double hypotenuseC = Math.sqrt(total);
		return hypotenuseC;
	}

	public int roll() {
		Random twoDice = new Random();
		int roll = twoDice.nextInt(10) + 2;
		return roll;
	}

}