package b_Zadania_Domowe.a_Dzien_1;


public class Main1 {

    public static void main(String[] args) {
        double lataPsa=5;
        double result = dogAge(lataPsa);
        System.out.println(result);
    }
    static double dogAge(double dogAge){
        double AgeInHuman=0;
        if (dogAge<=2) AgeInHuman=dogAge*10.5;
        else AgeInHuman=21+(dogAge-2)*4;
        return AgeInHuman;
    }
}
