package arrayMultiplication;

public class matrix {

	private int[][] matrixObj;
	
	public void newMatrix(int rows, int cols){
		matrixObj = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrixObj[i][j] = 0;
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
	
}
