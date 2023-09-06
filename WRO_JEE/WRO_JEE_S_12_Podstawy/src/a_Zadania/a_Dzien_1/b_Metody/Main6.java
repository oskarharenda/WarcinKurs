package a_Zadania.a_Dzien_1.b_Metody;


public class Main6 {

    public static void main(String[] args) {
        int wiek=18;
        boolean result=checkMaturity(wiek);
        System.out.println(result);
    }
    static boolean checkMaturity(int age){
        if(age<18) return false;
        else return true;
    }
}
