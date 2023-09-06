package a_Zadania.b_Dzien_2.a_Napisy;

public class Main7 {

    public static void main(String[] args) {

    String str = "A to kanapa pana kota";
    boolean czyPalindrom=palidrom(str);
    System.out.println(czyPalindrom);

    }
    static boolean palidrom(String str){
        System.out.println(str);
        str = str.replaceAll(" ","");
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);

        char[] charArray = str.toCharArray();
        char[] charArray2 = new char[charArray.length];
        for(int i=0; i<charArray.length; i++){
            charArray2[i]=charArray[charArray.length-1-i];
        }
        for(int i=0; i<charArray.length; i++){
            if (charArray[i]!=charArray2[i]) return false;
        }
        return true;
    }

}
