package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter("Main1.txt", true);
            // Dekorator
            PrintWriter writer = new PrintWriter(fileWriter);
            System.out.println("Ty pisz, a ja będę przepisywał...");
            String line;
            while (!(line = scanner.nextLine()).equals("quit")) {
                writer.println(line);
            }
            writer.close();
        } catch (FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        } catch (IOException e) {
            System.err.println("Grubo niedziała");
        }
    }
}