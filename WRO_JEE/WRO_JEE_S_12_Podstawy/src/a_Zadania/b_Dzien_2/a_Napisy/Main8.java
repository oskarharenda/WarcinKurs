package a_Zadania.b_Dzien_2.a_Napisy;

public class Main8 {

    public static void main(String[] args) {
        String slowo="TaK";
        String result=toggleChar(slowo);
        System.out.println(result);
    }

    static String toggleChar(String str) {
        char[] tab=new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i=0; i<charArray.length; i++){
            if (Character.isUpperCase(charArray[i])) tab[i]=Character.toLowerCase(charArray[i]);
            if (Character.isLowerCase(charArray[i])) tab[i]=Character.toUpperCase(charArray[i]);
        }
        String newOne = new String(tab);
        return newOne;
    }
}
