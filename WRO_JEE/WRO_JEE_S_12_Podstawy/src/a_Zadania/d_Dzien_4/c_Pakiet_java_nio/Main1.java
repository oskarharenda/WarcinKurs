package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        String dirName = "nio.nio";
        createDirectery(dirName);
    }

    private static void createDirectery(String fileName) throws IOException {
        Path filePAth = Paths.get(fileName);
        if (Files.notExists(filePAth)){
            Files.createDirectories(filePAth);

        }

    }


}
