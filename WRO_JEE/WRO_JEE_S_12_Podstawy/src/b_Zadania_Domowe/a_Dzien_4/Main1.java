package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        int sign=downloadText("Main.txt").length();
        System.out.println(sign);

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
