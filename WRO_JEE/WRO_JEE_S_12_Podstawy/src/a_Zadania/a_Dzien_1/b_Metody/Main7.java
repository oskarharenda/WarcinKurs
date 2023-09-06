package a_Zadania.a_Dzien_1.b_Metody;


public class Main7 {

    public static void main(String[] args) {
        int liczba=11;
        String result=checkEvenOdd(liczba);
        System.out.println(result);
    }
    static String checkEvenOdd(int number){
        if (number%2==0) return "even";
        else return "Odd";
    }
}
