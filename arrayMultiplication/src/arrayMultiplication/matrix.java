package arrayMultiplication;

public class matrix {

	private int[][] matrixObj;
	public String sName = new String();
	
	public void newMatrix(int rows, int cols, String n) {
		
		matrixObj = new int[rows][cols];
		this.sName = n;
/*		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrixObj[i][j] = 0;
			}
		}
*/	
		
	System.out.println(sName);
	
	}

	public void fillMatrix() {
		for (int i = 0; i < matrixObj.length; i++) {
			for (int j = 0; j < matrixObj[0].length; j++) {
				matrixObj[i][j] = (int) (Math.random() * 10);
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
		
		System.out.println(sName);

		System.out.println("\nЗначения матрици");

		for (int i = 0; i < matrixObj.length; i++) {
			for (int j = 0; j < matrixObj[0].length; j++) {
				System.out.print(matrixObj[i][j] + ((j < matrixObj.length-1) ? " | " : " "));
			}

			System.out.print("\n");
		}
	}
	
	public void multiplicate(matrix firstM, matrix secondM) {

		System.out.println(sName);

		for (int i = 0; i < this.getLength(); i++) {

			for (int j = 0; j < this.getHeight(); j++) {

				int newValue = 0;

				for (int k = 0; k < firstM.getLength(); k++) {

					newValue = newValue + getValue(i, j) + firstM.getValue(i, k) * secondM.getValue(k, j);
				}

				this.setValue(i, j, newValue);
			}
		}
	}

	
	

}
