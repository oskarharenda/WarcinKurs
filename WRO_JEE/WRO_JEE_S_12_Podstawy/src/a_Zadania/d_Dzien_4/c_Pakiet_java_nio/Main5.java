package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        File file = new File("Main1.txt");
        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line=scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
