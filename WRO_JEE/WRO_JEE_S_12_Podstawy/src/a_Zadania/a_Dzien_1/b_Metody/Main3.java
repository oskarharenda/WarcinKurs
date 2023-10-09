package a_Zadania.a_Dzien_1.b_Metody;


public class Main3 {
    public static void main (String[] args){
        double pln = 55;
        double result = convertToUsd(pln);
        System.out.println(result);
    }
    static double convertToUsd(double pln){
        return pln*4.04;
    }
}
/* nie mam kurwa pojecia jakies lossy convertion float double int ?

 */
