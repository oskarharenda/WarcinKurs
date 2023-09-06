package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {

    public static void main(String[] args) throws IOException {
        String dirNAme = "plik";
        createFile(dirNAme);

    }
    static void createFile (String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        if(Files.notExists(filePath)){
            Files.createFile(filePath);
        }
    }
}
