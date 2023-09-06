package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        nettoBrutto();
    }
    static void nettoBrutto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote: ");
        double cena = scanner.nextDouble();
        System.out.println("wartośćc podatku w procentach: ");
        double tax =0.01*scanner.nextDouble();
        System.out.println("Kwotę zamienić z brutto na nette wpisz BN, netto na brutto NB");
        double answer;
        while (true){
            String decyzja = scanner.nextLine();
            if (decyzja.equals("NB")) {
                answer =cena/(1+tax);
                System.out.println("Kwota brutto"+answer);
                break;
            }
            if (decyzja.equals("BN")) {
                answer =(1+tax)*cena;
                System.out.println("Kwota netto: "+answer);
                break;
            }
            System.out.println("Tylko NB lub BN");
        }
    }
}
