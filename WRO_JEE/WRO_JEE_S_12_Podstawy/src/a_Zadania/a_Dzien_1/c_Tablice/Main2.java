package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        int x=20; //liczba losowych liczb w tablicy
        int[] tab1=tworzenieTablicy(x);
        for (int i=0; i<20; i++){
            System.out.print(" "+tab1[i]);
        }
        int result =minFromTab(tab1);
        System.out.println("NAjmniejsza: "+result);

    }
    static int[] tworzenieTablicy(int size){
        int[] array=new int[size];
        for(int i=0; i<size; i++){
            Random r = new Random();
            array[i]= r.nextInt(101);
        }
        return array;
   }
    static int minFromTab(int[] array){
        int min=array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]<min) min=array[i];
        }
        return min;
    }
}
