package pl.coderslab.eparametrystartowe;

public class Main06 {

    public static void main(String[] args) {
        int wynik;
        int n = Integer.parseInt(args[0]);
        for (int i=1; i<=n;i++){
            System.out.println();
            for(int j=1; j<=n; j++){
                wynik=i*j;
                System.out.println(i+" x "+j+" = "+wynik);
            }
        }
    }

}
