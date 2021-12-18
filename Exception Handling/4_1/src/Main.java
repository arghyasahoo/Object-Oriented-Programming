import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();
		int matrix[][] = new int[rowSize][colSize];

		for (int i=0; i<rowSize; i++) {
			for (int j=0; j<colSize; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		Matrix m = new Matrix(rowSize, colSize, matrix);

		m.getElementAt(1,1);
		m.setElementAt(3,1,1);
		m.getElementAt(1,1);
		m.findItem(3);

		System.out.println(m.add(matrix, rowSize, colSize));
	}
}
