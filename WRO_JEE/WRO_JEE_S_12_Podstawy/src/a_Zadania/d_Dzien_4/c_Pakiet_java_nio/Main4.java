package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) throws IOException {

        writeToFile("textMain4.txt");
    }
    static void writeToFile(String fileName) throws IOException {
        Path fileNamePath = Paths.get(fileName);
        if (Files.notExists(fileNamePath)){
            Files.createFile(fileNamePath);
        }

        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(fileName);
        System.out.println("Ty pisz, a ja będę przepisywał...");
        String line;
        while (!(line = scanner.nextLine()).equals("quit")) {
            writer.println(line);
        }
        writer.close();
    }
}
