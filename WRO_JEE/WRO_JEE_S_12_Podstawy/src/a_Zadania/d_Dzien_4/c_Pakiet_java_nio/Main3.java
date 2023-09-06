package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {

    public static void main(String[] args) throws IOException {
        String myHome="/home/oskar/Pulpit";
        String fromCopy="Każdy wyjątek w języku Java dziedziczy po klasie Throwable.txt";
        String toCopy="2Każdy wyjątek w języku Java dziedziczy po klasie Throwable.txt";

        copyFile(myHome,fromCopy,toCopy);


    }
    static void copyFile(String directory, String fileName, String secondFileName) throws IOException {
        //Path directoryPath = Paths.get(directory);
        Path fileNamePath = Paths.get(directory,fileName);
        Path secondFileNamePath = Paths.get(directory,secondFileName);
        if(Files.exists(fileNamePath)){
            Files.copy(fileNamePath,secondFileNamePath);
        }
    }


}
