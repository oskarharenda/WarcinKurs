package a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("napis");
        showLength(null);
    }

    static void showLength(String s) {
        if (s==null) System.out.println("wartość Stringa nie może być null");
        else System.out.println(s.length());
    }
//wyjątek był niekontrolowany, program się kompilował
}
