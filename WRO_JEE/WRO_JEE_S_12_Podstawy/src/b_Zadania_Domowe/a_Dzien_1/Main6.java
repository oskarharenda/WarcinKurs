package b_Zadania_Domowe.a_Dzien_1;


public class Main6 {

    public static void main(String[] args) {
        int tablica[][] = {{1,2,3,4},{4,5,6,4}};

        System.out.println(oddSum(tablica));


    }
    static int oddSum(int[][] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if((j % 2) != 0 ) sum += arr[i][j];
                System.out.println("j: "+j);
                System.out.println("suma: "+sum);
            }
        }
        return sum;
    }
}
