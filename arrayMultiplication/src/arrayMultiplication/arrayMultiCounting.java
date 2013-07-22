package arrayMultiplication;

import java.util.Scanner;

public class arrayMultiCounting {

	public static void main(String[] args) {

		matrix firstMatrix = new matrix();
		matrix secondMatrix = new matrix();

		int fmLenght = getIntFromKeybord("Введите длину перовой матрицы");
		int fmHeight = getIntFromKeybord("Введите высоту перовой матрицы");

		int smLenght = getIntFromKeybord("Введите длину второй матрицы");
		
		
/*		System.out.println(fmLenght);
		System.out.println(fmHeight);
		System.out.println(smLenght);
*/		
		
		
		firstMatrix.newMatrix(fmLenght, fmHeight, "t1");
		secondMatrix.newMatrix(smLenght, firstMatrix.getLength(), "t2");

		/*System.out.println(firstMatrix.getHeight());
		
		System.out.println(secondMatrix.getHeight());*/
		
		
		
		System.out
				.println("Высота второй матрицы установлена равной длине перовой матрицы раной :"
						+ Integer.toString(firstMatrix.getLength())
						+ " в связи с правилами перемножения матриц!!!\n");

		System.out
				.println("Забиваем первую матрицу значениями по Random()*100");
		firstMatrix.fillMatrix();
		firstMatrix.printMatrixValues();

		System.out
				.println("\nЗабиваем вторую матрицу значениями по Random()*100");
		secondMatrix.fillMatrix();
		secondMatrix.printMatrixValues();

		// Создаем матрицу результата
		matrix resultMatrix = new matrix();
		resultMatrix.newMatrix(firstMatrix.getHeight(),
				secondMatrix.getLength(), "r1");
		resultMatrix.multiplicate(firstMatrix, secondMatrix);

		System.out.println("\nРезультат перемножения");
		resultMatrix.printMatrixValues();

	}
	
	
	public static int getIntFromKeybord(String outText){
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(outText.toString());
		
		num = (int) sc.nextInt();
//		sc.close();
		
		return num;
	}

}
