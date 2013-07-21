package arrayMultiplication;

public class matrix {

	private int[][] matrixObj;
	
	
	public void newMatrix(int rows, int cols){
	
		matrixObj = new int[rows][cols];	
		
	}
	
	
	
	public int GetMatrixLength() {
		return matrixObj.length;
	}
	
	public int GetMatrixHeight() {
		return matrixObj[0].length;
	}
	
}
