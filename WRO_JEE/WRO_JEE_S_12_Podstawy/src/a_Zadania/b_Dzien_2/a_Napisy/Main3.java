package a_Zadania.b_Dzien_2.a_Napisy;

public class Main3 {

    public static void main(String[] args) {
        String napis="coderslab";
        String polowaNapisu=firstHalf(napis);
        System.out.println(polowaNapisu);
    }

    static String firstHalf(String str){
        int dlugosc = str.length();
        String fHalf = str.substring(0,dlugosc/2);
        return fHalf;
    }
}
