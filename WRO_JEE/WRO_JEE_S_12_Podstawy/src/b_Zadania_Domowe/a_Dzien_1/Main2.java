package b_Zadania_Domowe.a_Dzien_1;


public class Main2 {

    public static void main(String[] args) {
        int x=10;
        int y=6;
        boolean result=divisibleBy(x,y);
        System.out.println(result);
    }
    static boolean divisibleBy(int a, int b ){
        if (a%b==0) return true;
        else return false;
    }

}
