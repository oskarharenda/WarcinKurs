package a_Zadania.a_Dzien_1.b_Metody;


public class Main1 {

    public static void main(String[] args) {
        int a=8;
        int b=9;
        int result = multiply(a,b);
        System.out.println(result);
    }
    static int multiply(int multiplier, int index){
        int result = multiplier*index;
        return result;
    }
}
