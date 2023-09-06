package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main3 {

    public static void main(String[] args) {
        //download();//pobierea nazwę pliku i wczytuje dane
        //System.out.println(download());
        creatingTab();
    }

    static String download(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres poliku");
        String file1 = scanner.nextLine(); //lokalizacja naszego pliku
        File file = new File(file1);
        StringBuilder reading = new StringBuilder();

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                reading.append(scan.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }

        String text = reading.toString();
        return text;

    }

    static void creatingTab(){
        String text = download();
        System.out.println(text);
        Scanner scan = new Scanner(text);
        int iLines=0;
        while (scan.hasNextLine()){
            iLines++;
        }
        System.out.println("Tu działa");
        String[] retierment=new String[iLines];//linie textu
        int iRetierment =0;
        StringTokenizer strToken = new StringTokenizer(text);
        String[] s = new String[4];
        while (strToken.hasMoreTokens()) {
            for (int i =0; i<s.length; i++){
                s[i] = strToken.nextToken();
                System.out.println(s);
            }
            if(s[3].equals("M") && Integer.parseInt(s[2])>=1953){
                retierment[iRetierment]=s[0+iRetierment];
                retierment[iRetierment+1]=s[1+iRetierment];

            }
        }
    }
}
