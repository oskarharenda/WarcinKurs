package exam;

import java.util.Random;

public class Main3 {
    public static void main (String[] args){
        int[] tab = div(10,5);
        for (int i=0; i<tab.length; i++ ){
            System.out.println(tab[i]);
        }



    }

    public static int[] div(int size, int interval){
        int tab[] = new int [size];
        Random r = new Random();
        for (int i=0; i<tab.length; i++) {
            tab[i]=r.nextInt(interval)+1;
            if (tab[i]%2==0 || tab[i]%3==0) i--;
        }
        return tab;
    }
}
