package pl.coderslab.eparametrystartowe;

public class Main07 {

    public static void main(String[] args) {
        int wynik=1;
        int n = Integer.parseInt(args[0]);
        int j=1;
        while(j<=n){
            wynik*=j;
            j++;
        }
        System.out.println(wynik);
        wynik=1;
        for (int i=1; i<=n; i++){
            wynik*=i;
        }
        System.out.println(wynik);
    }

}
