package exam;

public class Main2 {
    public static void main (String[] args){
        System.out.println(shorten("Oskar",2));
    }
    public static String shorten(String str, int length){
        char[] charArray = str.toCharArray();
        String shortWord = "";
        for (int i=0; i<length; i++){
            shortWord+=charArray[i];
        }
        return shortWord;
    }

}
