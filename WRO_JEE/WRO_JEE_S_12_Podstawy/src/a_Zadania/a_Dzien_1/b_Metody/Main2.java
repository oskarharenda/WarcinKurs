package a_Zadania.a_Dzien_1.b_Metody;


public class Main2 {
    public static void main(String[] args) {
        int number = 9;
        int result = square(number);
        System.out.println(result);
    }

    static int square(int number) {
        int square = number * number;
        return square;
    }
}
