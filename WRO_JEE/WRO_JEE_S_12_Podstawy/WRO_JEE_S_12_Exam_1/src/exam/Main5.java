package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main5 {
    public static void main (String[] args){
        System.out.println(sphere());



    }
//    public static double sphere(){
//        System.out.println("Podaj promień kuli: ");
//        Scanner scanner = new Scanner(System.in);
//
//        double r = scanner.nextDouble();
//
//        if(r<=0){
//            System.out.println("Proomień nie może być mniejszy od zera, podaj jeszcze raz: ");
//            r = scanner.nextInt();
//        }
//        double vol=(4*Math.PI*r*r*r)/3;
//        return vol;
//
//    }
public static double sphere()throws InputMismatchException {
    System.out.println("Podaj promień kuli: ");
    Scanner scanner = new Scanner(System.in);
    double vol=0;
    double r=0;
    try{

        r = scanner.nextDouble();

        if(r<=0){
            System.out.println("Proomień nie może być mniejszy od zera, podaj jeszcze raz: ");
            r = scanner.nextInt();
        }
        vol=(4*Math.PI*r*r*r)/3;
    }
    catch (InputMismatchException e){
        System.out.println("Wartość musi być liczbą!!!");
    }



    return vol;

}
}
