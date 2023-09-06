package b_Zadania_Domowe.a_Dzien_2;


public class Main4 {

    public static void main(String[] args) {
        String napis="xxxfdfgrreeedr";
        int result=tripple(napis);
        System.out.println(result);


    }
    static int tripple(String str) {
        int counter = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length()-2; i++) {
            if (charArray[i] == charArray[i + 1] && charArray[i + 1] == charArray[i + 2]) counter++;
        }
        return counter;
    }
}
