package a_Zadania.a_Dzien_1.b_Metody;


public class Main9 {
    static int factorial(int n){
        int result = 1;
        for (int i = n; i>0; i--){
            result = result*i;
        }
        return result;
    }
}
