package a_Zadania.a_Dzien_1.b_Metody;


public class Main9 {

    public static void main(String[] args) {
        int n=5;
        int result=factorial(n);
        System.out.println(result);
    }
    static int factorial(int n){
        int wynik=1;
        for(int i=n; i>1; i--){
            wynik*=i;
        }
        return wynik;
    }
}
