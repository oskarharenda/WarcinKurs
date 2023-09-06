package a_Zadania.a_Dzien_1.b_Metody;


public class Main3 {

    public static void main(String[] args) {
        double zl=10;
        double result=convertToUsd(zl);
        System.out.format("%.2f%n", result);
    }
    static double convertToUsd(double zl){
        double dolar=zl*4.04;
        return dolar;
    }
}
