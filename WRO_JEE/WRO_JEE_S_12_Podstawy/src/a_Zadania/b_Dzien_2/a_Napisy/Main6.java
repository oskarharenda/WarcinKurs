package a_Zadania.b_Dzien_2.a_Napisy;

public class Main6 {

    public static void main(String[] args) {

    String str = "codersLabxyz";

    String result=backWord(str);
    System.out.println(result);

    }
    static String backWord(String word){
        char[] charArray = word.toCharArray();
        char[] charArray2 = new char[charArray.length];
        int dlugosc=charArray.length;
        for(int i=0; i<charArray.length; i++){
            charArray2[i]=charArray[charArray.length-1-i];
        }
        String newOne = new String(charArray2);
        return  newOne;
    }

}
