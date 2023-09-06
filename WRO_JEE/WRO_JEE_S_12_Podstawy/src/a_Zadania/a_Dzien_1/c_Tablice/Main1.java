package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        int[] numbers = crateNumbers(50);
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]%10==0 && i>0){
                System.out.println();
            }
            if(numbers[i]<10){
                System.out.print(" "+"0"+numbers[i]+",");
            } else System.out.print(" "+numbers[i]+",");
        }
    }
    static int[] crateNumbers(int size){
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            array[i]=i;
        }
        return array;
    }
}
