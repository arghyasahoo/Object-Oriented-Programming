public class Matrix {
	private int[][] matrix;
	private int rowSize, colSize;

	public Matrix(int rowSize, int colSize, int[][] matrix) {
		this.rowSize = rowSize;
		this.colSize = colSize;
		this.matrix = matrix;
	}

	public int getElementAt(int rowIndex, int colIndex) {
		return matrix[rowIndex][colIndex];
	}

	public void setElementAt(int elem, int rowIndex, int colIndex) {
		matrix[rowIndex][colIndex] = elem;
	}

	public boolean findItem(int elem) {
		for (int i=0; i<rowSize; i++) {
			for (int j=0; i<colSize; j++) {
				if (matrix[i][j] == elem) {
					return true;
				}
			}
		}

		return false;
	}

	public int[][] add(int[][] matrix2, int row, int col) throws AdditionNotPossibleException {
		int[][] sumMatrix = new int[rowSize][colSize];
		
		if (rowSize == row && colSize == col) {
			for (int i=0; i<rowSize; i++) {
				for (int j=0; i<colSize; j++) {
					sumMatrix[i][j] = matrix[i][j] + matrix2[i][j];
				}
			}
		} else {
			throw new AdditionNotPossibleException("Row and Column size must be same");
		}

		return sumMatrix;
	}
}
