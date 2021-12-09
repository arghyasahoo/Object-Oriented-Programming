import java.lang.Math;

public class ScientificCalculator extends BasicCalculator implements S {
	
	@Override
	public int exponentiation(int base, int power) {
		return Math.pow(base, power);
	}

	public int logarithm(int num) {
		return Math.log(num);
	}
}