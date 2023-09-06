package a_Zadania.a_Dzien_1.b_Metody;


public class Main8 {

    public static void main(String[] args) {
        double a=7;
        double b=7;
        double c=9;
        double result=maxOfThree(a,b,c);
        System.out.println(result);
    }
    static double maxOfThree(double a, double b, double c){
        if (a>=b && a>=c) return a;
        if (b>=a && b>=c) return b;
        else return c;
    }
}
