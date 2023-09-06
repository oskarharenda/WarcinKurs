package exam;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main8 {
    public static void main (String[] args) throws IOException {
        create(60);

    }

    public static void create(int max) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę uczestników kursu: ");
        int number = scanner.nextInt();
        for (int i=0; i<number; i++){
            try {
                scanner = new Scanner(System.in);
                FileWriter fileWriter = new FileWriter("exam.txt", true);
                PrintWriter writer = new PrintWriter(fileWriter);
                System.out.println("Podaj login Github: ");
                String line;
                line = scanner.nextLine()+" ";
                writer.print(line);
                System.out.println("Podaj liczbe punktów: ");
                line = scanner.nextLine();
                writer.println(line);
                writer.close();
            } catch (FileNotFoundException fnfe) {
                System.err.println(fnfe.getMessage());
            } catch (IOException e) {
                System.err.println("Grubo niedziała");
            }
        }


        File file = new File("exam.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String str = scan.nextLine();;
            StringTokenizer strToken = new StringTokenizer(str);
            String s ="";
            while (strToken.hasMoreTokens()) {
                s = strToken.nextToken();
            }
            int pkt = Integer.parseInt(s);
            FileWriter fileWriter = new FileWriter("ExamPassed.txt", true);
            PrintWriter writer = new PrintWriter(fileWriter);
            System.out.println("pkt: "+pkt);
            if(pkt>=max){
                writer.println(str);
                writer.close();
            }

        }

    }
}
