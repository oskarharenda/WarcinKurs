package b_Zadania_Domowe.a_Dzien_2;

public class Main6 {

    public static void main(String[] args) {
        String napis="Ania i Oskar";
        String przed="Oskar";
        String po="Kuba";

        String result = replaceStr(napis,przed,po);
        System.out.println(result);

    }
    static String replaceStr(String str, String forReplace, String replacement){
        String replaceAllText = str.replaceAll(forReplace,replacement);
        return replaceAllText;
    }

}
