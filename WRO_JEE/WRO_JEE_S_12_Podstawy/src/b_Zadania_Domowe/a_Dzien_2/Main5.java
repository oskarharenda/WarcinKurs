package b_Zadania_Domowe.a_Dzien_2;


public class Main5 {

    public static void main(String[] args) {
        String napis="Oskar i Patrycja_Wójtowicz";
        char przed = 'i';
        char po = 'z';

        String result = replaceChar(napis,przed,po);
        System.out.println(result);



    }
    static String replaceChar(String str, char forReplace, char replacement){
        String forReplaceChar=Character.toString(forReplace);
        String sreplacementChar=Character.toString(replacement);
        String replaceAllText = str.replaceAll(forReplaceChar,sreplacementChar);
        return replaceAllText;
    }

}
