package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main4 {

    public static void main(String[] args) throws FileNotFoundException {
        String napis;
        File file = new File("text1.txt");
        Scanner scan = new Scanner(file);
        //StringBuilder reader = new StringBuilder();

        while (scan.hasNextLine()) {
            napis=scan.nextLine();
           if (isWordInLine(napis,"Javy")){
               System.out.println(napis);
           }

        }
      //  System.out.println(reader);
    }

    static boolean isWordInLine(String text, String word) {
        word = word.toLowerCase();
        StringTokenizer strToken = new StringTokenizer(text," ,");
        while (strToken.hasMoreTokens()) {
            String s = strToken.nextToken();
            String lowerText = s.toLowerCase();
            if (lowerText.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
