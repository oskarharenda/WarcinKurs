package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Random;

public class Main4 {

    public static void main(String[] args) {
        int size=10;
        int[] numbers = new int[size];
        for (int i=0; i<numbers.length; i++){
            Random r = new Random();
            numbers[i]= r.nextInt(101);
            System.out.print(" "+numbers[i]);
        }
        int[] reverse = new int[size];
        for(int i=0; i<reverse.length; i++){

                reverse[9-i]=numbers[i];
        }
        System.out.println();
        System.out.println("odwrotnie:");
        for( int i=0; i<reverse.length; i++){
            System.out.print(" "+reverse[i]);
        }

    }
}
