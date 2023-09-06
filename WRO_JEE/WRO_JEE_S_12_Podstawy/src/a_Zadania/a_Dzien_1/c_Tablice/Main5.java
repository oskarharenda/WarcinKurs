package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;
import java.util.Random;

public class Main5 {

    public static void main(String[] args) {
        int size=10;
        int[] numbers = new int[size];
        for (int i=0; i<numbers.length; i++){
            Random r = new Random();
            numbers[i]= r.nextInt(101);
            System.out.print(" "+numbers[i]);
        }
        System.out.println();
        System.out.println("Posortowane: ");
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(" "+numbers[i]);
        }
        

    }
}
