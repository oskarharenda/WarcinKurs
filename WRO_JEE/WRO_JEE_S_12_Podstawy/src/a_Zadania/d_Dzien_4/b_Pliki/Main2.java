package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        File file = new File("Main1.txt");
        StringBuilder reader = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                reader.append(scanner.nextLine() + "\n");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(reader);
        //String napis = reader.toString();
    }
}
