package b_Zadania_Domowe.a_Dzien_1;


public class Main5 {

    public static void main(String[] args) {
        int[] tablica={3,2,1};
        int[] tablica2;
        tablica2=append(tablica);
        for (int i=0; i<tablica2.length; i++){
            System.out.println(tablica2[i]);
        }
    }
    static int[] append(int[] arr){
        int[] arr2=new int[2*arr.length];
        for(int i =0; i<arr.length; i++){
            arr2[i]=arr[i];
        }
        int j=0;
        for (int i=arr.length-1; i>=0; i--){
            arr2[i+arr.length]=arr[j];
            j++;
        }
        return arr2;
    }

}
