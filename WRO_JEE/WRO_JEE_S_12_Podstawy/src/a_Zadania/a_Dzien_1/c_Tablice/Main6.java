package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Random;

public class Main6 {

    public static void main(String[] args) {
        int size=10;
        int[] tab1 = new int[size];
        for (int i=0; i<tab1.length; i++){
            Random r = new Random();
            tab1[i]= r.nextInt(101);
            System.out.print(" "+tab1[i]);
        }
        System.out.println();

        int[] tab2 = new int[size];
        for (int i=0; i<tab1.length; i++){
            Random r = new Random();
            tab2[i]= r.nextInt(101);
            System.out.print(" "+tab2[i]);
        }
        System.out.println();

        int[] tab3 = new int[size];
        for (int i=0; i<tab1.length; i++){

            tab3[i]= tab1[i]+tab2[i];
            System.out.print(" "+tab3[i]);
        }
        System.out.println();



    }
}
