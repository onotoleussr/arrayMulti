package arrayMultiplication;

import java.util.Scanner;

public class arrayMultiCounting {

	public static void main(String[] args) {

		
		matrix firstMatrix  = new matrix();
		matrix secondMatrix = new matrix();


		System.out.println("Забиваем значениями по Random()*100");
		
		
		
		
		
		
		
		
		
		
/*		//Заполняем первую и вторую матрицу сразу
		for(int i=0; i<firstMatrix.length; i++){
			
			for(int j=0; j<secondMatrix.length; j++){
			
				firstMatrix[i][j]=(int) (Math.random()*100);
				secondMatrix[i][j]=(int) (Math.random()*100);
			}
		}
		
		System.out.println("Значения первой матрици");
		
		for(int i=0; i<3; i++){
			
			for(int j=0; j<3; j++){
			
				System.out.print(firstMatrix[i][j]+((j<2)?" | ":""));
			}
			System.out.print("\n");
		}
		
		System.out.println("\nЗначения второй матрици");
		
		for(int i=0; i<3; i++){
			
			for(int j=0; j<3; j++){
			
				System.out.print(secondMatrix[i][j]+ ((j<2)?" | ":""));
			}
			System.out.print("\n");
		}
*/		
		//Создаем массив результата

		matrix resultMatrix = new matrix();
		
		
		//[secondMatrix.GetMatrixLength()][secondMatrix.GetMatrixLength()]
		
		
		//Расчитываем
		
/*		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				resultMatrix[i][j] = resultMatrix[i][j] + firstMatrix[i][j] * secondMatrix[j][i];
				
			}
		}
		
		System.out.println("\nЗначения результатирующей матрици");
		
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				System.out.print(resultMatrix[i][j] + ((j<2)?" | ":""));
				
			}

			System.out.print("\n");
		
		}
*/	}
	
	
	public int getIntFromKeybord(){
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();

		return num;
	}
	
	
}
