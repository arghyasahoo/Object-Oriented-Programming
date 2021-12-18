public class BasicCalculator implements A{

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a-b;
	}

	public int multiplication(int a, int b) {
		return a*b;
	}

	public float division(int a, int b) {
		return a/b;
	}

	public int modulo(int a, int b) {
		return a%b;
	}
}