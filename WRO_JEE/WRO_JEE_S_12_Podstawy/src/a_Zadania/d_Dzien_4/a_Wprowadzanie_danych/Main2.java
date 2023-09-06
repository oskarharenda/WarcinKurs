package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        operations();
    }
    static void operations(){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Podaj pierwsza liczbę: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Wartość musi byś liczbą. Podaj jeszcze raz: ");
        }
        a=scanner.nextInt();
        System.out.print("Podaj drugą liczbę");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Wartość musi byś liczbą. Podaj jeszcze raz: ");
        }
        b=scanner.nextInt();

        int suma=a+b;
        System.out.println("dodawanie: "+suma);
        int roznica=a-b;
        System.out.println("odejmowanie: "+roznica);
        int mnozenie=a*b;
        System.out.println("mnozenie: "+mnozenie);
        if (b!=0) {
            int dzielenie=a/b;
            System.out.println("dzielenie: "+dzielenie);
        }
        else System.out.println("Nie można dzielić przez zero!");


    }

}
