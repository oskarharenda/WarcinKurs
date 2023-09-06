package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) throws IOException {
        String plik1 = "Main1.txt";
        String plik2 = "Main22.txt";
        String plik3 = "/home/oskar/Pulpit/codersLab/WRO_JEE_S_12_Podstawy";
        copyFile(plik3,plik2,plik1);
        pastehtml(plik2);
        reading(plik1,plik2);
        pastehtml(plik2);

    }
    static void copyFile(String directory, String fileName, String secondFileName) throws IOException {
        //Path directoryPath = Paths.get(directory);
        Path fileNamePath = Paths.get(directory,fileName);
        Path secondFileNamePath = Paths.get(directory,secondFileName);
        if(Files.exists(fileNamePath)){
            Files.copy(fileNamePath,secondFileNamePath);
        }
    }


    private static void reading(String fileName, String fileName2) throws IOException {
        File file = new File(fileName);
        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line=scanner.nextLine();
                paste (line,fileName2);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void paste (String line, String nameFile) throws IOException {

        String joinText = String.join(" ","<p>",line,"</p>");
        FileWriter fileWriter = new FileWriter(nameFile, true);
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.println(joinText);

        writer.close();

    }
    static void pastehtml (String nameFile) throws IOException {

        FileWriter fileWriter = new FileWriter(nameFile, true);
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.println("<html>");

        writer.close();

    }
}
