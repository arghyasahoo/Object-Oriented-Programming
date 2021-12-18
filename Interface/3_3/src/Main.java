import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.next();

		if (name.toCharArray()[0] == 'A') {
			A calculator = new BasicCalculator();
		}
		else if (name.toCharArray()[0] == 'S') {
			S calculator = new ScientificCalculator();
		}
		else {
			BasicCalculator calculator = new BasicCalculator();
		}
	}
}