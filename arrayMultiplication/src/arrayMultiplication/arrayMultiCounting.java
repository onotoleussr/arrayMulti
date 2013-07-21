package arrayMultiplication;

public class arrayMultiCounting {

	public static void main(String[] args) {

		
		int[][] firstMatrix  = new int[3][3];
		int[][] secondMatrix = new int[3][3];
		
		
		System.out.println("Не будем выпендриваться, возьмем 2 квадратных матрицы размером 3\n");
		System.out.println("Забиваем значениями по Random()*100");
		
		
		//Заполняем первую и вторую матрицу сразу
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
		
		//Создаем массив результата

		int[][] resultMatrix = new int[firstMatrix.length][secondMatrix.length];
		
		//Расчитываем
		
		for(int i=0;i<3;i++){
			
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
	}
}
