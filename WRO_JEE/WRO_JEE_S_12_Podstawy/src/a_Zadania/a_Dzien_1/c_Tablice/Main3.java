package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[] tab= new int[10];
        Arrays.fill(tab, 2);
        for (int i=0; i<tab.length; i++) {
            System.out.print(" " + tab[i]);
        }
    }
}
