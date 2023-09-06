package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) {

        String text=downloadText("Main1.txt");
        StringTokenizer strToken = new StringTokenizer(text);
        int i=0;
        while (strToken.hasMoreTokens()) {
            strToken.nextToken();
            i++;
        }
        System.out.println(i);

    }

    private static String  downloadText(String file) {
        File file2 = new File(file);
        StringBuilder reader = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file2);
            while (scanner.hasNextLine()) {
                reader.append(scanner.nextLine() + "\n");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String allText = reader.toString();
        return allText;
    }


}
