package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        rowsColumns();

    }

    static void rowsColumns(){
        int rows;
        int columns;
        int licznik=1;
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Poaj liczbę wierszy");
        rows = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        columns = scanner.nextInt();

        int[][] tab = new int [rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                tab[i][j]=licznik;
                sum+=licznik;
                licznik++;
            }
        }
        int srednia=sum/licznik;
        System.out.println("suma: "+sum);
        System.out.println("średnia: "+srednia);

        System.out.println(Arrays.deepToString(tab));
    }

}
