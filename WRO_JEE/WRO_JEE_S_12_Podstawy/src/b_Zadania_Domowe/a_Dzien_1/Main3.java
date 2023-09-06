package b_Zadania_Domowe.a_Dzien_1;


public class Main3 {

    public static void main(String[] args) {
        int[][] task3Array = { { 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };
        int[] result= new int [task3Array.length];
        result=minimum(task3Array);
        for (int i=0; i<result.length; i++){
            System.out.print(" "+result[i]);
        }

    }
    static int[] minimum(int[][] arr){
        int[] tabMin=new int[arr.length];
        int k=0;
        for(int i=0; i<arr.length; i++){
            int min=arr[i][0];
            for(int j=0; j<arr[i].length; j++){
                if (arr[i][j]<min) min=arr[i][j];
            }
            tabMin[k]=min;
            k++;
        }
        return(tabMin);
    }

}