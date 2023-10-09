package a_Zadania.a_Dzien_1.b_Metody;


public class Main1 {
    public static void main(String[] args) {
        int index = 2, multipler = 3;
        int result = multiply(index, multipler);
        System.out.println(result);
        Main6 pelnoletnosc = new Main6();
        System.out.println(pelnoletnosc.checkMaturity(25));
        Main7 oddoreven = new Main7();
        System.out.println(oddoreven.checkEvenOdd(5));
        Main8 wieksze = new Main8();
        System.out.println(wieksze.maxOfThree(22222222,123,12455));
        Main9 silnia = new Main9();
        System.out.println(silnia.factorial(5));
    }
    static int multiply(int multipler, int index){
        return index*multipler;
        }

}

