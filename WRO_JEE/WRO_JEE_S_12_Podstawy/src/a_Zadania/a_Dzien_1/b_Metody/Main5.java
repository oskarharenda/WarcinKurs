package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {
    public static void main (String[] args){
        double gross = 22.34;
        double vat = 0.23;
        double result = calculateNetto(gross, vat);
        System.out.println(result);
    }
    static double calculateNetto(double gross, double vat){
        double calculateNetto = gross-gross*vat;
        return (double) (calculateNetto);
    }
}
