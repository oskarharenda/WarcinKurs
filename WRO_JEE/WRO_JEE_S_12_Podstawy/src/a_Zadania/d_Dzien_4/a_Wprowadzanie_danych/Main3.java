package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        getData();
    }
    static void getData(){
        Scanner scaner = new Scanner(System.in);
        int liczba=1;
        int suma = 0;
        int i = 0;

        while(true){
            if (liczba==0) {
                i--;
                break;
            }
            System.out.print("Podaj liczbę: ");
            liczba=scaner.nextInt();
            suma+=liczba;
            i++;
        }
        System.out.println(suma);
        System.out.println((i));

    }
}
