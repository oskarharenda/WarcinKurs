package b_Zadania_Domowe.a_Dzien_3;


import java.util.NoSuchElementException;

public class Main5 {

    public static void main(String[] args) {
        int [] tab = {1,2,3,4,5,6,7,8,9,10};
        try {
            System.out.println(indexOf(tab,2));
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
    static int indexOf(int[] elements, int value) {
        int a = -1; // zmienna do której przypiszemy nr indeksu jeżeli będzize identyczny

        for (int i = 0; i < elements.length; i++) {
            if (value == elements[i]) {
                a = i;
                return a;
            }
        }
        throw new NoSuchElementException("nie ma iakiekiej zawartości w tabeli");
        // throw new zamiast return
    }
}
