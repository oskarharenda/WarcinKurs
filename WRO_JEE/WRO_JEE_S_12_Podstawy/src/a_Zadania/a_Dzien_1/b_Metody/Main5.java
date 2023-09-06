package a_Zadania.a_Dzien_1.b_Metody;


public class Main5 {

    public static void main(String[] args) {
        double brutto=200;
        double vat=0.23;
        double result=calculateNetto(brutto,vat);
        System.out.println(result);
    }
    static double calculateNetto(double gross, double vat){
        double netto = (1-vat)*gross; //netto obliczamy odejmując o 1 wartośc wat i mnożąc przez cene brutto
        return netto;
    }
}
