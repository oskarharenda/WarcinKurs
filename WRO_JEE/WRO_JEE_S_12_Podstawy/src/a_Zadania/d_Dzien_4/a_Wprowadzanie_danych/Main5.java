package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        textLines();
    }
    static void textLines(){
        Scanner scanner = new Scanner(System.in);
        String line;
        StringBuilder sbLoop = new StringBuilder();
        while (true){
            line = scanner.nextLine();
            if (line.equals("quit")) break;
            else sbLoop.append(line).append('\n');
        }
        System.out.println(sbLoop.toString());
    }
}
