package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


public class Main3 {

    public static void main(String[] args) {
        String test="to jest tekst do";
        int result=countTokens(test);
        System.out.println(result);

    }
    static int countTokens(String str){
        String[] parts = str.split(" ");
        return parts.length;
    }

}