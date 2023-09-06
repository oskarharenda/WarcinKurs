package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        getinfo();
    }
    static void getinfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String firstName = scanner.nextLine();
        System.out.print("Podaj wiek");
        int age;
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Podaj sawój wiek: ");
        }
        age=scanner.nextInt();
        System.out.println(firstName+" ma "+age);
    }
}
