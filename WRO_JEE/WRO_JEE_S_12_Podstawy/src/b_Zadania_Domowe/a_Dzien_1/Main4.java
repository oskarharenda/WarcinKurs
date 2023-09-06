package b_Zadania_Domowe.a_Dzien_1;


public class Main4 {

    public static void main(String[] args) {
        int[][] task3Array = { { 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };
        int[] result=lessMore(task3Array);
        for (int i=0; i<result.length; i++){
            System.out.print(" "+result[i]);
        }

    }
    static int[] lessMore(int[][] arr){
        int suma=0;
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                suma+=arr[i][j];
                k++;
            }
        }
        double srednia=suma/k;
        System.out.println(srednia);
        int less=0;
        int more=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]<=srednia) less++;
                if(arr[i][j]>srednia) more++;
                System.out.println("wartość: "+arr[i][j]+", mniejsza "+less+", wieksza "+more+", średnia: "+srednia);
                //wyswietlsmy przy jakiej wartościz tabeli zwiększa się licznik mniejszych a przy jakiej większych
            }
        }
        System.out.println(k);

        int[] tablica=new int[2];
        tablica[0]=less;
        tablica[1]=more;
        return(tablica);
    }

}