package arrayMultiplication;

public class matrix {

	private int[][] matrixObj;

	public void newMatrix(int rows, int cols) {
		matrixObj = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrixObj[i][j] = 0;
			}
		}
	}

	public void fillMatrix() {
		for (int i = 0; i < getLength(); i++) {
			for (int j = 0; j < getHeight(); j++) {
				matrixObj[i][j] = (int) (Math.random() * 100);
			}
		}
	}
	
	public int getLength() {
		return matrixObj.length;
	}

	public int getHeight() {
		return matrixObj[0].length;
	}

	public int getValue(int i, int j) {
		return matrixObj[i][j];
	}

	public void setValue(int i, int j, int newValue) {
		matrixObj[i][j] = newValue;
	}

	public void printMatrixValues() {

		System.out.println("\nЗначения матрици");

		for (int i = 0; i < getLength(); i++) {
			for (int j = 0; j < getHeight(); j++) {
				System.out.print(matrixObj[i][j] + ((j < 2) ? " | " : ""));
			}

			System.out.print("\n");
		}
	}
	
	public void matrixMultiplicate(matrix firstM, matrix secondM) {

		for (int i = 0; i < getLength(); i++) {

			for (int j = 0; j < getHeight(); j++) {

				int newValue = 0;

				for (int k = 0; k < firstM.getLength(); k++) {

					newValue = newValue + getValue(i, j)
							+ firstM.getValue(i, k) * secondM.getValue(k, i);
				}

				setValue(i, j, newValue);
			}
		}
	}

	
	

}
