package a_Zadania.a_Dzien_1.d_Tablice_wielowymiarowe;

public class Main4 {

	public static void main(String[] args) {

		int[][] task4Array = { { 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4 }, { 5, 1, 6, 7 } };
		int sum=0;

		for (int i=0; i<task4Array.length; i++){
			System.out.println(task4Array[i][i]);
			sum+=task4Array[i][i];
		}
		System.out.println("suma: "+sum);
	}
}
