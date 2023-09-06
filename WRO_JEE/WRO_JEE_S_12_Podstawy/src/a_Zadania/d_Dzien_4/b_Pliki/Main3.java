package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Double.doubleToLongBits;
import static java.lang.Double.parseDouble;

public class Main3 {

    public static void main(String[] args) {
        File file = new File("Main.txt");
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
        String napis = reader.toString();
        System.out.println(sumFromString(napis));


    }
    static double sumFromString(String numbers){
        StringTokenizer strToken = new StringTokenizer(numbers,",\n ");
        double sum=0;

        while (strToken.hasMoreTokens()) {
            String s = strToken.nextToken();
            try {
                double d = Double.parseDouble(s);
                sum+=d;

            }
            catch (NumberFormatException e){

            }
        }

        return sum;
    }
}
