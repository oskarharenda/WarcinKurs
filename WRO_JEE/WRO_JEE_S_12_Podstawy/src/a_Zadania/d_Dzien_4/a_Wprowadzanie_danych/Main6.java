package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main6 {

    public static void main(String[] args) {
        equation();


    }
    static void equation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax+bx+cx");
        System.out.println("Podaj a: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj b: ");
        double b = scanner.nextDouble();
        System.out.println("Podaj c: ");
        double c = scanner.nextDouble();

        double delta = (b*b)-(4*a*c);
        if(delta<0) System.out.println("Brak rozwiązań w rzczywistych");
        else{
            double p=sqrt(delta);
            if (a==0) {
                double answer=-c/b;
            }
            else{
                double answer1=(-b-p)/(2*a);
                double answer2=(-b+p)/(2*a);
                System.out.println("delta: "+delta);
                System.out.println("pierwiastek 1: "+answer1);
                System.out.println("pierwiastek 2: "+answer2);
            }

        }
    }
}
